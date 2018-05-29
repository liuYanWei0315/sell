package com.imooc.vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author liuyw
 * @date 2018/5/23 9:38
 */
@Data
public class ResultVo<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回内容
     */
    private T data;
}
