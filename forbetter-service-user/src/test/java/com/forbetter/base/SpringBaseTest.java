/*
 * 文件名：SpringBaseTest
 * 版权：Copyright by lichen
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/9/30
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试基类，测试类都需要继承该类
 * <p>
 * Created On 2016年-09月-30日 16:27
 *
 * @author lichen
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/app-context.xml"})
public class SpringBaseTest extends AbstractJUnit4SpringContextTests{
    @Test
    public void setup() {

    }
}
