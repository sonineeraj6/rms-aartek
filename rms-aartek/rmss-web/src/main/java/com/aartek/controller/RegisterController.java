package com.aartek.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.Register;
import com.aartek.service.RegisterService;



  @Controller
  public class RegisterController {
	  @Autowired
	  private RegisterService stuRegService;

	  
	    @RequestMapping("/register")
		public String login(Model model)
		{
			
			model.addAttribute("Register",new Register());
			return "register";	
			
		}
	    @RequestMapping(value = "/registerUser.do", method = { RequestMethod.GET, RequestMethod.POST })
	    public String signUp(@ModelAttribute("Register") Register registration, BindingResult result, ModelMap model,
	        Map<String, Object> map, HttpServletRequest request) {
	      boolean status = false;
	      
	     
	      status = stuRegService.addStudentInfo(registration);
	      if (status) {
	        System.out.println("Registered successfully");
	      } else {
	    	  System.out.println("Not Registered successfully");
	      }
	      return "redirect:/register.do";
	    }

	    
	  

	}



