package com.imooc.service;

import com.imooc.entity.ProductCategory;

import java.util.List;

/**
 * 商品类目
 * @author liuyw
 * @date 2018/5/22 15:11
 */

public interface CategoryService {

    //通过id查询商品类目
    ProductCategory findOne(Integer categoryId);

    //查询全部商品类目
    List<ProductCategory> findAll();

    //更新和添加商品类目
    ProductCategory save(ProductCategory productCategory);

    //用户查询商品类目
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
