package com.adactin.hotel.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Locators extends AdactinHotel_Base {
	
	public static WebElement user() {
		return driver.findElement(By.id("username"));	
	}
	public static WebElement pass() {
		return driver.findElement(By.id("password"));
	}
	public static WebElement login_Button() {
		return driver.findElement(By.id("login"));
	}
	public static WebElement location() {
		return driver.findElement(By.id("location"));
	}
	public static WebElement hotel(){
		return driver.findElement(By.id("hotels"));	
	}
	public static WebElement room_Type(){
		return driver.findElement(By.id("room_type"));	
	}
	public static WebElement room_Nos() {
		return driver.findElement(By.xpath("//*[@id=\"room_nos\"]"));
	}
	public static WebElement date_Check_In() {
		return driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));	
	}
	public static WebElement date_Check_Out() {
		return driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));	
	}
	public static WebElement adult_Room() {
		return driver.findElement(By.xpath("//*[@id=\"adult_room\"]"));
	}
	public static WebElement child_Room() {
		return driver.findElement(By.id("child_room"));
	}
	public static WebElement submit_Tab() {
		return driver.findElement(By.id("Submit"));
	}
	public static WebElement radio() {
		return driver.findElement(By.xpath("//input[@type='radio']"));
	}
	public static WebElement conti_Nue() {
		return driver.findElement(By.id("continue"));
	}
	public static WebElement first_Name() {
		return driver.findElement(By.xpath("(//input[@type='text'])[11]"));
	}
	public static WebElement last_Name() {
		return driver.findElement(By.xpath("(//input[@type='text'])[12]"));
	}
	public static WebElement address() {
		return driver.findElement(By.id("address"));
	}
	public static WebElement cc_Num() {
		return driver.findElement(By.id("cc_num"));
	}
	public static WebElement cc_Type() {
		return driver.findElement(By.id("cc_type"));
	}
	public static WebElement cc_Month() {
		return driver.findElement(By.id("cc_exp_month"));
	}
	public static WebElement cc_Year() {
		return driver.findElement(By.id("cc_exp_year"));
	}
	public static WebElement cc_Cvv() {
		return driver.findElement(By.id("cc_cvv"));
	}
	public static WebElement book_Now() {
		return driver.findElement(By.id("book_now"));
	}
	public static WebElement order_Id() {
		return driver.findElement(By.cssSelector("#order_no"));
	}
}
