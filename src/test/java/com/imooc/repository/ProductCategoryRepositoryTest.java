package com.imooc.repository;

import com.imooc.entity.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author liuyw
 * @date 2018/5/22 14:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest(){


    }

    @Test
    public void saveTest(){
//        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryName("篮球鞋");
//        productCategory.setCategoryType(1);
        ProductCategory productCategory = productCategoryRepository.findOne(1);
        productCategory.setCategoryName("11111");
        productCategoryRepository.save(productCategory);
    }

}