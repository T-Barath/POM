package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	@Test
	@Parameters({"browsername"})
	
	private void getBrowser(String browsername) {
	if (browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\barat\\eclipse-workspace1\\Selenium\\Driver103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}else if (browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\barat\\eclipse-workspace1\\Selenium\\Driver103\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
	}
		
	}

	}


