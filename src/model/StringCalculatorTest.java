package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() {
		int result = StringCalculator.add(null);
		assertEquals(result, 0);
	}

	@Test
	public void test2() {
		int result = StringCalculator.add("");
		assertEquals(result, 0);
	}

}
