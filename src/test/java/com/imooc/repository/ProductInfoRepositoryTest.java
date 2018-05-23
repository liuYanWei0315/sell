package com.imooc.repository;

import com.imooc.entity.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author liuyw
 * @date 2018/5/22 16:22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void save(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1");
        productInfo.setProductName("篮球");
        productInfo.setProductPrice(new BigDecimal(199.99));
        productInfo.setProductStock(18);
        productInfo.setProductDescription("纯皮的，贼好用");
        productInfo.setProductIcon("www.baidu.com");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(1);
        ProductInfo result = repository.save(productInfo);
        System.out.println(result.toString());
    }

    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        for (ProductInfo productInfo : productInfoList) {
            System.out.println(productInfo.toString());
        }

    }

}