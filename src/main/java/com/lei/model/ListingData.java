package com.lei.model;

import java.util.List;

public class ListingData {
	private String modhash;
	private List<T3> children;
	private String after;
	private String before;
	
	public String getModhash() {
		return modhash;
	}
	public void setModhash(String modhash) {
		this.modhash = modhash;
	}
	public List<T3> getChildren() {
		return children;
	}
	public void setChildren(List<T3> children) {
		this.children = children;
	}
	public String getAfter() {
		return after;
	}
	public void setAfter(String after) {
		this.after = after;
	}
	public String getBefore() {
		return before;
	}
	public void setBefore(String before) {
		this.before = before;
	}
}
