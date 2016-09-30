/*
 * 文件名：Assert
 * 版权：Copyright by yamutech.com
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/9/29
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter;


import com.forbetter.exception.ComponentException;


/**
 * 参数验证，验证不通过返回业务异常信息
 * Created On 2016年-09月-29日 15:45
 * 
 * @author lichen
 * @version 1.0
 */
public final class Assert
{
    private Assert()
    {}

    /**
     * 断言object为null
     * 
     * @param object 被检查参数
     * @param message 异常信息
     */
    public static void isNull(Object object, String message)
    {
        isNull(object, ErrorCode.ParamIllegal, message);
    }

    /**
     * 断言object为null
     *
     * @param object 被检查参数
     * @param errorCode 异常码
     */
    public static void isNull(Object object, ErrorCode errorCode)
    {
        isNull(object, errorCode, errorCode.name());
    }

    /**
     * 断言object为null
     *
     * @param object 被检查参数
     * @param errorCode 异常码
     * @param message 异常信息
     */
    public static void isNull(Object object, ErrorCode errorCode, String message)
    {
        if (object != null)
        {
            throwException(errorCode, message);
        }
    }

    /**
     * 断言object不为null
     *
     * @param object 被检查参数
     * @param message 异常信息
     */
    public static void notNull(Object object, String message)
    {
        notNull(object, ErrorCode.ParamIllegal, message);
    }

    /**
     * 断言object不为null
     *
     * @param object 被检查参数
     * @param errorCode 异常码
     */
    public static void notNull(Object object, ErrorCode errorCode)
    {
        notNull(object, errorCode, errorCode.name());
    }

    /**
     * 断言object不为null
     *
     * @param object 被检查参数
     * @param errorCode 异常码
     * @param message 异常信息
     */
    public static void notNull(Object object, ErrorCode errorCode, String message)
    {
        if (object == null)
        {
            throwException(errorCode, message);
        }
    }

    private static void throwException(ErrorCode errorCode, String message)
    {
        throw new ComponentException(errorCode, message);
    }
}
