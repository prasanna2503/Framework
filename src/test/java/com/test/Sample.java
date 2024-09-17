package com.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\FrameClass\\Excel Sheets\\ExcelWrite.xlsx");
		
		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("Sheet1");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("country-list"));
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for (int i=0; i < options.size(); i++) {
			
			Row row = sheet.createRow(i);
			
			Cell cell = row.createCell(0);
			
			WebElement countryList = options.get(i);
			
			String text = countryList.getText();
			
			cell.setCellValue(text);
			
			
			
		}
		
		FileOutputStream out = new FileOutputStream(file);
		
		workbook.write(out);		
		
		
		
	}	
		
}

