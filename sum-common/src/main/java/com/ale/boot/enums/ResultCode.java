package com.ale.boot.enums;


/**
 * 返回状态码
 *
 * @author 高杨
 * @since  2022年4月25日21:05:45
 */
public enum ResultCode {

	/* 成功状态码 */
	SUCCESS(0, "成功"),

	/* 系统500错误*/
	SYSTEM_ERROR(10000, "系统异常，请稍后重试"),

	/* 参数错误：10001-19999 */
	PARAM_IS_INVALID(10001, "参数无效");

	private Integer code;

	private String message;

	ResultCode(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer code() {
		return this.code;
	}

	public String message() {
		return this.message;
	}

}
