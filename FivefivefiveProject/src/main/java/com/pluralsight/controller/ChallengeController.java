package com.pluralsight.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.Challenge;

//challenge controller code for challenge.....
@Controller
@SessionAttributes("challenge")
public class ChallengeController {

	@RequestMapping(value="addChallenge", method = RequestMethod.GET)
	public String addChallenge (Model model){
		Challenge challenge = new Challenge();
		challenge.setServings(5);
		model.addAttribute("challenge", challenge);
		return "addChallenge";
		
	}
	
	@RequestMapping(value="addChallenge", method = RequestMethod.POST)
	public String updateChallenge (@Valid @ModelAttribute("challenge") Challenge challenge, BindingResult result){
		System.out.println("result has errors" + result.hasErrors());
		System.out.println("Challenge updated is: " + challenge.getServings());
		
		if(result.hasErrors()) {
			return "addChallenge";
		}
		return "redirect:addServings.html";
	}
}
