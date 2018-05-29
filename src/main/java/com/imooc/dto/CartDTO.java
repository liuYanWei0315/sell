package com.imooc.dto;

import lombok.Data;

/**
 * @author liuyw
 * @date 2018/5/25 16:33
 */
@Data
public class CartDTO {

    /**
     * 商品ID
     */
    private String productId;
    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
