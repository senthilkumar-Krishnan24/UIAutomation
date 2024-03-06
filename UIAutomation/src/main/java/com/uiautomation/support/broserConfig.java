package com.uiautomation.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class broserConfig {
	
	public static WebDriver driver;
	
	public WebDriver browserSetup(String browser)throws Exception {
		
		if (browser.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\senthilkumar.k\\OneDrive - Tavant Technologies\\Documents\\Automation\\Software\\Software Selenium\\jar_files\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
		}
		return driver;
		
		
	}

}
