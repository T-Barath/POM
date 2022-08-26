package com.RunnerClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
public static WebDriver driver;
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;


 public LoginPage1(WebDriver driver2) {
	 	this.driver=driver2;
	 	PageFactory.initElements(driver2, this);
	}

	public WebElement getusername() {
		return username;
	}

	public WebElement getpassword() {
		return password;
	}

	public WebElement getlogin() {
		return login;
	}
	
	

}


