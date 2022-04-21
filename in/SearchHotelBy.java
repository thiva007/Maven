package com.maven.in;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelBy extends BaseClass {
	public SearchHotelBy() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="location")
	private WebElement Ddlocation;
	@CacheLookup
	@FindBy(id="hotels")
	private WebElement Ddhotels;
	@CacheLookup
	@FindBy(id="room_type")
	private WebElement Ddroomtype;
	@CacheLookup
	@FindBy(id="room_nos")
	private WebElement Ddnumofroom;
	@CacheLookup
	@FindBy(id="adult_room")
	private WebElement Ddadultsroom;
	@CacheLookup
	@FindBy(id="child_room")
	private WebElement Ddchildroom;
	@CacheLookup
	@FindBy(id="Submit")
	private WebElement Ddsearch;
	public WebElement getDdlocation() {
		return Ddlocation;
	}
	public WebElement getDdhotels() {
		return Ddhotels;
	}
	public WebElement getDdroomtype() {
		return Ddroomtype;
	}
	public WebElement getDdnumofroom() {
		return Ddnumofroom;
	}
	public WebElement getDdadultsroom() {
		return Ddadultsroom;
	}
	public WebElement getDdchildroom() {
		return Ddchildroom;
	}
	public WebElement getDdsearch() {
		return Ddsearch;
	}
	
	

}
