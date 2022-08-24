package com.bridgelabz.day7PracticeAssignment;

import java.util.Scanner;
/*
 * @author SHREYASH JADHAV
 */
public class ArmstrongNumber {

	public static void main(String[] args) {

		// variables
		int lastDigit;
		int sum = 0;
		int digits = 0;
		
		Scanner scan = new Scanner(System.in);		// created object of Scanner class
		
		System.out.print("Enter a number : ");
		int number = scan.nextInt();	// taking input of number
		int num = number;
		
		//	calculating number of digits
		while (num > 0) {
			num /=  10;
			digits++;
		}
		
		//	sum of all digits raised to the power of total no. of digits
		num = number;
		while (num > 0) {
			lastDigit = num % 10;		// separating last digit
			sum += Math.pow(lastDigit,digits);
			num /= 10;
		}
		
		//	checking entered number is Armstrong no. or Not
		if (number == sum) {
			System.out.println(number +" is Armstrong number");
		} else {
			System.out.println(number +" is not Armstrong number");
		}
		
scan.close();
	}
}