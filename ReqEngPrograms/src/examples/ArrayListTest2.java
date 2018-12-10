package examples;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArrayListTest2 {

	static ArrayList<String> list;

	@BeforeAll
	public static void initObject() {
		list = new ArrayList<String>();
	}

	@Test
	public void test1() {
		// Test Case 1: Test, if initializing the list was successful
		assertNotNull(list);
		assertEquals(0, list.size());
	}

	@Test
	public void test2() {
		// Test Case 2: Test, if adding an element was successful
		list.add("Hugo");
		list.add("Boris");
		assertEquals(2, list.size());
		assertEquals("Hugo", list.get(0));
		assertEquals("Boris", list.get(1));
	}

	@Test
	public void test3() {
		// Test Case 3: Test, if adding another element was successful
		list.add("Rainer");
		assertEquals("Rainer", list.get(2));
		assertEquals(3, list.size());
	}

	@Test
	public void test4() {
		// Test Case 3: Test, if deleting an element was successful
		list.remove("Hugo");
		assertEquals("Boris", list.get(0));
		assertEquals("Rainer", list.get(1));
		assertEquals(2, list.size());
	}
	
	
}