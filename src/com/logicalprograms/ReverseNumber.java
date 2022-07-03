package com.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println(" -------Welcome to Reverse Number ------- ");
		
		Scanner scanner=new Scanner(System.in);
		System.out.print(" Enter the number to reverss :");
		int num= scanner.nextInt();
		int res=0;
		int result=0;
		while(num >= 1)
		{
			res = num % 10;				// to get remainder
			result = result*10 +res;	//to make number reverse
			num = num / 10;				
			
		}
		System.out.println("Reversed Number is :"+result);
		
		scanner.close();
		
	}

}
