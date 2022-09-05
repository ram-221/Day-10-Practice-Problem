/*A strong number is a special number that can be defined as an addition of factorial of each digit of the
number, which is equal to the number itself. To bette runderstand the concept of a strong number*/


package com.bridgelabz;
import java.util.Scanner;

public class StrongNumber {

	public static void main(String args[]) {
		int number,i;
		int factNumber,lastdig;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : " );
		number = sc.nextInt();
		int total = 0;
		int tempNumber = number;
		while(number != 0)
		{
			i = 1;
			factNumber = 1;
			lastdig = number % 10;
			while(i <= lastdig)
			{
				factNumber = factNumber * i;
				i++;
			}
			total = total + factNumber;
			number = number / 10;
		}
		if(total == tempNumber)
			System.out.println(tempNumber + " is a strong number\n");
		else
			System.out.println(tempNumber + " is not a strong number\n");
		System.out.println();
	}
}