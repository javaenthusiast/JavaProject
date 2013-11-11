package com.pluralsight.model;
//model
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class Servings {

	@Size(min = 1, max = 100)
	@NotEmpty
	private String items;
	
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
	
	@NotNull
	@Range(min = 1, max = 5)
	@NumberFormat(style = Style.NUMBER)
	private int servings;
	
	@NotNull
	@NumberFormat(style = Style.NUMBER)
	@Min(1)
	private int userId;
	
	@Size(min = 1, max = 20)
	@NotEmpty
	private String userName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}
}
