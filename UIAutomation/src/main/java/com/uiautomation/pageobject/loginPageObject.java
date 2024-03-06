package com.uiautomation.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.uiautomation.support.broserConfig;

public class loginPageObject extends broserConfig {
	
	WebDriver driver;
	
	@FindBy(id = "user-name")	
	WebElement username;
	@FindBy(id = "password") 
	WebElement password;
	@FindBy(id = "login-button")
	WebElement loginButton;
	
	
	public loginPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logIntoApplication()throws InterruptedException, IOException {
		
		try{
			username.sendKeys("standard_user");
			password.sendKeys("secret_sauce");
			loginButton.click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
