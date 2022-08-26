package com.RunnerClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ConfigurationProp.FileReaderManager;
import com.base_Class.BaseClass1;

public class RunnerClass1 extends BaseClass1 {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		driver = getBrowser("chrome");
//		getUrl("https://adactinhotelapp.com/");
//		PageObjectManager pom = new PageObjectManager(driver);
//		
//		inputValueElement(pom.getLoginPage().getUserName(), "barath1234");
//		inputValueElement(pom.getLoginPage().getPassword(), "9345720948");
//		clickOnElement(pom.getLoginPage().getLogin());
//		
//		dropdown(pom.getSearchHotelPage().getLocation(), "value", "New York");
//		dropdown(pom.getSearchHotelPage().getHotels(), "value", "Hotel Hervey");
//		dropdown(pom.getSearchHotelPage().getRoomType(), "value", "Super Deluxe");
//		dropdown(pom.getSearchHotelPage().getRoomNumber(), "value", "1");
//		clear(pom.getSearchHotelPage().getInClear());
//		inputValueElement(pom.getSearchHotelPage().getInDate(), "16/08/2022");
//		clear(pom.getSearchHotelPage().getOutClear());
//		inputValueElement(pom.getSearchHotelPage().getOutDate(), "18/08/2022");
//		dropdown(pom.getSearchHotelPage().getAdultRoom(), "value", "2");
//		dropdown(pom.getSearchHotelPage().getChildRoom(), "value", "0");
//		clickOnElement(pom.getSearchHotelPage().getSubmit());
//		
//		clickOnElement(pom.getSelectHotelPage().getSelectt());
//		clickOnElement(pom.getSelectHotelPage().getContinuee());
//		
//		inputValueElement(pom.getBookHotelPage().getFname(), "Barath");
//		inputValueElement(pom.getBookHotelPage().getLname(), "Thangavel");
//		inputValueElement(pom.getBookHotelPage().getAddress(), "Namakkal");
//		inputValueElement(pom.getBookHotelPage().getCcNum(), "5488565412548965");
//		dropdown(pom.getBookHotelPage().getCcType(), "value", "MAST");
//		dropdown(pom.getBookHotelPage().getExpmonth(), "value", "8");
//		dropdown(pom.getBookHotelPage().getExpYear(), "value", "2022");
//		inputValueElement(pom.getBookHotelPage().getCvv(), "916");
//		clickOnElement(pom.getBookHotelPage().getBookNow());
//		
	
		
//			getBrowser(FileReaderManager.getInstanceFRM().getInstanceCR().getbrowser());
			getUrl(FileReaderManager.getInstanceFRM().getInstanceCR().geturl());
			PageObjectManager pom = new PageObjectManager(driver);
//			
			inputValueElement(pom.getLoginPage().getusername(),FileReaderManager.getInstanceFRM().getInstanceCR().getUserName());
			inputValueElement(pom.getLoginPage().getpassword(),FileReaderManager.getInstanceFRM().getInstanceCR().getPassword());
			clickOnElement(pom.getLoginPage().getlogin());
			
			dropdown(pom.getSearchHotelPage().getLocation(),
					FileReaderManager.getInstanceFRM().getInstanceCR().getvalue(),
					FileReaderManager.getInstanceFRM().getInstanceCR().getLocation());
			dropdown(pom.getSearchHotelPage().getHotels(),FileReaderManager.getInstanceFRM().getInstanceCR().getvalue(),FileReaderManager.getInstanceFRM().getInstanceCR().getHotel());
			dropdown(pom.getSearchHotelPage().getRoomType(), FileReaderManager.getInstanceFRM().getInstanceCR().getvalue(),FileReaderManager.getInstanceFRM().getInstanceCR().getRoomType());
			dropdown(pom.getSearchHotelPage().getRoomNumber(), FileReaderManager.getInstanceFRM().getInstanceCR().getvalue(), FileReaderManager.getInstanceFRM().getInstanceCR().getroomNumber());
			clear(pom.getSearchHotelPage().getInClear());
			inputValueElement(pom.getSearchHotelPage().getInDate(), FileReaderManager.getInstanceFRM().getInstanceCR().getinDate() );
			clear(pom.getSearchHotelPage().getOutClear());
			inputValueElement(pom.getSearchHotelPage().getOutDate(), FileReaderManager.getInstanceFRM().getInstanceCR().getoutDate());
			dropdown(pom.getSearchHotelPage().getAdultRoom(),FileReaderManager.getInstanceFRM().getInstanceCR().getvalue(), FileReaderManager.getInstanceFRM().getInstanceCR().getadultRoom());
			dropdown(pom.getSearchHotelPage().getChildRoom(),FileReaderManager.getInstanceFRM().getInstanceCR().getvalue(),FileReaderManager.getInstanceFRM().getInstanceCR().getChildroom());
			clickOnElement(pom.getSearchHotelPage().getSubmit());
			
			clickOnElement(pom.getSelectHotelPage().getSelectt());
			clickOnElement(pom.getSelectHotelPage().getContinuee());
			
			inputValueElement(pom.getBookHotelPage().getFname(), FileReaderManager.getInstanceFRM().getInstanceCR().getFirstname());
			inputValueElement(pom.getBookHotelPage().getLname(), FileReaderManager.getInstanceFRM().getInstanceCR().getlastname());
			inputValueElement(pom.getBookHotelPage().getAddress(), FileReaderManager.getInstanceFRM().getInstanceCR().getaddress());
			inputValueElement(pom.getBookHotelPage().getCcNum(), FileReaderManager.getInstanceFRM().getInstanceCR().getCCNum());
			dropdown(pom.getBookHotelPage().getCcType(), FileReaderManager.getInstanceFRM().getInstanceCR().getvalue(),FileReaderManager.getInstanceFRM().getInstanceCR().getCCType());
			dropdown(pom.getBookHotelPage().getExpmonth(), FileReaderManager.getInstanceFRM().getInstanceCR().getvalue(),FileReaderManager.getInstanceFRM().getInstanceCR().getExpMonth());
			dropdown(pom.getBookHotelPage().getExpYear(), FileReaderManager.getInstanceFRM().getInstanceCR().getvalue(),FileReaderManager.getInstanceFRM().getInstanceCR().getExpYear());
			inputValueElement(pom.getBookHotelPage().getCvv(), FileReaderManager.getInstanceFRM().getInstanceCR().getCVV());
			clickOnElement(pom.getBookHotelPage().getBookNow());
			
		}

}