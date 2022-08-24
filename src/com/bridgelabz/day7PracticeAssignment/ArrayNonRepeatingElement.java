package com.bridgelabz.day7PracticeAssignment;

import java.util.Arrays;
import java.util.Scanner;
/*
 * @author SHREYASH JADHAV
 */
public class ArrayNonRepeatingElement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		// created object of Scanner class
		
		System.out.print("Enter size of array : ");
		int n = scan.nextInt();		// taking array size input from user
		
		int repeating = 0;
		int [] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random()*5+1);
		}
		System.out.println(Arrays.toString(array));		// printing array elements in String format
		
		// finding and printing non repeating elements of array 
		System.out.println("Non repeating elements of array are :");
		for (int i = 0; i < n; i++) {
				for (int j = i+1; j < n; j++) {
					if (array[i] == array[j]) {
						repeating++;
						array[j] = 0;
					} 
				}
			if (repeating == 0 && array[i] != 0) {
				System.out.print(array[i] +"  ");
			} else {
				repeating = 0;
			}
		}
		
scan.close();
	}
}