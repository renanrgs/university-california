package com.sampleone;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer a = Integer.valueOf(scanner.nextLine());
		Integer b = Integer.valueOf(scanner.nextLine());
		scanner.close();
		System.out.println(a + b);
	}
}
