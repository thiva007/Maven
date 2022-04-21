package com.maven.in;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Users extends BaseClass {
	@org.junit.Before
	public void Before() {
		browserConfigChrome();
		Openurl("https://adactinhotelapp.com/");
		Maximizewindow();

	}

	@After
	public void Afterclass() {
		Close();
	}

	@Test
	public void Tc1() throws IOException {
		WebElement txtuser = LocatedById("username");
		Inputname(txtuser,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1, 0));
		WebElement txtpass = LocatedById("password");
		Inputname(txtpass,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1, 1));
		LocatedById("login").click();
		WebElement loc = LocatedById("location");
		DropDownValue(loc, "New York");
		WebElement hot = LocatedById("hotels");
		DropDownIndex(hot, 3);
		WebElement rt = LocatedById("room_type");
		DropDownByvisibleText(rt, "Super Deluxe");
		WebElement roomno = LocatedById("room_nos");
		DropDownValue(roomno, "7");
		WebElement adult = LocatedById("adult_room");
		DropDownByvisibleText(adult, "2 - Two");
		WebElement childroom = LocatedById("child_room");
		DropDownValue(childroom, "1");
		LocatedById("Submit").click();
		LocatedById("radiobutton_0").click();
		LocatedById("continue").click();
		WebElement txtnme = LocatedById("first_name");
		Inputname(txtnme,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 0));
		WebElement lstname = LocatedById("last_name");
		Inputname(lstname,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 1));
		WebElement add = LocatedById("address");
		Inputname(add,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 2));
		WebElement ccnum = LocatedById("cc_num");
		Inputname(ccnum,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 3));
		WebElement type = LocatedById("cc_type");
		DropDownValue(type, "MAST");
		WebElement month = LocatedById("cc_exp_month");
		DropDownValue(month, "12");
		WebElement year = LocatedById("cc_exp_year");
		DropDownValue(year, "2022");
		WebElement cvv = LocatedById("cc_cvv");
		Inputname(cvv,excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 4));
		LocatedById("book_now").click();
		WebElement BtnBook = LocatedByxpath("//a[text()='Booked Itinerary']");
		Click(BtnBook);
		WebElement order = LocatedById("order_id_598625");
		text("BookingId:", order);
		Close();
	}
	@Test
	public void Tc2() throws IOException {
		WebElement txtuser = LocatedById("username");
		Inputname(txtuser,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1, 0));
		WebElement txtpass = LocatedById("password");
		Inputname(txtpass,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1, 1));
		LocatedById("login").click();
		WebElement loc = LocatedById("location");
		DropDownValue(loc, "New York");
		WebElement hot = LocatedById("hotels");
		DropDownIndex(hot, 3);
		WebElement rt = LocatedById("room_type");
		DropDownByvisibleText(rt, "Super Deluxe");
		WebElement roomno = LocatedById("room_nos");
		DropDownValue(roomno, "7");
		WebElement adult = LocatedById("adult_room");
		DropDownByvisibleText(adult, "2 - Two");
		WebElement childroom = LocatedById("child_room");
		DropDownValue(childroom, "1");
		LocatedById("Submit").click();
		LocatedById("radiobutton_0").click();
		LocatedById("continue").click();
		WebElement txtnme = LocatedById("first_name");
		Inputname(txtnme,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 4, 0));
		WebElement lstname = LocatedById("last_name");
		Inputname(lstname,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 4, 1));
		WebElement add = LocatedById("address");
		Inputname(add,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 4, 2));
		WebElement ccnum = LocatedById("cc_num");
		Inputname(ccnum,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 4, 3));
		WebElement type = LocatedById("cc_type");
		DropDownValue(type, "MAST");
		WebElement month = LocatedById("cc_exp_month");
		DropDownValue(month, "12");
		WebElement year = LocatedById("cc_exp_year");
		DropDownValue(year, "2022");
		WebElement cvv = LocatedById("cc_cvv");
		Inputname(cvv,excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 4, 4));
		LocatedById("book_now").click();
		WebElement BtnBook = LocatedByxpath("//a[text()='Booked Itinerary']");
		Click(BtnBook);
		WebElement order = LocatedById("order_id_599240");
		text("BookingId:", order);
		Close();
	}
	@Test
	public void Tc3() throws IOException {
		WebElement txtuser = LocatedById("username");
		Inputname(txtuser,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1, 0));
		WebElement txtpass = LocatedById("password");
		Inputname(txtpass,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1, 1));
		LocatedById("login").click();
		WebElement loc = LocatedById("location");
		DropDownValue(loc, "New York");
		WebElement hot = LocatedById("hotels");
		DropDownIndex(hot, 3);
		WebElement rt = LocatedById("room_type");
		DropDownByvisibleText(rt, "Super Deluxe");
		WebElement roomno = LocatedById("room_nos");
		DropDownValue(roomno, "7");
		WebElement adult = LocatedById("adult_room");
		DropDownByvisibleText(adult, "2 - Two");
		WebElement childroom = LocatedById("child_room");
		DropDownValue(childroom, "1");
		LocatedById("Submit").click();
		LocatedById("radiobutton_0").click();
		LocatedById("continue").click();
		WebElement txtnme = LocatedById("first_name");
		Inputname(txtnme,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 5, 0));
		WebElement lstname = LocatedById("last_name");
		Inputname(lstname,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 5, 1));
		WebElement add = LocatedById("address");
		Inputname(add,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 5, 2));
		WebElement ccnum = LocatedById("cc_num");
		Inputname(ccnum,
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 5, 3));
		WebElement type = LocatedById("cc_type");
		DropDownValue(type, "MAST");
		WebElement month = LocatedById("cc_exp_month");
		DropDownValue(month, "12");
		WebElement year = LocatedById("cc_exp_year");
		DropDownValue(year, "2022");
		WebElement cvv = LocatedById("cc_cvv");
		Inputname(cvv,excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 5, 4));
		LocatedById("book_now").click();
		WebElement BtnBook = LocatedByxpath("//a[text()='Booked Itinerary']");
		Click(BtnBook);
		WebElement order = LocatedById("order_id_599242");
		text("BookingId:", order);
		Close();
	}

}
