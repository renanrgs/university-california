package com.carfueling;

public class CarFueling {

	public static Integer calculate(int fuelCapacity, int[] stops) {
		int currentPosition = 0;
		int result = 0;
		for (int i = 1; i < stops.length; i++) {
			if (stops[i] - stops[currentPosition] <= fuelCapacity) {
				continue;
			}
			result++;
			currentPosition = i - 1;
			i--;
		}

		return result;
	}

}
