package com.bridgelabz;

public class PerfectNumber {

	public static void main (String[]args)
	{
		int num = 6, sum = 0, i = 1;
		
		while(i < num){
			if(num % i == 0)
				sum = sum + i;
			i++;
		}

		if (sum == num)
			System.out.println (num + " Is a perfect number");
		else
			System.out.println (num + " Is not a perfect number");

	}
}
