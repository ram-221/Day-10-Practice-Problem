package com.bridgelabz;

public class AbundantNumber {

	public static void main (String[]args) {

		int number = 60, sum = 0;

		for (int i = 1; i < number; i++) { 
			if (number % i == 0) sum = sum + i; 
		} 
		if (sum > number){
			System.out.println (number + " is an Abundant Number");
			System.out.println ("The Abundance is: " + (sum - number));
		}
		else
			System.out.println (number + " is not an Abundant Number");

	}
}
