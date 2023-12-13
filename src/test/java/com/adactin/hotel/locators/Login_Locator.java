package com.adactin.hotel.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.adactin.hotel.base.AdactinHotel_Base;

public class Login_Locator extends AdactinHotel_Base{
	
	public static WebElement getuser() {
		return driver.findElement(By.id("username"));	
	}
	public static WebElement getpass() {
		return driver.findElement(By.id("password"));
	}
	public static WebElement getlogin() {
		return driver.findElement(By.id("login"));
	}

}
