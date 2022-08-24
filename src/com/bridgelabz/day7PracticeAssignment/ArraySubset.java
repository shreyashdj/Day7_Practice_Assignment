package com.bridgelabz.day7PracticeAssignment;

import java.util.Arrays;
import java.util.Scanner;
/*
 * @author SHREYASH JADHAV
 */
public class ArraySubset {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		// created object of Scanner class
		
		System.out.print("Enter size of firstArray : ");
		int n1 = scan.nextInt();						// tacking size of firstArray as input
		
		System.out.print("Enter size of secondArray : ");
		int n2 = scan.nextInt();						// tacking size of secondArray as input
		
		int notMatch = 0;
		int [] firstArray = new int[n1];
		int [] secondArray = new int[n2];
		
		// storing elements of firstArray
		for (int i = 0; i < n1; i++) {
			firstArray[i] = (int) (Math.random()*5+1);
		}
		
		// storing elements of secondArray
		for (int i = 0; i < n2; i++) {
			secondArray[i] = (int) (Math.random()*5+1);
		}
		
		// printing elements of both arrays in String format
		System.out.println("\n firstArray : " + Arrays.toString(firstArray));
		System.out.println(" secondArrray : " + Arrays.toString(secondArray));
		
		/*
		 *  matching elements of secondArray with firstArray
		 *  and checking is it subset of firstArray
		 */
		
		for (int i = 0; i < n2; i++) {
				int match = 0;
				for (int j = 0; j < n1; j++) {
					if (secondArray[i] == firstArray[j]) {
						match++;
						break;
					} 
				}
			if (match == 0) {
				notMatch++;
				System.out.println("\n secondArray is Not Subset of firstArray");
				break;
			}
		}
		
		if (notMatch == 0) {
			System.out.println("\n secondArray is Subset of firstArray");
		}
		
scan.close();
	}
}