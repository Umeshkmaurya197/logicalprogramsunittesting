package com.junit.dayofweek;

public class DayOfWeek {
	public static String dayOfWeek(int d,int m,int y) {
		int year = 0;
		int day = 0;
		int month = 0;
		int x = 0;
	
			year = y-(14-m)/12;
			x = year + year/4 - year/100 + year/400;
		    month = m + 12 * ((14 - m)/12) - 2;
		    day = (d + x + 31*month/12) % 7;
	      
		    switch(day) {
			case 0:  return "Sunday";
			case 1:  return "Monday";
			case 2:  return "Tuesday";
			case 3:  return "Wednesday";
			case 4:  return "Thursday";
			case 5:  return "Friday";
			case 6:  return "Saturday";
			default : return "INVAlID INPUT TRY AGAIN ";
		    }
	}
	

	public static void main (String [] args){
		
		int day = Integer.parseInt(args[0]);   //Command Line Argument
		int month = Integer.parseInt(args[1]);  //Command Line Argument
		int year = Integer.parseInt(args[2]);   //Command Line Argument
		
		System.out.println("Day Of Week : "+dayOfWeek(day,month,year));
	}
	
}