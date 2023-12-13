package com.adactin.hotel.pages.exe;

import com.adactin.hotel.base.AdactinHotel_Base;

public class BookHotel_Exe extends SelectHotel_Exe{
	public static void first_Name() {
		AdactinHotel_Base.input_data(getfirst_Name(), excel_Read_Base_Reuse(0,1));
	}
	public static void last_Name() {
		AdactinHotel_Base.input_data(getlast_Name(), excel_Read_Base_Reuse(1,1));
	}
	public static void address() {
		AdactinHotel_Base.input_data(getaddress(), excel_Read_Base_Reuse(2,1));
	}
	public static void cc_Num() {
		AdactinHotel_Base.input_data(getcc_Num(), excel_Read_Base_Reuse(3,1));
	}
	public static void cc_Type(){
		AdactinHotel_Base.dropdown_table(getcc_Type(), excel_Read_Base_Reuse(4,1));
	}
	public static void cc_Month(){
		AdactinHotel_Base.dropdown_table(getcc_Month(), excel_Read_Base_Reuse(5,1));
	}
	public static void cc_Year(){
		AdactinHotel_Base.dropdown_table(getcc_Year(), excel_Read_Base_Reuse(6,1));
	}
	public static void cc_Cvv() {
		AdactinHotel_Base.input_data(getcc_Cvv(),excel_Read_Base_Reuse(7,1) );
	}
	public static void book_Now() {
		AdactinHotel_Base.click_Value(getbook_Now());
	}
}
