package com.TestNG;

import org.testng.annotations.Test;

public class GroupTesting {

	@Test(groups = "Footwear")
	private void Clogs() {
		System.out.println("Clogs");

	}

	@Test(groups = "Footwear")
	private void slides() {
		System.out.println("Slides");

	}

	@Test(groups = "Footwear")
	private void shoes() {
		System.out.println("Shoes");

	}

	@Test(groups = "Dresses")
	private void tshirt() {
		System.out.println("Tshirt");

	}

	@Test(groups = "Dresses")
	private void jeans() {
		System.out.println("jeans");

	}

	@Test(groups = "Dresses")
	private void leggings() {
		System.out.println("Leggings");

	}

	@Test(groups = "Phone")
	private void iphone() {
		System.out.println("Iphone");

	}

	@Test(groups = "Phone")
	private void samsung() {
		System.out.println("Samsung");

	}

	@Test(groups = "Phone")
	private void blackberry() {
		System.out.println("Blackberry");

	}
}
