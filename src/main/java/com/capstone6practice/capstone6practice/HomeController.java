package com.capstone6practice.capstone6practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capstone6practice.capstone6practice.dao.UserRepo;
import com.capstone6practice.capstone6practice.variablesnikki.User;

@Controller
public class HomeController {
	
	@Autowired
	UserRepo u;

	@RequestMapping("/")
	public ModelAndView index() {
		User user = new User("nikki@gmail.com", "Javabootcamp");
		//User userTest = new User("h", "h");
		u.save(user);
		//System.out.println("User:  " + user.getAddress());
		return new ModelAndView("index");
	}
	@RequestMapping("add-user")
	public ModelAndView addForm() {
		return new ModelAndView("add-user");
	}
	
	
}
