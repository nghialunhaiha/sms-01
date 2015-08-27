package org.sms.core.exception;

public abstract class BaseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4953984169059978059L;
	public static final int UNKNOWN_ERROR = 99;

	private static final int UNIT_SIZE = 100;

	private int domainCode = 0;
	private int errorCode = 0;

	public BaseException(int domainCode) {
		super();
		setDomainCode(domainCode);
	}

	public BaseException(int domainCode, int errorCode) {
		super();
		setDomainCode(domainCode);
		setErrorCode(errorCode);
	}

	public BaseException(int domainCode, int errorCode, Throwable thowable) {
		super(thowable);
		setDomainCode(domainCode);
		setErrorCode(errorCode);
	}

	public int getDomainCode() {
		return domainCode;
	}

	public void setDomainCode(int domainCode) {
		this.domainCode = domainCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		if (errorCode < 0 || errorCode >= UNIT_SIZE)
			throw new IllegalArgumentException("Error code must be positive and less than " + UNIT_SIZE);
		this.errorCode = errorCode;
	}

	public Error getError() {
		return generateError(500, "Unexpected error.");
	}

	protected Error generateError(int status, String message) {
		return new Error(status, message, domainCode * UNIT_SIZE + errorCode);
	}

	protected String getMessageIfExist(String defaultMessage) {

		if (getCause().getMessage() != null)
			return getCause().getMessage();

		return defaultMessage;

	}

	public enum Domain {

		General(99);

		private int domainCode;

		Domain(int domainCode) {
			this.domainCode = domainCode;
		}

		public int getDomainCode() {
			return domainCode;
		}

	}
}
