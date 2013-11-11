package com.pluralsight.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.pluralsight.model.Servings;

//Servings controller code//
@Controller
@SessionAttributes("servings")
public class ServingsController {
	
	
	@RequestMapping(value="addServings", method = RequestMethod.GET)
	public String addServings (Model model){
		Servings servings = new Servings();
		servings.setServings(1);
		model.addAttribute("servings", servings);
		return "addServing";
		
	}

	@RequestMapping(value = "/addServings", method = RequestMethod.POST)
	public String addServings(@Valid @ModelAttribute ("servings") Servings servings, BindingResult result){
		
		System.out.println("servings" + servings.getServings());
		if(result.hasErrors()){
		return "addServing";
		}
		return "finalPage";
	}
}
