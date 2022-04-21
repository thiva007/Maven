package com.maven.in;

import org.openqa.selenium.WebElement;

public class Reuse extends BaseClass {

	public static void main(String[] args) {
		Reuse r = new Reuse();
		r.browserConfigChrome();
		r.Openurl("https://demo.guru99.com/test/drag_drop.html");
		r.Maximizewindow();
		WebElement txtuser = r.LocatedById("email");
		txtuser.sendKeys("thiva");
		WebElement txtpass = r.LocatedById("pass");
		r.Inputname(txtpass, "12334");
		WebElement btn = r.LocatedByName("login");
		btn.click();
		WebElement get = r.LocatedById("pass");
		get.getText();
		WebElement attribute = r.LocatedById("pass");
		System.out.println(attribute);
		r.mouseAction(r.LocatedByxpath("//a[text()='COURSES']"));
		r.DragandDrop(r.LocatedByxpath("//a[text()=' BANK ']"), r.LocatedByxpath("//li[@class='placeholder']"));
		r.ContextClick(r.LocatedById(""));
		
	}

}
