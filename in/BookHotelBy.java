package com.maven.in;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelBy extends BaseClass {
	public BookHotelBy() {
PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="first_name")
	private WebElement frstname;
	@CacheLookup
	@FindBy(id="last_name")
	private WebElement scndname;
	@CacheLookup
	@FindBy(id="address")
	private WebElement add;
	@CacheLookup
	@FindBy(id="cc_num")
	private WebElement ccnum;
	@CacheLookup
	@FindBy(id="cc_type")
	private WebElement ddcctype;
	@CacheLookup
	@FindBy(id="cc_exp_month")
	private WebElement ddccexpmnth;
	@CacheLookup
	@FindBy(id="cc_exp_year")
	private WebElement ddccexyr;
	@CacheLookup
	@FindBy(id="cc_cvv")
	private WebElement cvvnum;
	@CacheLookup
	@FindBy(id="book_now")
	private WebElement booknow;
	public WebElement getFrstname() {
		return frstname;
	}
	public WebElement getScndname() {
		return scndname;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getDdcctype() {
		return ddcctype;
	}
	public WebElement getDdccexpmnth() {
		return ddccexpmnth;
	}
	public WebElement getDdccexyr() {
		return ddccexyr;
	}
	public WebElement getCvvnum() {
		return cvvnum;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	

}
