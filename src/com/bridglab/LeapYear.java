package com.bridglab;

public class LeapYear 
{

	public static void main(String[] args)
	{
		
		int YearToCheck = (int)(Math.floor(Math.random()*10000) %10000);
		
		System.out.println(YearToCheck);
		if (YearToCheck >= 1000) 
		{
			if(YearToCheck % 4 ==0 &&  YearToCheck % 100 != 0 || YearToCheck % 400 ==0) 
			{
				System.out.println("Leap Year");
			}
			else 
			{
				System.out.println("Not leap Year");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
		

	}
}










