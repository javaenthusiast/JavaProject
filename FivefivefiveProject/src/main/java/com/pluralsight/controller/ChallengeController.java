package com.pluralsight.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.Challenge;
import com.pluralsight.service.ChallengeService;

//challenge controller code for challenge.
@Controller
@SessionAttributes("challenge")
public class ChallengeController {

	@Autowired
	private ChallengeService challengeService;
	
	@RequestMapping(value="addChallenge", method = RequestMethod.GET)
	public String addChallenge (Model model, HttpSession session){
		//Challenge challenge = new Challenge();
		
		Challenge challenge = (Challenge) session.getAttribute("challenge");//go and look into the session if there is 
		//a challenge object already stored
		
		if(challenge == null){
			challenge = new Challenge();
			challenge.setServings(5);
		}
		
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
		else{
			challengeService.save(challenge);
		}
		return "redirect:index.jsp";
	}
	
	
	@RequestMapping(value="getChallenges", method = RequestMethod.GET)
	public String getChallenges(Model model){
		List<Challenge> challenges = challengeService.findAllChallenges();
		model.addAttribute("challenges", challenges);
		return "getChallenges";
	}
}
