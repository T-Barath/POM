package com.ConfiguratioReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public Properties p;
	public ConfigReader() throws IOException {
	File f = new File("C:\\Users\\barat\\eclipse-workspace1\\Pom\\src\\test\\java\\com\\ConfigurationProp\\Configuration.properties");
	FileInputStream FIS = new FileInputStream(f);
	p = new Properties();
	p.load(FIS);
	
	}
	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String geturl() {
	String url = p.getProperty("url");
	return url;
	}
	
public String getUserName(){
	String username = p.getProperty("username");
	return username;
}
public String getPassword() {
	String password = p.getProperty("password");
	return password;
}
public String getvalue() {
	String value = p.getProperty("val");
	return value;
}
public String getindex() {
	String index = p.getProperty("ind");
	return index;
}
public String visibleText() {
	String visibleText = p.getProperty("vis");
	return visibleText;
}
public String getLocation() {
	String location = p.getProperty("Location");
	return location;
}
public String getHotel() {
	String hotel = p.getProperty("Hotels");
	return hotel;
}
public String getRoomType() {
	String roomType = p.getProperty("RoomType");
	return roomType;
}
public String getroomNumber() {
	String roomNumber= p.getProperty("RoomNumber");
	return roomNumber;
}
public String getinDate() {
	String indate = p.getProperty("InDate");
	return indate;
}
public String getoutDate() {
	String outdate = p.getProperty("OutDate");
	return outdate;
}
public String getadultRoom() {
	String adult = p.getProperty("AdultRoom");
	return adult;
}
public String getChildroom() {
	String childroom = p.getProperty("ChildRoom");
	return childroom;
}
public String getFirstname() {
	String fname = p.getProperty("Fname");
	return fname;
}
public String getlastname() {
	String lname = p.getProperty("lname");
	return lname;
}
public String getaddress() {
	String address = p.getProperty("Address");
	return address;
}
public String getCCNum() {
	String ccnum = p.getProperty("CcNum");
	return ccnum;
}
public String getCCType() {
	String cctype = p.getProperty("CcType");
	return cctype;
}
public String getExpMonth() {
	String expmonth = p.getProperty("ExpMonth");
	return expmonth;
}
public String getExpYear() {
	String expyear = p.getProperty("ExpYear");
	return expyear;
}
public String getCVV() {
	String cvv = p.getProperty("Cvv");
	return cvv;
}

}
