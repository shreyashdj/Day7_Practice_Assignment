package com.bridgelabz.day7PracticeAssignment;

import java.util.Scanner;
/*
 * @author SHREYASH JADHAV
 */
public class NumberToWords {
	
	public static void main(String[] args) {
		
		int[] pos = new int[7];
		
		String[] oneToNine = {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine "};
		String[] tensMultiple = {"","","twenty ","thirty ","fourty ","fifty ","sixty ","seventy ","eighty ","ninety "};
				
		Scanner scan = new Scanner(System.in);	// created object of Scanner class
		
		System.out.print("Enter max six digit number : ");
		int number = scan.nextInt();	// taking input of number 
				
		if (number > 999999) {	// checking if number is of max six digit or not
			System.out.println("Entered number have more than six digit");
		} else {
		
			// printing number in words
			
			System.out.print(number +" : ");
			
			if (number == 0) {
				System.out.print("zero");
			}

			int num = number;
			int i = 0;
			while (num > 0) {
				i++;
			 	int lastDigit = num % 10;
				pos[i] = lastDigit;
				num /= 10;
			 }
			
			if (pos[6] != 0) {
				System.out.print(oneToNine[pos[6]] +"lakh ");
			}
			
			if (pos[5] > 1) {
				System.out.print(tensMultiple[pos[5]]);
			}
			
			if (pos[5] != 1 && pos[4] != 0) {
				System.out.print(oneToNine[pos[4]]);
			}
			
			if (pos[5] == 1) {
				int tenToNineteen = (number / 1000) % 100; 
				TenToNineteen(tenToNineteen);
			}

			if ((number / 1000) % 100 != 0 ) {
				System.out.print("thousand ");
			}
			
			if (pos[3] != 0) {
			System.out.print( oneToNine[pos[3]] +"hundred ");
			}
			
			if (pos[2] > 1) {
				System.out.print(tensMultiple[pos[2]]);
			}
			
			if (pos[2]  != 1 && pos[1] != 0) {
				System.out.print(oneToNine[pos[1]]);
			}
			
			if (pos[2] == 1) {
				int tenToNineteen = number % 100; 
				TenToNineteen(tenToNineteen);
			}
		}
		
scan.close();
	}

	 static void TenToNineteen(int tenToNineteen) {
			
		 //	this method print numbers (10 to 19) in words
		 
			switch (tenToNineteen) {
			case (10) -> System.out.print("ten ");
			case (11) -> System.out.print("eleven ");
			case (12) -> System.out.print("twelve ");
			case (13) -> System.out.print("thirteen ");
			case (14) -> System.out.print("fourteen ");
			case (15) -> System.out.print("fifteen ");
			case (16) -> System.out.print("sixteen ");
			case (17) -> System.out.print("seventeen ");
			case (18) -> System.out.print("eighteen ");
			case (19) -> System.out.print("nineteen ");
			}
	}
	
}