package com.ale.boot.entity;


import com.ale.boot.enums.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 异常结果类
 *
 * @author 高杨
 * @since  2022年4月25日22:13:58
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorResult {

	/**
	 * 异常状态码
	 */
	private Integer status;

	/**
	 * 用户看得见的异常，例如 参数格式不正确
	 */
	private String message;

	/**
	 * 异常的名字
	 */
	private String exception;

	/**
	 * 异常堆栈信息
	 */
	//private String errors;

	/**
	 * 对异常提示语进行封装
	 *
	 * @param resultCode 结果码
	 * @param e 异常对象
	 * @param message 错误提示信息
	 * @return 通用异常结果
	 */
	public static ErrorResult fail(ResultCode resultCode, Throwable e, String message) {
		ErrorResult result = ErrorResult.fail(resultCode, e);
		result.setMessage(message);
		return result;
	}

	/**
	 * 对异常枚举进行封装
	 *
	 * @param resultCode 结果码
	 * @param e 异常对象
	 * @return 通用异常结果
	 */
	public static ErrorResult fail(ResultCode resultCode, Throwable e) {
		ErrorResult result = new ErrorResult();
		result.setMessage(resultCode.message());
		result.setStatus(resultCode.code());
		result.setException(e.getClass().getName());
		//result.setErrors(Throwables.getStackTraceAsString(e));
		return result;
	}
}
