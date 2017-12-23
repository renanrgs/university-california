package com.maxproductpaiwise;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Random;
import java.util.stream.LongStream;

import org.junit.Test;

import com.maxproductpairwise.MaxProductPairWise;

public class MaxProductPairWiseTest {

	@Test
	public void simpleTest() {
		long slowerResult = new MaxProductPairWise().getSlowerSolution(new long[] { 1, 2, 3 });
		long fasterResult = new MaxProductPairWise().getFasterSolution(new long[] { 1, 2, 3 });

		assertThat(slowerResult, equalTo(6L));
		assertThat(fasterResult, equalTo(6L));

	}

	@Test
	public void simpleTest10Elements() {
		long slowerResult = new MaxProductPairWise().getSlowerSolution(new long[] { 7, 5, 14, 2, 8, 8, 10, 1, 2, 3 });
		long fasterResult = new MaxProductPairWise().getFasterSolution(new long[] { 7, 5, 14, 2, 8, 8, 10, 1, 2, 3 });

		assertThat(slowerResult, equalTo(140L));
		assertThat(fasterResult, equalTo(140L));
	}

	@Test
	public void stressTest() {
		while (true) {
			Random random = new Random();
			int length = random.nextInt(9) + 2;
			System.out.println("The length is: " + length);
			long[] array = new long[length];

			for (int i = 0; i < length; i++) {
				array[i] = random.nextInt(100000);
			}

			LongStream intStream = LongStream.of(array);
			intStream.forEach(System.out::println);

			long resultSlower = new MaxProductPairWise().getSlowerSolution(array);
			long resultFaster = new MaxProductPairWise().getFasterSolution(array);

			System.out.println("Result Slower = " + resultSlower + "| Result Slower = " + resultFaster);
			assertThat(resultSlower, equalTo(resultFaster));

			System.out.println("OK!");
		}

	}

}
