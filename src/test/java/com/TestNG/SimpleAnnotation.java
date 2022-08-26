package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	static WebDriver driver;

	@Test
	public void driver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace1\\Selenium\\Driver103\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void url() {
		driver.get("https://adactinhotelapp.com/");	
	}
	@Test
	public void login() {
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("barath1234");

	
	}

}