package com.adactin.hotel.pages.exe;

import com.adactin.hotel.base.AdactinHotel_Base;
import com.adactin.hotel.locators.Confirmation_Booking_Locator;

public class LoginPage_Exe extends Confirmation_Booking_Locator {
	
	public static void username() {
		AdactinHotel_Base.input_data(getuser(), prop_Write_Base_Reuse("Username"));
	}
    public static void password() {
    	AdactinHotel_Base.input_data(getpass(), prop_Write_Base_Reuse("Password"));
    }
    public static void login() {
    	AdactinHotel_Base.click_Value(getlogin());
    }
}
