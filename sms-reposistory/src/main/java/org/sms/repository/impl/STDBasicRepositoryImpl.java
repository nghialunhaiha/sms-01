/**
 * 
 */
package org.sms.repository.impl;

import org.sms.model.STDBasic;
import org.sms.repository.BaseRepository;

/**
 * @author nghia.pham
 */
public class STDBasicRepositoryImpl extends BaseRepository {
	public STDBasic retrieve() {
		return (STDBasic) getCurrentActiveSession().createCriteria(STDBasic.class).uniqueResult();
	}

	public static void main(String[] args) {
		STDBasicRepositoryImpl impl = new STDBasicRepositoryImpl();
		System.out.println(impl.retrieve());
	}
}
