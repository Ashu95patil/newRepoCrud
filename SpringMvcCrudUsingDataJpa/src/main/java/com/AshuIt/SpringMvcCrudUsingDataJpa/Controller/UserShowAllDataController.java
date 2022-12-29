package com.AshuIt.SpringMvcCrudUsingDataJpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.AshuIt.SpringMvcCrudUsingDataJpa.Model.User;
import com.AshuIt.SpringMvcCrudUsingDataJpa.Service.UserServiceI;
import com.AshuIt.SpringMvcCrudUsingDataJpa.Service.UserServiceImpl;

@Controller
public class UserShowAllDataController {
   
	@Autowired
	private UserServiceI userServiceI;
	
	@GetMapping("/ShowUserData")
	public String getAllUser(Model model) {
		List<User> allUserData = userServiceI.getAllUserData();
		model.addAttribute("List", allUserData);
		
		
		
		return "getAllUserData";
		
	}
}
