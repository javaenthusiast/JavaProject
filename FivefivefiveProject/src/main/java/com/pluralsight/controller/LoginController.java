package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.Login;


@Controller
//@SessionAttributes("login")
public class LoginController {
	
@RequestMapping(value="loginPage", method=RequestMethod.GET)
public String addLogin(@ModelAttribute ("login") Login login){
	
/*	System.out.println("username is: " + login.getUserName());
	System.out.println("password is: " + login.getPassword());*/
	
	return "login";
}

}
