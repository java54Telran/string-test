package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("test of the method concat")
	void concatTest() {
		String hello = "Hello";
		
		assertEquals("Hello World!!!", hello.concat(" World").concat("!!!"));
	}
	@Test
	void containsTest() {
		String hello = "Hello";
		assertTrue(hello.contains("ell"));
		assertFalse(hello.contains("elo"));
	}
	@Test
	void compareToTest() {
		assertEquals(8, "9".compareTo("12345")); //code of 9 - code of 1
		assertEquals(-4, "12345".compareTo("12349"));//code of 5 - code of 9
		assertEquals(1, "123459".compareTo("12345"));//length of "123459" - length of "12345"
		assertEquals(0, "Hello".compareTo("Hello"));
		assertEquals('H' - 'h', "Hello".compareTo("hello"));
		assertTrue("Hello".compareTo("hello") < 0);
	}
	@Test
	void testCompareToIgnoreCase() {
		assertEquals(8, "9".compareToIgnoreCase("12345"));//code of 9 - code of 1
		assertEquals(-4, "12345".compareToIgnoreCase("12349"));//code of 5 - code of 9
		assertEquals(2, "12345yu".compareToIgnoreCase("12345"));//different length
		assertEquals(0, "Hello".compareToIgnoreCase("HeLlO"));//code of lower case == code of upper case
		assertEquals(0, "Hello".compareToIgnoreCase("hello"));
		
		
	}
	@Test
	void testStartWith() {
		String hello = "Hello";
		assertTrue (hello.startsWith("He"));
		assertFalse(hello.startsWith("he"));
	}
	@Test
	void testEndWith() {
		String hello = "Hello";
		assertTrue (hello.endsWith("lo"));
		assertFalse(hello.endsWith("LO"));
	}
	@Test
	void testIndexOf() {
		//tested method indexOf(String str)
		String hello = "Hello";
		assertEquals(0, hello.indexOf("He"));
		assertEquals(2, hello.indexOf("llo"));
		assertEquals(4, hello.indexOf("o"));
	}
	@Test
	void testLastIndexOf() {
		//tested method lastIndexOf(int ch)
		String hello = "HHellooo";
		assertEquals(1, hello.lastIndexOf('H'));
		assertEquals(4, hello.lastIndexOf('l'));
		assertEquals(7, hello.lastIndexOf('o'));
	}
	@Test
	void equalsIgnoreCase() {
		String hello = "Hello";
		assertTrue(hello.equalsIgnoreCase("hElLO"));
		assertFalse(hello.equalsIgnoreCase("Hlelo"));
		
	}

}
