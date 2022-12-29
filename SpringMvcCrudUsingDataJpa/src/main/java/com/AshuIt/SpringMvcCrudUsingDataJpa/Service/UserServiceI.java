package com.AshuIt.SpringMvcCrudUsingDataJpa.Service;

import java.util.List;

import com.AshuIt.SpringMvcCrudUsingDataJpa.Model.User;

public interface UserServiceI {
	
	public User SaveUser(User user);
	
	public boolean logincheck(User user);
	
	public List<User> getAllUserData();
	
	public User getSingleRecordId(int userid);
	
	public User updateUserfeild(User user);
	
	public boolean deleteUser(int userid);
	
	public boolean deleteAlluser();

	

}
