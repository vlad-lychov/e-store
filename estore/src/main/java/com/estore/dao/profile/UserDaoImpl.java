package com.estore.dao.profile;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.estore.dao.common.impl.GenericDaoHibernate;
import com.estore.datamodel.profile.User;

public class UserDaoImpl extends GenericDaoHibernate<String, User> implements UserDao{

	@Override
	public User findByEmail(String email) {
		DetachedCriteria criteria = DetachedCriteria.forClass(getEntityClass());
		criteria.createCriteria("byEmail").add(Restrictions.eq("email", email));
		return (User) findUniqueByCriteria(criteria);
	}

}
