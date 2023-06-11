package com.in.recursion12;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
	public static List<String> subsets(String set) {
		List<String> result = new ArrayList<>();
		generateSubsets(set, "", 0, result);
		return result;
	}

	private static void generateSubsets(String set, String currentSubset, int index, List<String> result) {
		if (index == set.length()) {
			// Base case: We have reached the end of the set, so add the current subset to
			// the result
			result.add(currentSubset);
			return;
		}

		// Recursive case: For each character in the set, we have two choices:
		// 1. Exclude the character and move to the next index.
		// 2. Include the character in the current subset and move to the next index.

		// Exclude the character at the current index
		generateSubsets(set, currentSubset, index + 1, result);

		// Include the character at the current index
		generateSubsets(set, currentSubset + set.charAt(index), index + 1, result);
	}

	public static void main(String[] args) {
		String set = "abc";
		List<String> subsets = subsets(set);
		System.out.println(subsets);
	}
}
