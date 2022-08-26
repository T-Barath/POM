package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {

	public static void readAllData() throws IOException {
		File f = new File("C:\\Users\\barat\\eclipse-workspace1\\Pom\\Excel\\AdactinData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int rowSize = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < rowSize; i++) {
			Row row = sheetAt.getRow(i);
			int cellSize = row.getPhysicalNumberOfCells();

			for (int j = 0; j < cellSize; j++) {
				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				} else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					System.out.println(numericCellValue);
				}
			}
		}

	}

	public static void main(String[] args) throws IOException {
		readAllData();
	}
}