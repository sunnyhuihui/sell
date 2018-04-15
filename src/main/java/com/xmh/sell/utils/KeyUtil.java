package com.xmh.sell.utils;

import java.util.Random;
import java.util.UUID;

/**
 * @author Ming
 * @create 2018-04-14 下午2:21
 **/
public class KeyUtil {

    /**
     * UUID
     */
    public static String getUUID32(){
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }


    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
