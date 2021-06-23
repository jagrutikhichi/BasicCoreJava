package com.bridglab;

public class Powerof2 {

	public static void main(String[] args) {
		int num = 4;
		int power = 1;
		if (num < 31) {
			for (int i=1; i<=num; i++) 
			{
				power = (2 * power);
				System.out.println("power of 2 is : "+power);
			}
		}
	}

}
