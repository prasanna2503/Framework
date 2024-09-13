package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellRead {
	
	public static void main(String[] args) throws IOException    {
		
		File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\FrameClass\\Excel Sheets\\Credntials.xlsx");
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Login");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				
				switch (type) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
						String format = dateFormat.format(dateCellValue);
						System.out.println(format);
					} else {
						double numericCellValue = cell.getNumericCellValue();
						long round = Math.round(numericCellValue);
						if (numericCellValue==round) {
							String valueOf = String.valueOf(round);
							System.out.println(valueOf);
						} else {
							String valueOf = String.valueOf(numericCellValue);
							System.out.println(valueOf);
						}
					}
					break;
				default:
					break;
				}
				
			}
		}
	}
		
}
