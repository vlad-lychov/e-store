package com.estore.service.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estore.dao.profile.UserDao;
import com.estore.datamodel.profile.User;

@Service
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	UserDao userDao;

	@Override
	public User create(User userToCreate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(User userToUpdate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
