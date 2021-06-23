package com.bridglab;

public class OddEven {

	public static void main(String[] args) {
		
		double num = Math.floor(Math.random()*10);
		
		System.out.println(num);
		if (num % 2 == 0) 
		{
			System.out.println("The no is Even :"+num);
		}
		else 
		{
			System.out.println("The no is Odd "+num);
		}
	}

}
