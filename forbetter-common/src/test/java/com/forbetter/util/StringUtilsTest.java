package com.forbetter.util;

import org.junit.Test;

/*
 * 文件名：StringUtilsTest
 * 描述：字符串工具测试类
 * 修改人：lichen
 * 修改时间：2016/9/29
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */public class StringUtilsTest {
    @Test
    public void isNotEmpty() throws Exception {
        System.out.println(StringUtils.isNotEmpty(""));
        System.out.println(StringUtils.isNotEmpty(null));
        System.out.println(StringUtils.isNotEmpty("  "));
        System.out.println(StringUtils.isNotEmpty(" f d "));
        System.out.println(StringUtils.isNotEmpty("fsdf"));
    }

    @Test
    public void isEmpty() throws Exception {
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty("  "));
        System.out.println(StringUtils.isEmpty(" f d "));
        System.out.println(StringUtils.isEmpty("fsdf"));
    }

}