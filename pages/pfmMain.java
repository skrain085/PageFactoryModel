package com.PageFactoryModel.pages;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;


public class pfmMain {

	public static void main(String[] args) {
		try {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.get("https://www.saucedemo.com/");
			
			Loginpage login = new Loginpage(driver);
			login.enterUserName();
			Thread.sleep(2000);
			login.enterPassword();
			Thread.sleep(2000);
			login.clickOnLogin();
			Thread.sleep(2000);
			
			productpage product = new productpage(driver);
			product.changeFilters();
			Thread.sleep(2000);
			product.logout();
			driver.close();
			
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}

	}

}
