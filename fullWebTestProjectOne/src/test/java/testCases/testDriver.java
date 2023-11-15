package testCases;

import org.testng.annotations.Test;

import Utilities.driverSetup;
import junit.framework.Assert;
import pages.HomePage;

public class testDriver extends driverSetup{
	HomePage homepage = new HomePage();
	@Test
	public void testHomePageTitle() {
		getDriver().get(homepage.homepageUrl);//loading browser
		Assert.assertEquals(getDriver().getTitle(), homepage.homePageTitle);//checking title 
		
	}
}
