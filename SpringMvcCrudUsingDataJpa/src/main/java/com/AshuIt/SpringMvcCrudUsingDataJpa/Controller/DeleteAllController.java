package com.AshuIt.SpringMvcCrudUsingDataJpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.AshuIt.SpringMvcCrudUsingDataJpa.Service.UserServiceI;

@Controller
public class DeleteAllController {
	
	@Autowired
	private UserServiceI userServiceI;
	
	@GetMapping("/deleteAll")
	public String DeleteAllUserData() {
		
		boolean deleteAlluser = userServiceI.deleteAlluser();
		
		System.out.println(deleteAlluser);
		
		if(deleteAlluser) {
		
		return "DeleteAllSuccess";
		
	}else {
		return "DeleteAllFail";
	}
	
	}

}
