package com.in.recursion17;

public class CalculateConsonent {

	public static int countConsonants(String str) {
		str = str.toLowerCase();
		return countConsonantsRecursive(str, 0);
	}

	private static int countConsonantsRecursive(String str, int index) {
		if (index == str.length()) {
			// Base case: Reached the end of the string
			return 0;
		}

		char ch = str.charAt(index);
		if (isConsonant(ch)) {
			// Current character is a consonant
			return 1 + countConsonantsRecursive(str, index + 1);
		} else {
			// Current character is not a consonant
			return countConsonantsRecursive(str, index + 1);
		}
	}

	public static boolean isConsonant(char ch) {
		return ch >= 'a' && ch <= 'z' && !isVowel(ch);
	}

	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	public static void main(String[] args) {
		String str = "Hello, World!";
		int consonantCount = countConsonants(str);
		System.out.println("Total number of consonants: " + consonantCount);
	}

}
