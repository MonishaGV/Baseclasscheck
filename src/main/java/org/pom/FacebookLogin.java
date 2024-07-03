package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin extends BaseClass {

	public  FacebookLogin() {
	PageFactory.initElements(driver, this);
	}
	
	
	@CacheLookup
	@FindBy(id="email")
	private WebElement textuser;
	
	@CacheLookup
	@FindBy(id="pass")
	private WebElement password;

	public WebElement getTextuser() {
		return textuser;
	}

	public WebElement getPassword() {
		return password;
	}

	
	
}
