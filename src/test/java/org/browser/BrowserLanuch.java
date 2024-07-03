package org.browser;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.FacebookLogin;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLanuch extends BaseClass{
	
	
	public static void main(String[] args) {
		BaseClass b=new BaseClass();
		b.browserLanuch("chrome");
		b.urlLanuch("https://www.facebook.com/");
		b.wait(20);
		FacebookLogin f=new FacebookLogin();
		sendKeys(f.getTextuser(),"susi");
	}

	private static void sendKeys(WebElement textuser, String string) {
		// TODO Auto-generated method stub
		
	}
	
		
	}


