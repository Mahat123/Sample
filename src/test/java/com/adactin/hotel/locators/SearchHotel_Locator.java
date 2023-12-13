package com.adactin.hotel.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchHotel_Locator extends Login_Locator {
	
	public static WebElement getlocation() {
		return driver.findElement(By.id("location"));
	}
	public static WebElement gethotel(){
		return driver.findElement(By.id("hotels"));	
	}
	public static WebElement getroom_Type(){
		return driver.findElement(By.id("room_type"));	
	}
	public static WebElement getroom_Nos() {
		return driver.findElement(By.xpath("//*[@id=\"room_nos\"]"));
	}
	public static WebElement getdate_Check_In() {
		return driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));	
	}
	public static WebElement getdate_Check_Out() {
		return driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));	
	}
	public static WebElement getadult_Room() {
		return driver.findElement(By.xpath("//*[@id=\"adult_room\"]"));
	}
	public static WebElement getchild_Room() {
		return driver.findElement(By.id("child_room"));
	}
	public static WebElement getsubmit() {
		return driver.findElement(By.id("Submit"));
	}

}
