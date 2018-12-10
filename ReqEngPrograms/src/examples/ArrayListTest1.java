package examples;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayListTest1 {

	ArrayList<String> list;

	@BeforeEach
	public void initObject() {
		list = new ArrayList<String>();
	}

	@Test
	@DisplayName("Test 1: Adding two elements")
	public void test1() {
		// Test Case 1: Test, if adding two elements to a list was successful
		list.add("John");
		list.add("Ben");
		assertEquals(2, list.size());
		assertEquals("John", list.get(0));
		assertEquals("Ben", list.get(1));
	}

	@Test
	@DisplayName("Test 2: Adding one element")
	public void test2() {
		// Test Case 2: Test, if adding one element to a new list was successful
		list.add("Hugo");
		assertEquals(1, list.size());
		assertEquals("Hugo", list.get(0));
	}

}