package com.adactin.hotel.main.exe;


import com.adactin.hotel.pages.exe.Confirmation_Exe;

public class Overall_Exe extends Confirmation_Exe{
	public static void main(String[]args) throws InterruptedException {
		browserLaunch(prop_Write_Base_Reuse("Url"));
		username();
		password();
		login();
		location();
		hotel();
		roomType();
		roomNos();
		checkin();
		checkout();
		adultRoom();
		childRoom();
		submit();
		radioButton();
		continue_click();
		first_Name();
		last_Name();
		address();
		cc_Num();
		cc_Type();
		cc_Month();
		cc_Year();
		cc_Cvv();
		book_Now();
		order_Id();
		
		
		
	}
   
}
