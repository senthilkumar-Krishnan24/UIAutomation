package com.uiautomation.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.uiautomation.pageobject.loginPageObject;
import com.uiautomation.support.broserConfig;

public class loginPageTest extends broserConfig{
	WebDriver dr1;
	
	@Parameters("browser")
	@BeforeClass
	public void browserUp(String browser) throws Exception {
		dr1 =browserSetup(browser);
	}
	
	
	@Test(groups = {"Regression Test Suite"})
	public void loginApplication() throws InterruptedException, IOException {
		
		loginPageObject loginpage = new loginPageObject(dr1);
		loginpage.logIntoApplication();
		
	}
	
	
	@AfterClass
	public void browserClose() {
		dr1.close();
	}

}
