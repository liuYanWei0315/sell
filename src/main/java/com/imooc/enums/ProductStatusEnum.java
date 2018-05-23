package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author liuyw
 * @date 2018/5/22 17:19
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在售"),
    DOWN(1, "下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
