package com.example.sell.VO;

import lombok.Data;

import java.io.Serializable;

/**
 * http请求返回的最外层对象
 * author Administrator
 * Date 2019/5/216:09
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -6943784269775798735L;
    /** 错误码*/
    private Integer code;
    /** 提示信息*/
    private String msg;
    /** 具体内容*/
    private T data;
}
