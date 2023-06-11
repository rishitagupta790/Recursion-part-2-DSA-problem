package com.in.recursion15;

public class TowerOfHonoi {
	public static void towerOfHanoi(int n, int source, int auxiliary, int destination) {
		if (n == 1) {
			// Base case: Only one disk remaining, directly move it from source to
			// destination
			System.out.println("move disk 1 from rod " + source + " to rod " + destination);
			return;
		}

		// Move (n-1) disks from source to auxiliary rod using destination as the
		// auxiliary
		towerOfHanoi(n - 1, source, destination, auxiliary);

		// Move the nth disk from source to destination
		System.out.println("move disk " + n + " from rod " + source + " to rod " + destination);

		// Move (n-1) disks from auxiliary to destination rod using source as the
		// auxiliary
		towerOfHanoi(n - 1, auxiliary, source, destination);
	}

	public static void main(String[] args) {
		int N = 3;
		towerOfHanoi(N, 1, 2, 3);
	}

}
