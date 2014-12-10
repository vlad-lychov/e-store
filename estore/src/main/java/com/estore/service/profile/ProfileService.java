package com.estore.service.profile;

import java.util.List;

import com.estore.datamodel.profile.User;

public interface ProfileService {

	User create(User userToCreate);
	boolean update(User userToUpdate);
	List<User> findAll();
	User findByEmail(String email);
	User findById(String id);
	boolean remove(User user);
}
