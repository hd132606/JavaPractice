package org.dimigo.inheritance;

public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){
		
	}
	public SmartPhone(String model, String company, int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}
	public void turnOn(){
		System.out.println(this.model+"의 전원을 켭니다.");
	}
	public void turnOff(){
		System.out.println(this.model+"의 전원을 끕니다.");
	}
	public void pay(){
		System.out.println(this.company+"페이로 결제합니다.");
	}
	public void useSpecialFunction(SmartPhone phone){
		if(phone instanceof IPhone){
			((IPhone) phone).useAirDrop();
		}
		else{
			((Galaxy)phone).useWirelessCharging();
		}
	}
	public String toString(){
		return "모델명 : " + this.model + ", 제조사 : " + this.company + ", 가격 : " + String.format("%,d", this.price);
	}
}
