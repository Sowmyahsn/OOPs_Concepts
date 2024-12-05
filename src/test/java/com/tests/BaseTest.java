package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pages.AbPage;
import com.pages.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	public AbPage page;
	
	@BeforeMethod
	@Parameters(value = {"browser"})
	public void setUpTest(String browser) throws InterruptedException {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();}
		else if(browser.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();}
		else {
			System.out.println("no browser is defined in the xml file...");}
		
		
		driver.get("https://dsportalapp.herokuapp.com/login");
		Thread.sleep(2000);
		
		//Initialize the page object
		 page = new BasePage(driver);
			
			
		}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
}
	


