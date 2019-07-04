package com.example.sell.dto;

import lombok.Data;

/**
 * CartDTO
 * author Administrator
 * Date 2019/5/221:01
 */
@Data
public class CartDTO {

    private String productId;
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
