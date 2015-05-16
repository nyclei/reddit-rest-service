package com.lei.model;

public class Item {
	private String author;
	private String domain;
	private String permalink;
	private String url;
	private Number created;
	private Long score;
	private String subreddit_id;
	private String selftext_html;
	private String selftext;
	private String title;
	private boolean over_18;
	private boolean is_self;
	private boolean visited;

	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
	}
	public boolean isIs_self() {
		return is_self;
	}
	public void setIs_self(boolean is_self) {
		this.is_self = is_self;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}	
	public boolean getOver_18() {
		return over_18;
	}
	public void setOver_18(boolean over_18) {
		this.over_18 = over_18;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getPermalink() {
		return permalink;
	}
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Number getCreated() {
		return created;
	}
	public void setCreated(Number created) {
		this.created = created;
	}
	public String getSubreddit_id() {
		return subreddit_id;
	}
	public void setSubreddit_id(String subreddit_id) {
		this.subreddit_id = subreddit_id;
	}
	public String getSelftext_html() {
		return selftext_html;
	}
	public void setSelftext_html(String selftext_html) {
		this.selftext_html = selftext_html;
	}
	public String getSelftext() {
		return selftext;
	}
	public void setSelftext(String selftext) {
		this.selftext = selftext;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}