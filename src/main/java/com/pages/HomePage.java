package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	
	//Locator for header
	private By header = By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]");

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	// Getter for header element
	public WebElement getHeader() {
		return getElement(header);
	}

	//page actions
	public String getHomePageHeader() {
		return getPageHeader(header);
		}
	
	public String getHomePageTitle() {
		return getPageTitle();
		
	}
	

	

}
