package com.imooc.utils;

import java.util.Random;

/**
 * @author liuyw
 * @date 2018/5/25 15:38
 */
public class KeyUtils {

    /**
     *生成唯一的主键
     * 时间+随机数
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
