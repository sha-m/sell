package com.example.sell.service.impl;

import com.example.sell.exception.SellException;
import com.example.sell.service.RedisLock;
import com.example.sell.service.SecKillService;
import com.example.sell.utils.KeyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * SecKillServiceImpl
 * author Administrator
 * Date 2019/6/15 11:01
 */
/**100个请求，10个线程，
 * ./ab -n 100 -c 10 http://localhost/sell/skill/order/123456
 * 击穿测试样例
 * ./ab -n 12000 -c 10000 http://localhost/sell/skill/order/123456
*/
@Service
public class SecKillServiceImpl implements SecKillService {

    private static final int TIMEOUT = 10 * 1000;//超时时间10s

    @Autowired
    private RedisLock redisLock;
    /**
     * 国庆获得，皮蛋粥特价，限量1000000份
     */
    static Map<String, Integer> products;
    static Map<String, Integer> stock;
    static Map<String, String> orders;

    static {
        /**
         * 模拟多个表，商品信息，库存表，秒杀成功订单表
         */
        products = new HashMap<>();
        stock = new HashMap<>();
        orders = new HashMap<>();
        products.put("123456", 1000000);
        stock.put("123456", 1000000);
    }

    @Override
    public String querySecKillProductInfo(String productId) {
        return "国庆活动，皮蛋粥特价，限量" + products.get(productId) + "还剩：" + stock.get(productId) + "份 该商品成功下单用户数目：" + orders.size();
    }

    @Override
    public void orderProductMockDiffUser(String productId) {
        //加锁
        long time = System.currentTimeMillis() + TIMEOUT;
        if (redisLock.lock(productId, String.valueOf(time))) {
            throw new SellException(101, "哎呦，人太多了，换个姿势再试试~");
        }

        //1.查询该商品库存，为0则活动结束
        int stockNum = stock.get(productId);
        if (stockNum == 0) {
            throw new SellException(100, "活动结束");
        } else {
            //2.下单（模拟不同用户openid不同）
            orders.put(KeyUtil.genUniqueKey(), productId);
            //3.减库存
            stockNum = stockNum - 1;
            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            stock.put(productId, stockNum);
        }
        //解锁
        redisLock.unlock(productId, String.valueOf(time));
    }
}
