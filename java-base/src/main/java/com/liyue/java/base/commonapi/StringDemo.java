package com.liyue.java.base.commonapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by admin on 2017/5/21.
 */
public class StringDemo {
    private static final Logger logger = LoggerFactory.getLogger(StringDemo.class);

    public static void main(String[] args){
        String a ="a";
        String b ="b";
        String c = "ab";
        String h = "a"+"b";
        String d = a+b;
        String e = new String("ab");
        String f = new StringBuffer("a").append("b").toString();

        logger.info("c==d ? {}" ,c==d);//false
        logger.info("c==e ? {}",c==e);//false
        logger.info("c==f ? {}" ,c==f);//false
        logger.info("d==e ? {}", d==e);//false
        logger.info("e==f ? {}", e==f);//false

        logger.info("c==h ? {}",c==h );//true

    }
}
