package com.imooc.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liuyw
 * @date 2018/5/24 15:12
 */
@Entity
@Data
@DynamicUpdate
public class OrderDetail {

    /**
     *id
     */
    @Id
    private String detailId;

    /**
     *订单id
     */
    private String orderId;

    /**
     *商品id
     */
    private String productId;

    /**
     *商品名称
     */
    private String productName;

    /**
     *当前价格,单位分
     */
    private BigDecimal productPrice;

    /**
     *数量
     */
    private Integer productQuantity;

    /**
     *小图
     */
    private String productIcon;

    /**
     *创建时间
     */
    private Date createTime;

    /**
     *修改时间
     */
    private Date updateTime;
}
