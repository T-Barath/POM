package com.TestNG;

import org.testng.annotations.Test;

public class DependanceTest {
	
	@Test
	public void driver1() {
		System.out.println("Choose Driver");

	}
	@Test(dependsOnMethods = "driver1")
	private void browser() {
		System.out.println("Open Chrome browser");

	}
	
	@Test(dependsOnMethods = "browser")
	private void url() {
		System.out.println("Open Url");

	}
	
}
