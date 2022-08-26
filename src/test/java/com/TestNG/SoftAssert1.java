package com.TestNG;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	
	SoftAssert s = new SoftAssert();
	
	@Test
	private void assertClass() {
	s.assertEquals("Hello", "Hello");
		System.out.println("Test 1 passed");
s.assertAll();
	}
	@Test
	private void assertClass1() {
		s.assertEquals("Hello", "Hallo");
		System.out.println("Test 2 passed");
s.assertAll();
	}
	@Test
	private void assertClass2() {
		s.assertEquals("Barath", "Barath");
		System.out.println("Test 3 passed");
s.assertAll();
}
	@Test
	private void assertClass3() {
		s.assertEquals("false", "false");
		System.out.println("Test 4 passed");
		s.assertAll();
	}

}




