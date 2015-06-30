package com.aartek.controller;



import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserLogin;







@Controller
public class LoginController {

	
	@RequestMapping("/login")
	public String login(Model model)
	{
		
		model.addAttribute("UserLogin",new UserLogin());
		return "login";	
		
	}

	
	@RequestMapping(value = "/loginUser.do", method = RequestMethod.POST)
	public String signInAction(@ModelAttribute("UserLogin") UserLogin userLogin,Model model) {
		
		System.out.println(userLogin.getUserId());
		System.out.println(userLogin.getPassword());
		return "welcome";
		/* userLogin=loginservice.show(userLogin);*/
		/*boolean result=loginservice.signUp(userLogin);
		
			if (result==true) {
				System.out.println("data inserted succesfully");
				return "redirect:/login.do";
				return "welcome";
				
			} else {
				System.out.println("data didn't inserted succesfully");
				return "login";
			}*/
		
	}

}
