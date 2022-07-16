package com.junit.tempratureconversion;

class TempratureConversion{
	
	public static double tempratureConversionCToF(double temprature) {
		
		double celsius=temprature;
		double  fahrenheit=0.0;
		
		fahrenheit = (celsius * 9/5 ) + 32;	
		
		return fahrenheit;
		
	}
	public static double tempratureConversionFToC(double temprature) {
		double  fahrenheit = temprature;
		double  celsius = 0.0;
		
		celsius = (fahrenheit - 32) * 5/9;
		
		return celsius;
		
	}
}