package com.in.recursion16;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	public static List<String> findPermutations(String str) {
		List<String> permutations = new ArrayList<>();
		backtrack(str.toCharArray(), 0, permutations);
		return permutations;
	}

	private static void backtrack(char[] strArray, int start, List<String> permutations) {
		if (start == strArray.length - 1) {
			// Base case: The current permutation is complete
			permutations.add(new String(strArray));
			return;
		}

		for (int i = start; i < strArray.length; i++) {
			// Swap the current character with the character at index 'start'
			swap(strArray, start, i);

			// Recursively find permutations with the updated array
			backtrack(strArray, start + 1, permutations);

			// Backtrack by restoring the original order of characters
			swap(strArray, start, i);
		}
	}

	private static void swap(char[] strArray, int i, int j) {
		String str = "abc";
		List<String> permutations = findPermutations(str);
		System.out.println("Permutations: " + permutations);
	}

	public static void main(String[] args) {
		String str = "abc";
		List<String> permutations = findPermutations(str);
		System.out.println("Permutations: " + permutations);
	}

}
