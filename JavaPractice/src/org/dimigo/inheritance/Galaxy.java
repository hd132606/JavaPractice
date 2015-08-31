package org.dimigo.inheritance;

public class Galaxy extends SmartPhone {
	public Galaxy() { }
	public Galaxy(String name, String company, int price){
		super(name, company, price);
	}
	public void pay(){
		super.pay();
	}
	public void useWirelessCharging(){
		System.out.println("무선 충전 기능을 이용합니다.");
	}
}
