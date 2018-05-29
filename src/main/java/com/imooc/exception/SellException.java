package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @author liuyw
 * @date 2018/5/25 14:38
 */
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
