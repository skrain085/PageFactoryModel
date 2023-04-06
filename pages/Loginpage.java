package com.PageFactoryModel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
		WebDriver driver;
		
		@FindBy(id="user-name")
		WebElement userName;
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(id="login-button")
		WebElement login_button;
		
		//By userName = By.id("user-name");
		//By password = By.id("password");
		//By login = By.id("login-button");
		
		public Loginpage(WebDriver driver){
			PageFactory.initElements(driver, this);
			//this.driver = driver;
		}
		
		public void enterUserName() {
			
			userName.sendKeys("standard_user");
			//driver.findElement(userName).sendKeys("standard_user");
		}
		
	    public void enterPassword() {
	    	password.sendKeys("secret_sauce");
	    	//driver.findElement(password).sendKeys("secret_sauce");
		}
	    public void clickOnLogin() {
	    	
	    	login_button.click();
	    	//driver.findElement(login).click();
	    }

	}

