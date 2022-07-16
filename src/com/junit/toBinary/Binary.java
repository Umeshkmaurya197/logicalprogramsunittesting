package com.junit.toBinary;

public class Binary{
	
		public static String  toBinary(int num) {
			String remainder ="";
			String reverse ="";
			
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
		return reverse;
		}
		
		public static void main (String []args) {
			int num=109;
			System.out.println("Binary Representation of "+num+" is : "+toBinary(109));
			
		}
}
