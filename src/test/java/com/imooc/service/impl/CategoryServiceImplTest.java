package com.imooc.service.impl;

import com.imooc.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author liuyw
 * @date 2018/5/22 15:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;
    @Test
    public void findOne() throws Exception {
        ProductCategory productCategory = categoryService.findOne(2);
        Assert.assertEquals(new Integer(2), productCategory.getCategoryId());
        System.out.println(productCategory.toString());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> result = categoryService.findAll();
        Assert.assertNotEquals(0, result.size());

    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory("乒乓球", 2);
        categoryService.save(productCategory);
        System.out.println(productCategory.toString());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> result = categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3,4));
        for (ProductCategory productCategory : result) {
            System.out.println(productCategory.toString());
        }
    }

}