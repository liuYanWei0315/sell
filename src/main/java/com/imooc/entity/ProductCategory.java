package com.imooc.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 商品类目实体类
 * @author liuyw
 * @date 2018/5/22 14:24
 */


@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /**
     * 商品Id
     */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**
     * 类目名称
     */
    private String categoryName;

    /**
     *类目类型
     */
    private Integer categoryType;

    /**
     *创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public ProductCategory(){

    }

    public ProductCategory(String categoryName, Integer categoryType){
        super();
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

}
