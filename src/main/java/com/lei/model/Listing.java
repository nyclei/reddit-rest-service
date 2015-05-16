package com.lei.model;

public class Listing {
	private String kind;
	private ListingData data;
	
	public Listing() {
		this.kind = "Listing";
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public ListingData getData() {
		return data;
	}
	public void setData(ListingData data) {
		this.data = data;
	}
	
		
}
