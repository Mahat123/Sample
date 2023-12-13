package com.adactin.hotel.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectHotel_Locator extends SearchHotel_Locator{
	public static WebElement getradio() {
		return driver.findElement(By.xpath("//input[@type='radio']"));
	}
	public static WebElement getcontinue() {
		return driver.findElement(By.id("continue"));
	}

}
