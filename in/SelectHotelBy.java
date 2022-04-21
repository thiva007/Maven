package com.maven.in;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelBy extends BaseClass {
	public SelectHotelBy() {
PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="radiobutton_0")
	private WebElement Rtbtn;
	@CacheLookup
	@FindBy(id="continue")
	private WebElement cnt;
	public WebElement getRtbtn() {
		return Rtbtn;
	}
	public WebElement getCnt() {
		return cnt;
	}
	
	
	
	
	

}
