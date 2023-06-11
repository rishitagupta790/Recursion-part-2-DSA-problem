package com.in.recursion10;

public class PowerOfThree {

	public static void main(String[] args) {
		int n = 27;
		boolean result = isPowerOfThree(n);
		System.out.println(n + " is a power of three: " + result);
	}

	public static boolean isPowerOfThree(int n) {
		if (n <= 0) {
			return false;
		}

		while (n % 3 == 0) {
			n /= 3;
		}

		return n == 1;
	}
}
