package com.imooc.service;

import com.imooc.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品信息
 * @author liuyw
 * @date 2018/5/22 17:04
 */
public interface ProductService {
    /**
     * 通过ID查找商品
     * @param productId
     * @return
     */
    ProductInfo findOne(String productId);

    /**
     * 查询在售商品
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有商品
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 新增和更新商品
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

}
