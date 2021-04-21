package org.groundFloor;

import java.util.Scanner;

public class Example {
public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value");

		int num =sc.nextInt();
		int reversevalue =0; 
		int originalvalue =num;
		while (num != 0) {
			int remainder =num%10;
			 reversevalue = reversevalue* 10 + remainder;
			 num/=10;
		}
		if (originalvalue==reversevalue) {
			System.out.println("it is palindrome"+originalvalue);
		} else {
			System.out.println("it is not palindrome"+originalvalue);

		}
	}
	



}
	

	
		