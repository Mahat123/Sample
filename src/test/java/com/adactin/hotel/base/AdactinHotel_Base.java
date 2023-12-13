package com.adactin.hotel.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel_Base {

	public static WebDriver driver = null;

	public static void browserLaunch(String a) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(a);
	}

	public static void input_data(WebElement element, String data) {
	element.sendKeys(data);
	}

	public static void input_cs(WebElement element, String data) {
	element.clear();
	element.sendKeys(data);
	}

	public static void click_Value(WebElement element) {
	element.click();
	}

	public static void dropdown_table(WebElement element, String data){
	Select s = new Select (element);
	s.selectByValue(data);
	}
	
	public static void radio_button(WebElement element) {
//	System.out.println(element.isDisplayed());
//	System.out.println(element.isEnabled());
//	System.out.println(element.isSelected());
		element.isDisplayed();
		element.isEnabled();
		element.isSelected();
		element.click();
	}
	
	public static void text_write(WebElement element) {
	 String order =  element.getAttribute("value");
	 System.out.println(order);
	}
	
	public static String excel_Read_Base_Reuse (int r2, int c2) {
    String value =null;
	try {

	File f = new File ("C:\\Users\\ganes\\eclipse-workspace\\new\\AdactinHotel\\src\\test\\resources\\Test Data\\adactin.xlsx");
	FileInputStream f1 = new FileInputStream (f);
	Workbook wb = new XSSFWorkbook (f1);
	Sheet sheet = wb.getSheet("Sheet1");
	Row row1 = sheet.getRow(r2);
	Cell c1 = row1.getCell(c2);
	int c3 = c1.getCellType();

	if(c3==1) {
	value = c1.getStringCellValue();
	System.out.println(value);
	}
	else if(c3==0) {
	if(DateUtil.isCellDateFormatted(c1)){
	Date gdcv = c1.getDateCellValue();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	value = sdf.format(gdcv);
	System.out.println(value);
	}
	else {
	double num_value = c1.getNumericCellValue();
	long l = (long) num_value;
	value= String.valueOf(l);
	System.out.println(value);
	}
	}
	}
	catch (FileNotFoundException e) {

	} catch (IOException e) {
	}
	
	return value;
	}
	

 public static String prop_Write_Base_Reuse(String data) {
	 String value = null;
	 try {
		 File f = new File("C:\\Users\\ganes\\eclipse-workspace\\new\\AdactinHotel\\"
		 		+ "src\\test\\resources\\Test Data\\config.properties");
		 FileReader fr = new FileReader(f);
		 Properties pr = new Properties();
		 pr.load(fr);
		 value = pr.getProperty(data);	
		 System.out.println(value);
	 }
	 catch (FileNotFoundException e) {
		 
	 }
	 catch (IOException a) {
		 
	 }
	 return value;
}
}