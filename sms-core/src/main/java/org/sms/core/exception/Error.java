package org.sms.core.exception;

import org.sms.core.domain.BaseDomain;

public class Error extends BaseDomain {

	private static final long serialVersionUID = 8344180918499193873L;

	private int status;

	private String message;

	private Integer code;

	public Error() {
		super();
	}

	public Error(int status, String message) {
		this();
		setStatus(status);
		setMessage(message);
	}

	public Error(int status, String message, Integer code) {
		this(status, message);
		setCode(code);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
