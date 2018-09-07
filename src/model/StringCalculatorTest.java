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
	
	@Test
	public void test3() {
		int result = StringCalculator.add("1");
		assertEquals(result, 1);
	}
	
	@Test
	public void test4() {
		int result = StringCalculator.add("1, 2");
		assertEquals(result, 3);
	}
	
	@Test
	public void test5() {
		int result = StringCalculator.add("4");
		assertEquals(result, 4);
	}

}
