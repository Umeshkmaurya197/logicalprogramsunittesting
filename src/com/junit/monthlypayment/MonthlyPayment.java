package com.junit.monthlypayment;

public class MonthlyPayment {

	
	public static double  monthlyPayment(int P ,int year, double R) {  //P = Principal Loan Amt   
																    //R = R percent interest Compounded											
		double payment = 0.0;
		int n = 0;
		double r = R;
		n = 12 * year;
		r = r / (12 * 100);
		payment = (P * r) /Math.pow((1-(1+r)),(-n));
		return payment;
	}
	public static void main (String [] args) {
		System.out.println(" Payment :"+monthlyPayment(80000, 2, 7.9));
	
	}
}
