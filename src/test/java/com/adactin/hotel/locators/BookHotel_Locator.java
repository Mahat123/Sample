package com.adactin.hotel.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookHotel_Locator extends SelectHotel_Locator{
	public static WebElement getfirst_Name() {
		return driver.findElement(By.xpath("(//input[@type='text'])[11]"));
	}
	public static WebElement getlast_Name() {
		return driver.findElement(By.xpath("(//input[@type='text'])[12]"));
	}
	public static WebElement getaddress() {
		return driver.findElement(By.id("address"));
	}
	public static WebElement getcc_Num() {
		return driver.findElement(By.id("cc_num"));
	}
	public static WebElement getcc_Type() {
		return driver.findElement(By.id("cc_type"));
	}
	public static WebElement getcc_Month() {
		return driver.findElement(By.id("cc_exp_month"));
	}
	public static WebElement getcc_Year() {
		return driver.findElement(By.id("cc_exp_year"));
	}
	public static WebElement getcc_Cvv() {
		return driver.findElement(By.id("cc_cvv"));
	}
	public static WebElement getbook_Now() {
		return driver.findElement(By.id("book_now"));
	}
	
}
