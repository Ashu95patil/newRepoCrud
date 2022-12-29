package com.AshuIt.SpringMvcCrudUsingDataJpa.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AshuIt.SpringMvcCrudUsingDataJpa.Model.User;
import com.AshuIt.SpringMvcCrudUsingDataJpa.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User SaveUser(User user) {
	User save = userRepository.save(user);
		return save;
	}

	@Override
	public boolean logincheck(User user) {
		List<User> findAll = userRepository.findAll();
		
		for(User user1 : findAll) {
			
			if(user.getUsername().equals(user1.getUsername()) && user.getPassword().equals(user1.getPassword()))
					{
				return true;
			}
		}
		return false;
	}

	@Override
	public List<User> getAllUserData() {
	List<User> findAll = userRepository.findAll();
		return findAll;
	}

	@Override
	public User getSingleRecordId(int userid) {
		User user = userRepository.findById(userid).get();
		return user;
	}

	@Override
	public User updateUserfeild(User user) {
		User save = userRepository.save(user);
		return save;
	}

	@Override
	public boolean deleteUser(int userid) {
	boolean existsById = userRepository.existsById(userid);
	System.out.println(existsById);
	
	if(existsById) {
		userRepository.deleteById(userid);
		
		return true;
	}else { 
		return false;
	}

}
	// Delete All Data

	@Override
	public boolean deleteAlluser() {
		List<User> findAll = userRepository.findAll();
		if(findAll.isEmpty()) {
		return false;
	}else {
		userRepository.deleteAll();
		return true;
	}}
}
