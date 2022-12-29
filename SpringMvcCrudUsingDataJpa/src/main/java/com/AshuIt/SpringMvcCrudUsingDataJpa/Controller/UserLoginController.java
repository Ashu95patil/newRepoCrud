package com.AshuIt.SpringMvcCrudUsingDataJpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.AshuIt.SpringMvcCrudUsingDataJpa.Model.User;
import com.AshuIt.SpringMvcCrudUsingDataJpa.Service.UserServiceI;

@Controller
public class UserLoginController {
	
	@Autowired
	private UserServiceI userServiceI;
	
	
	@GetMapping("/loadLoginform")
	public String Loadloginform() {
		
		return "login";
		
	}
	
	@PostMapping("/log")
	public String loginCheck(User user){
		
		boolean logincheck = userServiceI.logincheck(user);
		
		if(logincheck) {
			return "loginSuccess";
		}
		
		
		return "loginFail";
	
	
	}
	
	}
	


