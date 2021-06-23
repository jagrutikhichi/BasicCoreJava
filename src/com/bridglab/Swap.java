package com.bridglab;

public class Swap {

	public static void swap(int a,int b)
	{
		int temp = a;
		a = b;
		b = a;
		System.out.println("Numbers after swapping a: "+a+" and b: "+b);
	}
	public static void main(String[] args) {
		int a = 3;
		int b = 4;	
		swap(a,b);
		System.out.println("Numbers before swapping a: "+a+" and b: "+b);
	}

}
