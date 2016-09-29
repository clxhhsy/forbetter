/*
 * 文件名：StringUtils
 * 版权：Copyright by yamutech.com
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/9/29
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter.util;

/**
 * 字符串工具类
 *
 * Created On 2016年-09月-29日 16:38
 * @author lichen
 */
public class StringUtils {
    /**
     * 字符串是否不为空
     *
     * @param str 字符串
     * @return true or false
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 字符串是否为空
     *
     * @param str 字符串
     * @return true or false
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
}
