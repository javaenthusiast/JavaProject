package com.pluralsight.model;
//model
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
@Table(name="servings")
public class Servings {
	

	@Id
	@GeneratedValue
	@Column(name="SERVINGS_ID")
	private Long id;

	@Size(min = 1, max = 100)
	@NotEmpty
	@Column(name="ITEMS")
	private String items;

	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="DATE")
	private Date date;

	@NotNull
	@Range(min = 1, max = 5)
	@NumberFormat(style = Style.NUMBER)
	@Column(name="SERVINGS")
	private int servings;
	
	@NotNull
	@NumberFormat(style = Style.NUMBER)
	@Min(1)
	@Column(name="USERID")
	private int userId;
	
	@Size(min = 1, max = 20)
	@NotEmpty
	@Column(name="USERNAME")
	private String userName;
	
	@ManyToOne
	private Challenge challenge;
	
	public Challenge getChallenge() {
		return challenge;
	}
	
	public Date getDate() {
		return date;
	}

	public Long getId() {
		return id;
	}

	public String getItems() {
		return items;
	}

	public int getServings() {
		return servings;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setChallenge(Challenge challenge) {
		this.challenge = challenge;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
