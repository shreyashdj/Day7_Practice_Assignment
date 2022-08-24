package com.bridgelabz.day7PracticeAssignment;

import java.util.Scanner;
/*
 * @author SHREYASH JADHAV
 */
public class RemoveCharWithoutAlphabate {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		// created object of Scanner class
		
		System.out.print("Enter any string : ");
		String input = scan.next();			// taking String input from user
		char [] inputArray = input.toCharArray();	// storing char of String in inputArray
		
		// stored char (A to Z) & (a to z) in alphabet array
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
							'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		// printing char of inputArray if it match with any char of alphabet array
		System.out.print("Input string with only alphabets : ");
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < alphabet.length; j++ ) {
				if (inputArray[i] == alphabet[j]) {
					System.out.print(inputArray[i]);
				}
			}
		}
		
scan.close();
	}
}