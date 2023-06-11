package com.in.recursion13;

public class StringLength {
	public static int calculateLength(String str) {
		if (str.isEmpty()) {
			// Base case: the string is empty, so its length is 0
			return 0;
		} else {
			// Recursive case: remove the first character of the string and
			// recursively calculate the length of the remaining substring
			return 1 + calculateLength(str.substring(1));
		}
	}

	public static void main(String[] args) {
		String str = "Rishita";
		int length = calculateLength(str);
		System.out.println("Length of the string: " + length);

	}

}
