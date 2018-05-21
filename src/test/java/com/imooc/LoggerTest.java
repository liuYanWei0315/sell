package com.imooc;

import com.imooc.sell.SellApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liuyw
 * @date 2018/5/21 11:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SellApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class LoggerTest {

//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        String name = "Frank";
        Integer password = 123456;
        log.debug("...");
        log.info("name: {}, password: {}", name, password);
        log.error("error...");
        log.warn("lalal...");
    }

}
