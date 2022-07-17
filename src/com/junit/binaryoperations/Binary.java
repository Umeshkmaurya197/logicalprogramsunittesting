package com.junit.binaryoperations;

import java.util.Scanner;

public class Binary {
	public static String toBinaryOperation(int num) {
		String remainder ="";
		String reverse ="";
		int num1=num;
		while(num>0)
		{
			remainder = remainder + num % 2;
			num =num/2;
		}
		for(int i=0; i<remainder.length(); i++)
		{
			char ch;
			ch=remainder.charAt(i);
			reverse=ch+reverse;
		}
		
		//1. Swap nibbles and find the new number
		
		System.out.println(" Binary Representation of "+num1+" is : "+reverse);
		String even1="",even2="";
		String odd1="0",odd2="";
		String nibble1 ="";
		String nibble2 ="";
		for(int i = 0 ; i <reverse.length();i++) {
			if(reverse.length()%2 == 0) {
				if((reverse.length()/2) > i) {
					even1 = even1+reverse.charAt(i);
					 nibble1 = even1;
//					 System.out.println("even nibble1 : "+nibble1);
				}else {
					even2 = even2+reverse.charAt(i);
					nibble2 = even2;
//					System.out.println("even nibble2 : "+nibble2);
						
				}
			}else {
				if((reverse.length()/2) > i) {
					odd1 = odd1+reverse.charAt(i);
					nibble1 = odd1;
//					System.out.println("odd nibble2 : "+nibble1);
				}else {
					odd2 = odd2+reverse.charAt(i);
					nibble2 = odd2;
//					System.out.println("odd nibble2 : "+nibble2);
				}
			}
		}
		
//      2. Find the resultant number is the number is a power of 2.
		
		int i = 1,pownum=0;
		int newnum = Integer.parseInt(nibble2+nibble1,2);
		System.out.println(" The new number is "+newnum+" and binary : "+(nibble2+nibble1));
		while(newnum > pownum ) {
			pownum =(int)Math.pow(2,i);
			i++;
		}
		if (pownum != newnum)
			System.out.println(" Number "+newnum+" is not a power of 2 ");
		else 
			System.out.println(" Number "+newnum+" is a power of 2 ");
		
	return nibble2+nibble1;
	}
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the to get binary and new generated number : ");
		 int num= scanner.nextInt();
		 toBinaryOperation(num);
		scanner.close();
	}
}
