package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;

	@BeforeMethod
	private void browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace1\\Selenium\\Driver103\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	private void amazon() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\barat\\eclipse-workspace1\\Selenium\\Driver103\\chromedriver.exe" );
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

	}

	@Test
	private void flipkart() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\barat\\eclipse-workspace1\\Selenium\\Driver103\\chromedriver.exe" );
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

	}

}
