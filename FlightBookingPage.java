package com.AbstractionExample;

import java.util.Random;

public class FlightBookingPage extends BaseBookingPage {

	@Override
	public void getSeatType() {
		
		System.out.println("Available Seat Types in Flight : Economy Class/Business Class");
		
		String strSeatArray[] = {"Economy","Business"};
		String strRandomType = strSeatArray[new Random().nextInt(strSeatArray.length)];
		System.out.println("Selected Class is : "+strRandomType);
		
	}

	@Override
	public void getBerthPreference() {
		
		System.out.println("Availabe Berth Preferences in Flight : Window/Non-Window");
		
		String strBerthArray[] = {"Window","Non-Window",};
		String strRandomBerth = strBerthArray[new Random().nextInt(strBerthArray.length)];
		System.out.println("Selected Preference is : "+strRandomBerth);
	}

	@Override
	public void getTravelDate() {
		
		String strRandomDate = "";
		int intRandom = (int) (Math.random()*30);
				
		if(intRandom == 0) {
			intRandom = (int) (Math.random()*30);
		}
		
		strRandomDate = String.valueOf(intRandom).trim();
		
		String strMonth[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		String strRandomMonth = strMonth[new Random().nextInt(strMonth.length)];
		
		System.out.println("Date of Travel by Flight : "+strRandomDate+" "+strRandomMonth+" 2022");
		
	}

}
