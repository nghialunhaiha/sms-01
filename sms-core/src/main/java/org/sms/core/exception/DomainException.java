/**
 * 
 */
package org.sms.core.exception;

/**
 * @author nghia.pham
 */
public abstract class DomainException extends BaseException {

	private static final long serialVersionUID = -6626877929701903960L;
	public static final int NOT_FOUND = 1;
	public static final int DUPLICATED_KEY = 2;

	public DomainException(int domainCode) {
		super(domainCode);
	}

	public DomainException(int domainCode, int errorCode) {
		super(domainCode, errorCode);
	}

	public DomainException(int domainCode, int errorCode, Throwable thowable) {
		super(domainCode, errorCode, thowable);
	}

	@Override
	public Error getError() {
		return generateError(500, "Unexpected error.");
	}

	public enum Domain {

		Task(10), Message(20), Intent(21), Button(22), General(99), entity(30);

		private int domainCode;

		Domain(int domainCode) {
			this.domainCode = domainCode;
		}

		public int getDomainCode() {
			return domainCode;
		}

	}

}
