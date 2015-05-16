package com.lei.model;

public class T3 implements Comparable<T3> {
	private String kind;
	private Item data;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Item getData() {
		return data;
	}
	public void setData(Item data) {
		this.data = data;
	}
	
	/**
	 * Comparable interface implementation
	 * Use 'author' as the default sorting field.
	 */
	@Override
	public int compareTo(T3 t3) {
		return this.getData().getAuthor().compareTo(t3.getData().getAuthor());
	}

}

