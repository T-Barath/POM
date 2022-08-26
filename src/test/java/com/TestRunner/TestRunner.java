package com.TestRunner;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base_Class.BaseClass1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src\\test\\java\\com\\feature", glue ="com.StepDefinition")
	
	public class TestRunner extends BaseClass1{
			public static WebDriver driver;
		@BeforeClass
		public static void setUp() {
			driver = BaseClass1.getBrowser("Chrome");
			driver.get("https://adactinhotelapp.com");
			
		}

		@AfterClass
		public static void tearDown() {
			BaseClass1.close();

		}
	}
