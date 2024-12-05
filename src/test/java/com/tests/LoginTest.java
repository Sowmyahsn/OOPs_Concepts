package com.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginTest extends BaseTest {
	LoginPage loginPage;
	HomePage homePage;

	@Test(priority = 1)
	public void verifyLoginPageTitleTest() {
		loginPage = new LoginPage(driver);
		String title = loginPage.getLoginPageTitle();
		System.out.println("Page Title: " + title);
		Assert.assertEquals(title, "Login");

	}

	@Test(priority = 2)
	public void verifyLoginPageHeaderTest() {
		loginPage = new LoginPage(driver);
		String header = loginPage.getLoginPageHeader();
		System.out.println("Page Header: " + header);
		Assert.assertEquals(header, "NumpyNinja");
	}

	@Test(priority = 3)
	public void doValidLoginTest() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		loginPage.doLogin("ninjafox", "foxproject");
		String header = homePage.getHomePageHeader();
		// Validate that login was successful (this depends on the app's behavior)
		Assert.assertEquals(header,"Ninjafox");
	}

	/*@Test(priority = 4)
	public void doInvalidLoginTest() {
		loginPage = new LoginPage(driver);
		loginPage.doLogin(" ", " ");
		String msg ="please fill out this page";
		WebElement emsg = loginPage.geterrormsg();
		// Validate error message
		Assert.assertEquals(msg,emsg);

	}*/

}
