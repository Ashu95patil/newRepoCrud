package com.AshuIt.SpringMvcCrudUsingDataJpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.AshuIt.SpringMvcCrudUsingDataJpa.Model.User;
import com.AshuIt.SpringMvcCrudUsingDataJpa.Service.UserServiceI;
import com.AshuIt.SpringMvcCrudUsingDataJpa.Service.UserServiceImpl;
@Controller
public class UserController {
	@Autowired
	private UserServiceI userServiceI;

	@GetMapping("/WelcomeUser")
	public String loadform() {

		return "welcome";

	}

	@PostMapping("/saveUser")
	public String saveUser(User user, Model model) {
		
	System.out.println(user);
				
		Model addAttribute = model.addAttribute("USER", user);

		User saveUser = userServiceI.SaveUser(user);

		if (saveUser != null) {

			return "RegiSuccess";

		}else { 
			
			return "RegiFail";
		}
	}
}

