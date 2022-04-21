package com.maven.in;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Login extends BaseClass {
	public static void main(String[] args) throws IOException {

		BaseClass b = new BaseClass();
		b.browserConfigChrome();
		b.Openurl("https://adactinhotelapp.com/");
		WebElement txtuser = b.LocatedById("username");
		b.Inputname(txtuser,
				b.excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1, 0));
		WebElement txtpass = b.LocatedById("password");
		b.Inputname(txtpass,
				b.excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1, 1));
		WebElement loginbtn = b.LocatedById("login");
		b.Click(loginbtn);
		WebElement loc = b.LocatedById("location");
		b.DropDownValue(loc, "New York");
		WebElement hot = b.LocatedById("hotels");
		b.DropDownIndex(hot, 3);
		WebElement rt = b.LocatedById("room_type");
		b.DropDownByvisibleText(rt, "Super Deluxe");
		WebElement roomno = b.LocatedById("room_nos");
		b.DropDownValue(roomno, "7");
		WebElement adult = b.LocatedById("adult_room");
		b.DropDownByvisibleText(adult, "2 - Two");
		WebElement childroom = b.LocatedById("child_room");
		b.DropDownValue(childroom, "1");
		b.LocatedById("Submit").click();
		b.LocatedById("radiobutton_0").click();
		b.LocatedById("continue").click();
		WebElement txtnme = b.LocatedById("first_name");
		b.Inputname(txtnme,
				b.excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 0));
		WebElement lstname = b.LocatedById("last_name");
		b.Inputname(lstname,
				b.excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 1));
		WebElement add = b.LocatedById("address");
		b.Inputname(add,
				b.excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 2));
		WebElement ccnum = b.LocatedById("cc_num");
		b.Inputname(ccnum,
				b.excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 3));
		WebElement type = b.LocatedById("cc_type");
		b.DropDownValue(type, "MAST");
		WebElement month = b.LocatedById("cc_exp_month");
		b.DropDownValue(month, "12");
		WebElement year = b.LocatedById("cc_exp_year");
		b.DropDownValue(year, "2022");
		WebElement cvv = b.LocatedById("cc_cvv");
		b.Inputname(cvv,
				b.excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 4));
		b.LocatedById("book_now").click();
		WebElement BtnBook = b.LocatedByxpath("//a[text()='Booked Itinerary']");
		b.Click(BtnBook);
//		WebElement order = b.LocatedById("order_id_598625");
//		b.text("BookingId:", order);
		b.LocatedById("btn_id_600310").click();
		b.Alert();
		
		
		

	}
}
