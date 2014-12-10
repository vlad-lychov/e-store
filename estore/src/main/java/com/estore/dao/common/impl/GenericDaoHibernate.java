package com.estore.dao.common.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.estore.dao.common.GenericDao;

@SuppressWarnings("unchecked")
public class GenericDaoHibernate <KEY  extends Serializable, TYPE> extends
								HibernateDaoSupport implements GenericDao<KEY, TYPE> {

	private static Logger LOG = LoggerFactory.getLogger(GenericDaoHibernate.class);
	
	@Autowired
	public void autowireSessionFactory(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
	protected Class<? extends TYPE> getEntityClass() {
		return GenericTypeResolver.resolveTypeArguments(getClass(), GenericDaoHibernate.class)[1];
	}

	protected String getEntityIdName() {
		return getSessionFactory().getClassMetadata(getEntityClass()).getIdentifierPropertyName();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public KEY create(TYPE instance) {
		return (KEY) getHibernateTemplate().save(instance);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveOrUpdate(TYPE instance) {
		getHibernateTemplate().saveOrUpdate(getHibernateTemplate().merge(instance));
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(TYPE instance) {
		getHibernateTemplate().delete(getHibernateTemplate().merge(instance));
		
	}
	
	@Override
	public TYPE findById(KEY id) {
		return (TYPE) getSession().get(getEntityClass(), id);
	}

	@Override
	public int count() {
		DetachedCriteria criteria = DetachedCriteria.forClass(getEntityClass());
		criteria.setProjection(Projections.rowCount());
		return ((Long) findUniqueByCriteria(criteria)).intValue();
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	protected Object findUniqueByCriteria(DetachedCriteria criteria){
		return criteria.getExecutableCriteria(getSession()).uniqueResult();
	}

	@Override
	public List<TYPE> getAll() {
		DetachedCriteria criteria = DetachedCriteria.forClass(getEntityClass());
		return (List<TYPE>) findByCriteria(criteria);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	protected List<?> findByCriteria(DetachedCriteria criteria) {
		return criteria.getExecutableCriteria(getSession()).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}
	
	

}
