package com.estore.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.estore.dao.GenericDao;

public class GenericDaoHibernate <KEY  extends Serializable, TYPE> extends
								HibernateDaoSupport implements GenericDao<KEY, TYPE> {

	private static Logger LOG = LoggerFactory.getLogger(GenericDaoHibernate.class);
	
	@Autowired
	public void autowireSessionFactory(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
	@SuppressWarnings("unchecked")
	protected Class<? extends TYPE> getEntityClass() {
		return GenericTypeResolver.resolveTypeArguments(getClass(),
				GenericDaoHibernate.class)[1];
	}

	protected String getEntityIdName() {
		String idName = getSessionFactory().getClassMetadata(getEntityClass())
				.getIdentifierPropertyName();
		return idName;
	}

	@Override
	public KEY create(TYPE instance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(TYPE instance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TYPE instance) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public TYPE findById(KEY id) {
		return (TYPE) getSession().get(getEntityClass(), id);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TYPE> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
