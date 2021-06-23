package com.bridglab;

public class HarmonicNumber {

	public static void main(String[] args) {
		int num = 9;
		float harmonic = 1;
		for (int i = 2; i<= num; i++) 
		{
			harmonic += (float)1/i;
			System.out.println(harmonic);
		}
		System.out.println("Harmonic numer"+harmonic);		

	}

}
