package com.PageFactoryModel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class productpage {
	WebDriver driver;
	
	@FindBy(xpath="//select[@data-test='product_sort_container']")
	WebElement filter;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement menuButton;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logout;
	
	//By filter = By.xpath("//select[@data-test='product_sort_container']");
	//By menuButton = By.id("react-burger-menu-btn");
	//By logout = By.id("logout_sidebar_link");
	
	public productpage(WebDriver driver){
		PageFactory.initElements(driver,this);
		//this.driver = driver;
		}
	public void changeFilters(){
		//WebElement filele = driver.findElement(filter);
		Select sel = new Select(filter);
		sel.selectByIndex(2);
	}
	public void logout(){
		menuButton.click();
		logout.click();
			
	}
}
