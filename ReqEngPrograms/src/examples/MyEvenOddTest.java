package examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyEvenOddTest {

	MyEvenOdd meo = new MyEvenOdd();

	@Test
	public void testEvenOddNumber() {
		assertEquals(true, meo.isEvenNumber(12), "12 is a even number");
		System.out.println("@Test: testEvenOdd");
	}

	@Test
	public void testEvenOddNumber2() {
		assertEquals(false, meo.isEvenNumber(13), "13 is not a even number");
		System.out.println("@Test: testEvenOdd");
	}

}