package com.pluralsight.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy="challenge", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Servings> listOfServings = new ArrayList<Servings>();

	public Long getId() {
		return id;
	}

	public List<Servings> getListOfServings() {
		return listOfServings;
	}

	public int getServings() {
		return servings;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setListOfServings(List<Servings> listOfServings) {
		this.listOfServings = listOfServings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}
	
	
	
	
}
