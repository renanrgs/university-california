package com.sampleone;

import java.util.Random;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("Random: " + random.nextInt(10));
		
		Scanner scanner = new Scanner(System.in);
		Integer a = Integer.valueOf(scanner.nextLine());
		Integer b = Integer.valueOf(scanner.nextLine());
		scanner.close(); 	
		System.out.println(a + b);
	}
}
