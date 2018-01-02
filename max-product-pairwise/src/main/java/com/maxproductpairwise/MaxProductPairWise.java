package com.maxproductpairwise;

public class MaxProductPairWise {

	public long getSlowerSolution(long[] array) {
		long result = 0;
		if (array.length <= 1)
			throw new IllegalArgumentException("Illegal parameter.");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (result < array[i] * array[j])
					result = array[i] * array[j];
			}
		}
		return result;
	}
	//
	// public long getFasterSolution(long[] array) {
	//
	// int maxIndex = -1;
	// for (int i = 0; i < array.length; i++) {
	// if (maxIndex == -1 || array[i] > array[maxIndex]) {
	// maxIndex = i;
	// }
	// }
	//
	// int maxIndex2 = -1;
	// for (int i = 0; i < array.length; i++) {
	// if (i == maxIndex) {
	// continue;
	// }
	//
	// if (maxIndex2 == -1 || array[i] > array[maxIndex2]) {
	// maxIndex2 = i;
	// }
	// }
	//
	// return array[maxIndex] * array[maxIndex2];
	// }

	public long getFasterSolution(long[] input) {
		long positiveProduct = input[0] * input[1];
		long highestElement = Long.max(input[0], input[1]);

		long negativeProduct = input[0] * input[1];
		long lowestElement = Long.min(input[0], input[1]);

		for (int i = 2; i < input.length; i++) {
			if (positiveProduct < highestElement * input[i]) {
				positiveProduct = highestElement * input[i];
			}
			highestElement = Long.max(highestElement, input[i]);

			if (negativeProduct < lowestElement * input[i]) {
				negativeProduct = lowestElement * input[i];
			}

			lowestElement = Long.min(lowestElement, input[i]);
		}
		return positiveProduct > negativeProduct ? positiveProduct : negativeProduct;
	}

}
/*
 * 3, 6, 4, 2, 7
 * 
 * 3 * 6 >> 6 * 4 >> 6 * 2 >> 6 * 7
 */