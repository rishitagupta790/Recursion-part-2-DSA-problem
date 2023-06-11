package com.in.recursion11;

class Element {
	int lastRemaining(int n) {
		if (n == 1) {
			return 1;
		} else {
			if (n % 2 == 0) {
				return n + 1 - lastRemaining(n / 2);
			} else {
				return 2 * lastRemaining(n - 1) - 1;
			}
		}
	}
}

public class SingleNum {

	public static void main(String[] args) {
		int n = 9;
		Element ele = new Element();
		int result = ele.lastRemaining(n);
		System.out.println(result);
	}
}
