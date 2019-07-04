package com.example.sell.enums;

import lombok.Getter;

/**
 * OrderStatusEnum
 * author Administrator
 * Date 2019/5/218:46
 */
@Getter
public enum  OrderStatusEnum implements CodeEnum{
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消"),
    ;
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
