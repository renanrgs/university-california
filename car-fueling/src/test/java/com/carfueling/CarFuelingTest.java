package com.carfueling;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class CarFuelingTest {

	@Test
	public void testOneStop() {
		assertThat(CarFueling.calculate(50, new int[] { 0, 50 }), equalTo(0));
		assertThat(CarFueling.calculate(50, new int[] { 0, 50, 100 }), equalTo(1));
		assertThat(CarFueling.calculate(400, new int[] { 0, 200, 375, 550, 750, 950 }), equalTo(2));
	}

}
