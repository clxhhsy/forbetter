/*
 * 文件名：CompentException
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/9/29
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter.exception;


import com.forbetter.ErrorCode;
import com.forbetter.util.StringUtils;


/**
 * 业务异常
 *
 * Created On 2016年-09月-29日 15:44
 * @author lichen
 */
public class ComponentException extends RuntimeException {

    private static final long serialVersionUID = -1336141329163850605L;

    private ErrorCode errorCode;

    private String message;

    public ComponentException(ErrorCode errorCode) {
        this(errorCode, "");
    }

    public ComponentException(ErrorCode errorCode, String message) {
        this(errorCode, message, null);
    }

    public ComponentException(ErrorCode errorCode, String message, Throwable cause) {
        super("ERROR CODE : " + errorCode.code() + "[" + errorCode.name() + "]" + message, cause);
        this.errorCode = errorCode;
        this.message = message;
    }

    public ComponentException(ErrorCode errorCode, Throwable cause) {
        this(errorCode, "", cause);
    }

    public final String getCode() {
        return errorCode.code();
    }

    public final String getErrMsg() {
        return StringUtils.isNotEmpty(this.message) ? this.message : this.errorCode.name();
    }

    public final ErrorCode getErrorCode() {
        return errorCode;
    }
}
