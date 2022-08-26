package com.RunnerClass;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
		public static WebDriver driver;
	
		
		public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		}
		public LoginPage1 getLoginPage() {
			LoginPage1 lp=new LoginPage1(driver);
			return lp;
		}
		public SearchHotelPage1 getSearchHotelPage() {
			SearchHotelPage1 sp = new SearchHotelPage1(driver);
			return sp;
		}
		
		public SeletHotelPage1 getSelectHotelPage() {
			SeletHotelPage1 shp = new SeletHotelPage1(driver);
			return shp;
			}
		public BookHotelPage1 getBookHotelPage() {
			BookHotelPage1 bp = new BookHotelPage1(driver);
			return bp;
		}

}
