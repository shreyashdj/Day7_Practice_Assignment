package com.bridgelabz.day7PracticeAssignment;

/*
 * @author SHREYASH JADHAV
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		
		// variables
		int start = 1;
		int end = 100;
		
		// printing prime numbers
		System.out.println("Prime numbers : ");
		for (int i = start; i <= end; i++) {
			 if (i == 2 || i % 2 != 0) {
					int count = 0;
					for (int j = 2; j <= i/2; j++) {
						if (i % j == 0) {
							count++;
							break;
						}
					}
				if (count == 0 && i > 1) {
					System.out.println(i);
				}
			}
		}
		
	}
}