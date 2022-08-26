package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	private void assertClass() {
		Assert.assertEquals("Hello", "Hello");
		System.out.println("Test 1 passed");

	}
	@Test
	private void assertClass1() {
		Assert.assertEquals("Hello", "Hallo");
		System.out.println("Test 2 passed");

	}
	@Test
	private void assertClass2() {
		Assert.assertEquals("Barath", "Barath");
		System.out.println("Test 3 passed");

}
	@Test
	private void assertClass3() {
		Assert.assertEquals("false", "false");
		System.out.println("Test 4 passed");
	}}
