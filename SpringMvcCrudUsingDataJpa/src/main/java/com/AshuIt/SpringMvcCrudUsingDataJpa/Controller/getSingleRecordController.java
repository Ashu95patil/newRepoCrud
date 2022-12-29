package com.AshuIt.SpringMvcCrudUsingDataJpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.AshuIt.SpringMvcCrudUsingDataJpa.Model.User;
import com.AshuIt.SpringMvcCrudUsingDataJpa.Service.UserServiceI;

@Controller
public class getSingleRecordController {
	
	@Autowired
	private UserServiceI userServiceI;
	
	@GetMapping("getSingleRecord/{Userid}")
	public String getSingleRecord(@PathVariable Integer Userid,Model model) {
		
		User singleRecordId = userServiceI.getSingleRecordId(Userid);
		
		model.addAttribute("User", singleRecordId);
		
		
		return "SingleUser";
		
		
	}
	

}
