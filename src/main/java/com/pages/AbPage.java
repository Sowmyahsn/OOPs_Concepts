package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbPage {

	WebDriver driver;
	WebDriverWait wait;

	// Constructor
	public AbPage(WebDriver driver) {

		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));

	}

	// abstract methods:
	public abstract String getPageTitle();

	public abstract String getPageHeader(By locator);

	public abstract WebElement getElement(By locator);

	// Explicit wait
	public abstract void waitForElementPresent(By locator);

	public abstract void waitForPageTitle(String title);
	//complete method
	public void login() {
		
		System.out.println("--------------------");
		
	}
		 
	}


