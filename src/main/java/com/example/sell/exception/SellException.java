package com.example.sell.exception;

import com.example.sell.enums.ResultEnum;
import lombok.Getter;

/**
 * SellException
 * author Administrator
 * Date 2019/5/220:37
 */
@Getter
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
