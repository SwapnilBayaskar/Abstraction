package com.AbstractionExample;

public abstract class BaseBookingPage {
	
	public void getDepartureCity(String strDepart) {
		
		System.out.println("Departure from : "+strDepart);
	}
	
	public void getArrivalCity(String strArrival) {
		
		System.out.println("Arrived to : "+strArrival);
	}
	
	public abstract void getSeatType();
	
	public abstract void getBerthPreference();
	
	public abstract void getTravelDate();

}
