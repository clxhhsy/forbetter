/**
 * Project Name:forbetter-parent
 * <p>
 * File Name:DubboProvider
 * <p>
 * Package Name:com.forbetter.user.service
 * <p>
 * Date:2016/10/1 11:31
 * <p>
 * Copyright (c) 2016, clxhhsy@126.com All Rights Reserved.
 */
package com.forbetter.user.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * ClassName: DubboProvider <br/>
 *
 * date: 2016/10/1 11:31 <br/>
 *
 * @author lichen
 * @version 1.0
 * @since JDK 1.6
 */
public class DubboProvider
{
    private static final Logger logger = LogManager.getLogger(DubboProvider.class.getName());

    public static void main(String[] args)
    {
        try
        {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "classpath:spring/app-context.xml");
            ctx.start();
        }
        catch (Exception e)
        {
            logger.error("DubboProvider context start error:{}", e.getMessage());
        }
        synchronized (DubboProvider.class) {
            while (true) {
                try {
                    DubboProvider.class.wait();
                } catch (InterruptedException e) {
                    logger.error("== synchronized error:",e);
                }
            }
        }
    }
}
