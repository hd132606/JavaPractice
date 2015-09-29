package org.dimigo.abstractclass;

public abstract class Animal {
	
	private String name;
	public Animal(){
		
	}
	public Animal(String name){
		this.name = name;
	}
	public String toString(){
		return this.name;
	}
	public void eat(){
		System.out.println("냠냠");
	}
	public void sleep(){
		System.out.println("쿨쿨");
	}
	public void bark(){
		System.out.println("멍멍");
	}
}
