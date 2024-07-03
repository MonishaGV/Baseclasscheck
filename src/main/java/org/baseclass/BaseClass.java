package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 
	public static WebDriver driver;
	
	
	 public static WebDriver browserLanuch(String bname) {

		
		switch(bname) {
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
		
		case "edge":
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		break;
		
		default:
			throw new WebDriverException();
		}
		return driver;
		
	}
	 public static void urlLanuch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		 
	}
	 
	 public static void wait(int a) {
		 driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
		 	
	}
	 
        
	}

