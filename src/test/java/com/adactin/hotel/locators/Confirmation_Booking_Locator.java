package com.adactin.hotel.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Confirmation_Booking_Locator extends BookHotel_Locator{
    public static WebElement getorder_Id() {
    	return driver.findElement(By.cssSelector("#order_no"));
    }
}
