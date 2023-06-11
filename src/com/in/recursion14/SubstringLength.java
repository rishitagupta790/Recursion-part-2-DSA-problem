package com.in.recursion14;

public class SubstringLength {
	public static int countSubstrings(String str) {
		return countSubstringsHelper(str, 0, str.length() - 1);
	}

	private static int countSubstringsHelper(String str, int start, int end) {
		// Base case: If the substring has length 0 or 1, it is a valid substring
		if (start >= end) {
			return 0;
		}

		// Recursive case:
		// If the first and last characters of the substring are the same,
		// increment the count and check the next substring.
		int count = (str.charAt(start) == str.charAt(end)) ? 1 : 0;
		count += countSubstringsHelper(str, start + 1, end - 1);

		// Check the substrings without including the first or last character
		count += countSubstringsHelper(str, start, end - 1);
		count += countSubstringsHelper(str, start + 1, end);

		return count;
	}

	public static void main(String[] args) {
		String str = "abcab";
		int count = countSubstrings(str);
		System.out.println("Count of contiguous substrings: " + count);
	}

}
