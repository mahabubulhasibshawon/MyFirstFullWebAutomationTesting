package testCases;

import org.testng.annotations.Test;

import Utilities.driverSetup;
import junit.framework.Assert;
import pages.HomePage;
import pages.loginPage;
import pages.registrationPage;

public class testDriver extends driverSetup{
//	creating objects
	HomePage homepage = new HomePage();
	registrationPage registrationpage = new registrationPage();
	loginPage loginpage = new loginPage();
	
	@Test
	public void testHomePageTitle() {
		getDriver().get(homepage.homepageUrl);//loading browser
		Assert.assertEquals(getDriver().getTitle(), homepage.homePageTitle);//checking title 
	}
	@Test
	public void testHomePageUrl() {
		getDriver().get(homepage.homepageUrl);//loading browser
		Assert.assertEquals(getDriver().getCurrentUrl(), homepage.homepageUrl);//checking url 
	}
	@Test
	public void testHomePageRegistrationButton() {
		getDriver().get(homepage.homepageUrl);//loading browser
		homepage.getElement(homepage.registrationButton).click();
		Assert.assertEquals(getDriver().getCurrentUrl(), registrationpage.registrationPageUrl);//checking reg page url
		Assert.assertEquals("Register", registrationpage.h1title); //checking title
	}
	@Test
	public void testHomePageLogInButton() {
		getDriver().get(homepage.homepageUrl);//loading browser
		homepage.getElement(homepage.loginButton).click();
		Assert.assertEquals(getDriver().getCurrentUrl(), loginpage.logInPageUrl);//checking log in page url
		Assert.assertEquals("Welcome, Please Sign In!", loginpage.pageTitle); //checking title
	}
}
