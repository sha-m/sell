package com.example.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * author Administrator
 * Date 2019/5/215:43
 */
@Getter
public enum  ProductStatusEnum implements CodeEnum{
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
