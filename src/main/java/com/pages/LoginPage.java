package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	// page elements:
	private By usernameBox = By.id("id_username");
	private By passwordBox = By.id("id_password");
	private By loginBtn = By.xpath("//input[@type='submit']");
	private By header = By.xpath("/html/body/div[1]/nav/a");
	private By errormsg = By.xpath("//div[contains(text(),'Please check your password')]");

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	 // Getters for elements
	public WebElement getUsernameBox() {
		return getElement(usernameBox);
	}

	
	public WebElement getPasswordBox() {
		return getElement(passwordBox);
	}

	public WebElement getLoginBtn() {
		return getElement(loginBtn);
	}
	
	public WebElement geterrormsg() {
		return getElement(errormsg);
	}
	
	
	//Specific methods
	public String  getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	public String getLoginPageTitle() {
		return getPageTitle();
		
	}
		
	
	//method overloading(positive testing)
	public void doLogin(String username,String password) {
		getUsernameBox().sendKeys(username);
		getPasswordBox().sendKeys(password);
		getLoginBtn().click();
		
		
	}
	//method overloading(negative testing)
	public void doLogin() {
		getUsernameBox().sendKeys("");
		getPasswordBox().sendKeys("");
		getLoginBtn().click();
		
		
	}
	//method overloading(negative testing)
	public void doLogin(String username) {
		getUsernameBox().sendKeys(username);
		getPasswordBox().sendKeys();
		getLoginBtn().click();
		
		
	}
}
