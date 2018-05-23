package com.imooc.service.impl;

import com.imooc.entity.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author liuyw
 * @date 2018/5/22 17:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productService.findOne("1");
        System.out.println(productInfo.toString());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> productInfoList = productService.findUpAll();
        for(ProductInfo productInfo : productInfoList){
            System.out.println(productInfo.toString());
        }
    }

    @Test
    public void findAll() throws Exception {
        PageRequest request = new PageRequest(0, 2);
        Page<ProductInfo> page = productService.findAll(request);
        System.out.println(page.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("2");
        productInfo.setProductName("球鞋");
        productInfo.setProductPrice(new BigDecimal(1999));
        productInfo.setProductStock(12);
        productInfo.setProductDescription("限量的，贼牛逼");
        productInfo.setProductIcon("www.hupu.com");
        productInfo.setProductStatus(1);
        productInfo.setCategoryType(2);
        ProductInfo result = productService.save(productInfo);
        System.out.println(result);
    }

}