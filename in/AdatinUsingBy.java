package com.maven.in;

import java.io.IOException;

public class AdatinUsingBy extends BaseClass {
	public static void main(String[] args) throws IOException {
		browserConfigChrome();
		Openurl("https://adactinhotelapp.com/");
		Maximizewindow();

		Loginn l = new Loginn();
		Inputname(l.getTxtuser(),
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1, 0));
		Inputname(l.getTxtpass(),
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 1, 1));
		Takescreenshot("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\screenshot//1.png");
		Click(l.getBtnlogin());

		SearchHotelBy s = new SearchHotelBy();

		DropDownValue(s.getDdlocation(), "New York");
		DropDownIndex(s.getDdhotels(), 3);
		DropDownByvisibleText(s.getDdroomtype(), "Super Deluxe");
		DropDownValue(s.getDdnumofroom(), "7");
		DropDownByvisibleText(s.getDdadultsroom(), "2 - Two");
		DropDownValue(s.getDdchildroom(), "1");
		Takescreenshot("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\screenshot//2.png");
		Click(s.getDdsearch());

		SelectHotelBy h = new SelectHotelBy();

		Click(h.getRtbtn());
		Takescreenshot("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\screenshot//3.png");
		Click(h.getCnt());

		BookHotelBy a = new BookHotelBy();

		Inputname(a.getFrstname(),
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 0));
		Inputname(a.getScndname(),
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 1));
		Inputname(a.getAdd(),
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 2));
		Inputname(a.getCcnum(),
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 3));
		DropDownValue(a.getDdcctype(), "MAST");
		DropDownValue(a.getDdccexpmnth(), "12");
		DropDownValue(a.getDdccexyr(), "2022");
		Inputname(a.getCvvnum(),
				excelRead("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx", "sheet2", 3, 4));
		Takescreenshot("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\screenshot//4.png");
		Click(a.getBooknow());

		BookidBy o = new BookidBy();
		Click(o.getBtnbook());
		Takescreenshot("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\screenshot//5.png");
		text("BookingId:", o.getOrderid());
	}

}
