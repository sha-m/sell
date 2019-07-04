package com.example.sell.service;

/**
 * SecKillService
 * author Administrator
 * Date 2019/6/15 10:59
 */
public interface SecKillService {

    String querySecKillProductInfo(String productId);

    void orderProductMockDiffUser(String productId);
}
