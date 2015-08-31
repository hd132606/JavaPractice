package org.dimigo.inheritance;

public class IPhone extends SmartPhone {
	public IPhone() { }
	public IPhone(String model, String company, int price){
		super(model, company, price);
	}
	public void pay(){
		super.pay();
	}
	public void useAirDrop(){
		System.out.println("AirDrop 기능을 사용합니다.");
	}
}
