package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadParticularData {
	public static void readParticularData() throws IOException {
	
	File F = new File("C:\\Users\\barat\\eclipse-workspace1\\Pom\\Excel\\AdactinData.xlsx");
	FileInputStream fis = new FileInputStream(F);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	Row row = sheetAt.getRow(1);
	Cell cell = row.getCell(0);
	System.out.println(cell);
}
	
		public static void main(String[] args) throws IOException {
			readParticularData();
		}
	}
	
	

