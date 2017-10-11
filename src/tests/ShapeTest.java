package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.*;

public class ShapeTest {

	/*
	 * Write a test for Shape's compareTo method.
	 * 
	 * Also create SquareTest.java and CircleTest.java JUnit test cases.
	 * Test each class's constructor method and calculateArea method.
	 */
	@Test
	public void testCompareTo() {
		Square s = new Square(5);
		Square q = new Square(5);
		Square k = new Square(7);
		assertEquals(s.compareTo(q), 0, 0);
		//assertEquals(s.compareTo(k), -1, 0);
	}

}
