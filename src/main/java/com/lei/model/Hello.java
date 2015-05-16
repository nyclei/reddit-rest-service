package com.lei.model;

import java.util.Date;

public class Hello {
	private String name;
	private String dateTime;
	
	public Hello(String name) {
		this.setName("Hello " + name);
		this.dateTime = new Date().toString();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDateTime() {
		return this.dateTime;
	}
}
