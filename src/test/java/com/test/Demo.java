package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement userBox = driver.findElement(By.id("email"));
		userBox.sendKeys("Prasanna");
		
		WebElement passBox = driver.findElement(By.id("pass"));
		passBox.sendKeys("Prasanna@123");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}
}
