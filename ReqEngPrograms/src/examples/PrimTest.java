package examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PrimTest {

	@Test
	public void testIsPrime1() {
		assertEquals(true, Prim.isPrim(13), "13 is a prime number");
	}

	@Test
	public void testIsPrime2() {
		assertEquals(false, Prim.isPrim(22), "22 is not a prime number");
	}

	@Test
	public void testIsPrime3() {
		assertEquals(true, Prim.isPrim(37), "37 is a prime number");
	}
}