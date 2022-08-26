package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting {
	WebDriver driver;
	@Test
	private void url() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\barat\\eclipse-workspace1\\Selenium\\Driver103\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");

	}
	
	@Test(dataProvider = "MYDATA")
	private void credentials(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
	
	}
	@DataProvider(name="MYDATA")
	public Object[][] inputData(){
		return new Object[][] {
			{"barath","2345"},{"Boom","3478483"}
			};
		
	}
			
	}