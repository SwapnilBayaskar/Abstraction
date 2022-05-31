package com.AbstractionExample;

public class PageFactory {
	
	public static BaseBookingPage objBaseBookingPage = null;
	
	public static String strTravelType = "Bus";
	
	public void getTravelType() {
		System.out.println("Selected Travel Type is : "+strTravelType);
		System.out.println("============================================="+"\n");
	}
	
	public static BaseBookingPage getobjBaseBookingPage() {
		
		if(strTravelType.equals("Train")) {
			objBaseBookingPage = new TrainBookingPage();
			
		}else if(strTravelType.equals("Bus")) {
			objBaseBookingPage = new BusBookingPage();
			
		}else if(strTravelType.equals("Flight")) {
			objBaseBookingPage = new FlightBookingPage();
		}
		
		return objBaseBookingPage;
	}

}
