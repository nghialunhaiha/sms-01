/**
 * 
 */
package org.sms.core.exception.domain;

import org.sms.core.exception.DomainException;
import org.sms.core.exception.Error;

/**
 * @author nghia.pham
 */
public class EntityException extends DomainException {

	private static final long serialVersionUID = 5112102975857563614L;
	public static final int HAS_ERROR_OCCURRED = 10;

	public EntityException(int domainCode, int errorCode, Throwable thowable) {
		super(domainCode, errorCode, thowable);
	}

	public EntityException(int domainCode, int errorCode) {
		super(domainCode, errorCode);
	}

	public EntityException(int domainCode) {
		super(domainCode);
	}

	public EntityException(Throwable thowable) {
		super(DomainException.Domain.entity.getDomainCode(), -1, thowable);
	}
	
	@Override
	public Error getError() {
		switch (getErrorCode()) {
		case NOT_FOUND:
			return generateError(400, "Integration not found.");
		case DUPLICATED_KEY:
			return generateError(400, "Integration duplicated.");
		case HAS_ERROR_OCCURRED:
			return generateError(400, "An error has occurred.");
		default:
			return super.getError();
		}
	}
}
