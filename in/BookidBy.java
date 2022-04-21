package com.maven.in;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookidBy extends BaseClass{
	public BookidBy() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement btnbook;
	@CacheLookup
	@FindBy(id="order_id_598625")
	private WebElement orderid;
	public WebElement getBtnbook() {
		return btnbook;
	}
	public WebElement getOrderid() {
		return orderid;
	}

}
