package com.example.sell.utils;

import java.util.Random;

/**
 * KeyUtil
 * author Administrator
 * Date 2019/5/220:51
 */
public class KeyUtil {

    /**
     * @return java.lang.String
     * @Author sham
     * @Description 生成唯一的主键 时间+随机数
     * @Date 20:53 2019/5/2
     * @Param []
     **/
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
