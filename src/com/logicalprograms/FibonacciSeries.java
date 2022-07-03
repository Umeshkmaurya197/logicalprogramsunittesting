package com.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("  ------ Welcome To  Fibonacci Series -------- ");
		Scanner scanner=new Scanner(System.in);
		System.out.println("\n  Enter the number to get Fabonacci Series :");
		int num =scanner.nextInt();
		int first=0;
		int second=1;
		int sum = first + second ;
		System.out.print(" Fibonacci Series : "+first+", "+sum+", " );
		for( int i = 0 ; i < num-2 ; i++ )
		{
			sum=first+second;
			first=second;
			second=sum;
			
			System.out.print(sum+", ");
		}
		scanner.close();
	}
}
