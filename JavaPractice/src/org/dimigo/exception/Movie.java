package org.dimigo.exception;

public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge){
		this.title = title;
		this.limitAge = limitAge;
	}
	public String getTitle(){
		return this.title;
	}
	public int getLimitAge(){
		return this.limitAge;
	}
}


