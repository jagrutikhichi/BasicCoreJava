package com.bridglab;

public class FlipCoin {
	public static void main(String[] args) {

		int head = 0;
		int numOfFlips = 10;

		flip(head, numOfFlips);
	}

	private static void flip(int head, int numOfFlips) {
		for (int i = 0; i < numOfFlips; i++) {
			if (Math.random() > 0.5) {
				head++;
				System.out.println(head);
			}
		}
		double percentofHeads = (head * 100) / numOfFlips;
		double percentofTails = 100 - percentofHeads;
		System.out.println("Tails % : " + percentofTails);
		System.out.println("Heads % : " + percentofHeads);
	}
	

}
