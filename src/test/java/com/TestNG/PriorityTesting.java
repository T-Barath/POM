package com.TestNG;

import org.testng.annotations.Test;

public class PriorityTesting {

	@Test(priority=2)
	private void flipkart() {
		System.out.println("Flipkart");

	}

	@Test(priority=3)
	private void amazon() {
		System.out.println("Amazon");

	}

	@Test(priority = 1)
	private void myntra() {
		System.out.println("Myntra");

	}
}
