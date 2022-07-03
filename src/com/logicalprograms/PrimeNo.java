package com.logicalprograms;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			System.out.print(" Enter the no : ");
			int num = scanner.nextInt();
			boolean flag = false;
		
			for( int i = 2  ; i<= num/2 ; i++)
			{
				if (num % i == 0)
				{
				     flag=true;	   
				}
			}
			if (flag != true)
				System.out.println(num+" is a prime no .");
			else
				System.out.println(num+" is not a prime no. ");
			
			scanner.close();
	}

}
