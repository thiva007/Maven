package com.maven.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class Adatin extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClass b = new BaseClass();
		
b.browserConfigChrome();
b.Openurl("https://adactinhotelapp.com/");
b.Click(b.LocatedByxpath("//a[text()='New User Register Here']"));
WebElement txtusername = b.LocatedById("username");
b.Inputname(txtusername, b.excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1,0));
WebElement txtpass = b.LocatedById("password");
b.Inputname(txtpass, b.excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1,1));
WebElement txtpass1 = b.LocatedById("re_password");
b.Inputname(txtpass1, b.excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1,2));
WebElement txtfull = b.LocatedById("full_name");
b.Inputname(txtfull, b.excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1,3));
WebElement txtemail = b.LocatedById("email_add");
b.Inputname(txtemail, b.excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1,4));
b.wait(6000);
WebElement radiobtn = b.LocatedById("tnc_box");
b.Click(radiobtn);
WebElement subbtn = b.LocatedById("Submit");
b.Click(subbtn);

	}
}