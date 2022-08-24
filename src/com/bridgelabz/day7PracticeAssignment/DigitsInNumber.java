package com.bridgelabz.day7PracticeAssignment;

import java.util.Scanner;
/*
 * @author SHREYASH JADHAV
 */
public class DigitsInNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	// created object of Scanner class
		
		System.out.print("Enter a number : ");
		int num = scan.nextInt();	// taking input of number
		
		//	calculating number of digits
		int digits = 0;
		while (num > 0) {
			num /=  10;
			digits++;
		}
		System.out.println("Digits in number = " + digits);
		
scan.close();
	}
}