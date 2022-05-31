package com.AbstractionExample;

import java.util.Random;

public class BusBookingPage extends BaseBookingPage{

	@Override
	public void getSeatType() {
		
		System.out.println("Available Seat Types in Bus : Sleeper/Seater");
		
		String strSeatArray[] = {"Sleeper","Seater"};
		String strRandomType = strSeatArray[new Random().nextInt(strSeatArray.length)];
		System.out.println("Selected Seat Type is : "+strRandomType);
		
	}

	@Override
	public void getBerthPreference() {
		
		System.out.println("Births available in Bus : LB/UB");
		
		String strBerthArray[] = {"Lower Berth","Upper Berth"};
		String strRandomBerth = strBerthArray[new Random().nextInt(strBerthArray.length)];
		System.out.println("Selected Berth Type is : "+strRandomBerth);
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
		
		System.out.println("Date of Travel by Bus : "+strRandomDate+" "+strRandomMonth+" 2022");
		
	}

}
