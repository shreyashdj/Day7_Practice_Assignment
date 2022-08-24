package com.bridgelabz.day7PracticeAssignment;

import java.util.Scanner;
/*
 * @author SHREYASH JADHAV
 */
public class ReverseString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		// created object of Scanner class
		
		System.out.print("Enter any string : ");
		String string = scan.next();		// tacking String input from user
		char[] charArray = string.toCharArray();		// storing characters of String in charArray
		
		// printing characters of charArray in reverse order
		System.out.print("Reverse of string : ");
		for (int i = charArray.length - 1; i >= 0; i-- ) {
		System.out.print(charArray[i]);
		}
				
				
scan.close();
	}
}