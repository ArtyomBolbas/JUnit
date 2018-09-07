package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test11() {
		int result = StringCalculator.add(null);
		assertEquals(result, 0);
	}

	@Test
	public void test12() {
		int result = StringCalculator.add("");
		assertEquals(result, 0);
	}
	
	@Test
	public void test13() {
		int result = StringCalculator.add("1");
		assertEquals(result, 1);
	}
	
	@Test
	public void test14() {
		int result = StringCalculator.add("1, 2");
		assertEquals(result, 3);
	}
	
	@Test
	public void test15() {
		int result = StringCalculator.add("4");
		assertEquals(result, 4);
	}
	
	@Test
	public void test21() {
		int result = StringCalculator.add("1, 2, 3");
		assertEquals(result, 6);
	}
	
	@Test
	public void test22() {
		int result = StringCalculator.add("1,1,1,1");
		assertEquals(result, 4);
	}
	
	@Test
	public void test23() {
		int result = StringCalculator.add("1,2");
		assertEquals(result, 3);
	}
	
	@Test
	public void test24() {
		int result = StringCalculator.add("11,22,33");
		assertEquals(result, 66);
	}
	
	@Test
	public void test31() {
		int result = StringCalculator.add("1 \n2,3");
		assertEquals(result, 6);
	}
	
	@Test
	public void test32() {
		int result = StringCalculator.add("4\n5\n6");
		assertEquals(result, 15);
	}
	
	@Test
	public void test33() {
		int result = StringCalculator.add("77\n");
		assertEquals(result, 77);
	}
	
	@Test
	public void test41() {
		int result = StringCalculator.add("1, 1001");
		assertEquals(result, 1);
	}
	
	@Test
	public void test42() {
		int result = StringCalculator.add("1002 \n2");
		assertEquals(result, 2);
	}
	
	@Test
	public void test43() {
		int result = StringCalculator.add("1, 1000");
		assertEquals(result, 1001);
	}
	
	@Test
	public void test44() {
		int result = StringCalculator.add("1000, 1000");
		assertEquals(result, 2000);
	}
	
	@Test
	public void test45() {
		int result = StringCalculator.add("1001\n1001");
		assertEquals(result, 0);
	}
	
}
