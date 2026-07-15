package day6;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) 
		{
		//I want to sum the digits in a number
		//e.g. 345 = Result -> Sum 3+4+5 = 12
			
		//int num = 345;
		
		// to remove the last digit	
		//int temp = num/10;  

		// to extract the last digit from a number
		//int temp = num%10; 			
	
		//System.out.println(temp);
			
		try (Scanner scanner = new Scanner(System.in)) 
		{
			System.out.println("Enter a number");
			int num = scanner.nextInt();
			int sum =0;
			
			while (num>0)
			{
				// extract the last digit and add it to the sum - Main logic	
				sum = sum + num%10; 
				
				// remove the last digit
				num  = num/10; 
			}
			
			System.out.println("Sum of Digits: "+sum);
		}
			
		}

	}		
