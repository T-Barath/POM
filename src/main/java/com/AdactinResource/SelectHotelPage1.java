package com.AdactinResource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage1 {
	public static WebDriver driver;
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement selectt;
	
	@FindBy(name="continue")
	private WebElement continuee;

	public SelectHotelPage1(WebDriver driver2) {
	this.driver= driver2;
	PageFactory.initElements(driver2, this);
	}

	public WebElement getSelectt() {
		return selectt;
	}

	public WebElement getContinuee() {
		return continuee;
	}

	}