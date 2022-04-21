package com.maven.in;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBy extends BaseClass {
	public CancelBy() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "btn_id_598625")
	private WebElement Alert;

	public WebElement getAlert() {
		return Alert;
	}

}
