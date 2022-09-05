package com.bridgelabz;

public class AutomorphicNumber {

		static int isAutomorphic(int n){
	    int square = n * n;
	    while(n != 0){
	    
	        if(n % 10 != square % 10){
	            return 0;
	        }
	        n /= 10;
	        square /= 10;
	    }
	    return 1;
	}

		public static void main(String[] args) {
			   
			int number = 376, square = number * number ;
		    if(isAutomorphic(number) == 1)
		        System.out.println("Num: "+ number + ", Square: " + square + " is Automorphic");
		    else
		        System.out.println("Num: "+ number + ", Square: " + square + " is not Automorphic");	
			}
	}

