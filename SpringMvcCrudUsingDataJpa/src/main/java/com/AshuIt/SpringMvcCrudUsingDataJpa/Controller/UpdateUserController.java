package com.AshuIt.SpringMvcCrudUsingDataJpa.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.AshuIt.SpringMvcCrudUsingDataJpa.Model.User;
import com.AshuIt.SpringMvcCrudUsingDataJpa.Service.UserServiceI;



@Controller
public class UpdateUserController {

	@Autowired
	private UserServiceI userServiceI;

	@GetMapping("/Update")
	public String PreUpdate() {
		return "UpdateUser";

	}

	@PostMapping("/UpdatedUser")
	public String UpdatedUserData(User user) {

		User updateUserfeild = userServiceI.updateUserfeild(user);

		if (updateUserfeild != null) {
			return "UpdatedSuccessfully";

		} else {
			return "UpdateFail";
		}
	}
}