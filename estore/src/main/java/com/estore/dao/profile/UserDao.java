package com.estore.dao.profile;

import com.estore.dao.common.GenericDao;
import com.estore.datamodel.profile.User;

public interface UserDao extends GenericDao<String, User>{

	public User findByEmail(String email);
	
}
