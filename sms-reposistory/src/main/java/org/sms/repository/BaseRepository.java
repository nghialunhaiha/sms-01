package org.sms.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public abstract class BaseRepository {
	@Autowired
	private SessionFactory sessionFactory;

	public BaseRepository() {
	}

	public BaseRepository(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getCurrentActiveSession() {
		try {
			if (sessionFactory.getCurrentSession().isOpen())
				return sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			try {
				return sessionFactory.openSession();
			} catch (HibernateException e2) {
			}
		}
		throw new HibernateException("Session can not be create. --Yc coffee");
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> list(Session session, Class<T> clazz) {
		return (List<T>) session.createCriteria(clazz).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}

	// update
	@Transactional
	protected void update(Session session, Object object) {
		try {
			session.update(object);
		} catch (Exception e) {
			session.getTransaction().rollback();
			throw new HibernateException(e);
		}
	}

	@Transactional
	protected void saveOrUpdate(Session session, Object object) throws HibernateException {
		try {
			session.saveOrUpdate(object);
		} catch (Exception e) {
			session.getTransaction().rollback();
			throw new HibernateException(e);
		}
	}

	@Transactional
	// add - isert
	protected void create(Session session, Object object) throws HibernateException {
		try {
			session.save(object);
		} catch (Exception e) {
			session.getTransaction().rollback();
			throw new HibernateException(e);
		}
	}

	@Transactional
	protected void delete(Session session, Object object) throws HibernateException {
		try {
			session.delete(object);
		} catch (Exception e) {
			session.getTransaction().rollback();
			throw new HibernateException(e);
		}
	}

	protected <T> Object findById(Class<T> clazz, int id) {
		return getCurrentActiveSession().get(clazz, id);
	}

}
