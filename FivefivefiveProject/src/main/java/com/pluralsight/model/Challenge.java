package com.pluralsight.model;

import org.hibernate.validator.constraints.Range;

public class Challenge {

	@Range(min = 1, max = 5)
	private int servings;

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}
	
	
}
