package com.AshuIt.SpringMvcCrudUsingDataJpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.AshuIt.SpringMvcCrudUsingDataJpa.Service.UserServiceI;

@Controller
public class DeleteController {
	
	@Autowired
	private UserServiceI userServiceI;
	
	@GetMapping("/deleteuser/{Userid}")
	public String deleteuserdata(@PathVariable int Userid) {
		
		boolean deleteUser = userServiceI.deleteUser(Userid);
		
		if(deleteUser) {
		return "deleteSuccess";
		
	}else {
		return "deleteFail";
	}
	
	

}
}
