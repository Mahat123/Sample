package com.adactin.hotel.pages.exe;

import com.adactin.hotel.base.AdactinHotel_Base;

public class SelectHotel_Exe extends SearchHotel_Exe{

	public static void radioButton() {
		AdactinHotel_Base.radio_button(getradio());
	}
	public static void continue_click() {
		AdactinHotel_Base.click_Value(getcontinue());
	}
}
