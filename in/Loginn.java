package com.maven.in;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginn extends BaseClass  {
	public Loginn() {
		PageFactory.initElements(driver,this);
	}
	
	@CacheLookup
	@FindBy(id = "username")
	private WebElement txtuser;
	@CacheLookup
	@FindBy(id = "password")
	private WebElement txtpass;
	@CacheLookup
	@FindBy(id = "login")
	private WebElement btnlogin;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
}