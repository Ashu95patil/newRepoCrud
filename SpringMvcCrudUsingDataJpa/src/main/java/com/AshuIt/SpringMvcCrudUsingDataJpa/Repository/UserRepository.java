package com.AshuIt.SpringMvcCrudUsingDataJpa.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AshuIt.SpringMvcCrudUsingDataJpa.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	

}
