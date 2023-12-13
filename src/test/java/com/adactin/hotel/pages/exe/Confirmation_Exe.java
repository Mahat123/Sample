package com.adactin.hotel.pages.exe;

import com.adactin.hotel.base.AdactinHotel_Base;

public class Confirmation_Exe extends BookHotel_Exe{
	public static void order_Id() throws InterruptedException {
		Thread.sleep(5000);
		AdactinHotel_Base.text_write(getorder_Id());
	}

}
