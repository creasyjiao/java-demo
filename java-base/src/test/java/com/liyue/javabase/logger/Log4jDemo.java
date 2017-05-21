package com.liyue.javabase.logger;

import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by admin on 2017/5/21.
 *  junit test 输出顺序 beforeClass -> before -> test1 -> after  -> before -> test2  -> after -> afterClass
 */
public class Log4jDemo {
    private final static Logger logger = LoggerFactory.getLogger(Log4jDemo.class);

    @BeforeClass
    public static void beforeClass(){
        logger.info("beforeClass...");
    }

    @AfterClass
    public static  void afterClass(){
        logger.info("afterClass...");
    }

    @Before
    public void before(){
        logger.info("before...");
    }

    @After
    public void after(){
        logger.info("after...");
    }

    @Test
    public void fun(){
        logger.info("logger的级别  all < trace <debug < info < warn  < error < fatal <off ");
        logger.debug("debug={}","debug msg");
        logger.info("info={}","info msg");
        logger.warn("warn={}","warn msg");
        logger.error("error={}","error msg");
        logger.trace("trace={}","trace msg");
    }

    @Test
    public void fun2(){
        logger.info("fun2.....");
    }

}
