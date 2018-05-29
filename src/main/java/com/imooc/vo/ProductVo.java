package com.imooc.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品（包含类目）
 * @author liuyw
 * @date 2018/5/23 10:03
 */
@Data
public class ProductVo {

    /**
     *商品类目名称
     */
    @JsonProperty("name")
    private String categoryName;

    /**
     *商品类型
     */
    @JsonProperty("type")
    private Integer categoryType;

    /**
     * 商品list
     */
    @JsonProperty("foods")
    private List<ProductInfoVo> productInfoVoList;

}
