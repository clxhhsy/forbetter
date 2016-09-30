/*
 * 文件名：ErrorCode
 * 版权：Copyright by yamutech.com
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/9/29
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter;

/**
 * 业务异常代码
 * Created On 2016年-09月-29日 15:45
 *
 * @author lichen
 * @version 1.0
 *
 */
public interface ErrorCode
{
    String code();// 异常码

    String name();// 异常码说明

    ErrorCode SystemError = new ErrorCode()
    {
        public String code()
        {
            return "SE-0001";
        }

        public String name()
        {
            return "系统异常";
        }
    };

    ErrorCode ParamIllegal = new ErrorCode()
    {
        public String code()
        {
            return "SE-0002";
        }

        public String name()
        {
            return "参数非法";
        }
    };

}
