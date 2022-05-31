package com.AbstractionExample;

public class TestAbstractionExample {

	public static void main(String[] args) {
		
		PageFactory objPageFactory= new PageFactory();
		objPageFactory.getTravelType();
		
		PageFactory.getobjBaseBookingPage().getDepartureCity("Pune");
		
		PageFactory.getobjBaseBookingPage().getArrivalCity("Nagpur");
		
		PageFactory.getobjBaseBookingPage().getSeatType();
		
		PageFactory.getobjBaseBookingPage().getBerthPreference();
		
		PageFactory.getobjBaseBookingPage().getTravelDate();
		

	}

}
