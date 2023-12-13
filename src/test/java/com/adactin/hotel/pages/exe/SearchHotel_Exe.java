package com.adactin.hotel.pages.exe;

import com.adactin.hotel.base.AdactinHotel_Base;

public class SearchHotel_Exe extends LoginPage_Exe{

	public static void location() {
		AdactinHotel_Base.dropdown_table(getlocation(), excel_Read_Base_Reuse(0,0));
	}
	public static void hotel() {
		AdactinHotel_Base.dropdown_table(gethotel(), excel_Read_Base_Reuse(1,0));
	}
	public static void roomType(){
		AdactinHotel_Base.dropdown_table(getroom_Type(), excel_Read_Base_Reuse(2,0));
	}
	public static void roomNos(){
		AdactinHotel_Base.dropdown_table(getroom_Nos(), excel_Read_Base_Reuse(3,0));
	}
	public static void checkin() {
		AdactinHotel_Base.input_cs(getdate_Check_In(), excel_Read_Base_Reuse(4,0));
	}
	public static void checkout() {
		AdactinHotel_Base.input_cs(getdate_Check_Out(), excel_Read_Base_Reuse(5,0));
	}
	public static void adultRoom(){
		AdactinHotel_Base.dropdown_table(getadult_Room(), excel_Read_Base_Reuse(6,0));
	}
	public static void childRoom(){
		AdactinHotel_Base.dropdown_table(getchild_Room(), excel_Read_Base_Reuse(7,0));
	}
	public static void submit() {
		AdactinHotel_Base.click_Value(getsubmit());
	}
}
