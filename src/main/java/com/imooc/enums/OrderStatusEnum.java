package com.imooc.enums;

import lombok.Getter;

/**
 * 订单枚举
 * @author liuyw
 * @date 2018/5/24 14:49
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完成订单"),
    CANCEL(2, "取消订单")
    ;

    private Integer code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
