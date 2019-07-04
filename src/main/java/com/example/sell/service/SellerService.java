package com.example.sell.service;

import com.example.sell.dataobject.SellerInfo;

/**
 * 卖家端
 * Created by 廖师兄
 * 2017-07-29 23:14
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param username,password
     * @return
     */
    SellerInfo findSellerInfoBySeller(String username,String password);
}
