package com.pluralsight.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="challenges")
public class Challenge {

	@Id
	@GeneratedValue
	@Column(name="CHALLENGE_ID")
	private Long id;
	
	@Range(min = 1, max = 5)
	@Column(name="SERVINGS")
	private int servings;
	
	

	public Long getId() {
		return id;
	}

	public int getServings() {
		return servings;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}
	
	
	
}
