package testCases;

import org.testng.annotations.Test;

import Utilities.driverSetup;
import junit.framework.Assert;
import pages.registrationPage;

public class testResigtration extends driverSetup{
	registrationPage registration_page = new registrationPage();
	
	@Test
	public void testUserRegistrationProcess() {
		getDriver().get(registration_page.registrationPageUrl);
		registration_page.clickOnElement(registration_page.genderCheckBoxMale);
		registration_page.writeOnElement(registration_page.firstNameBox, "Md.");
		registration_page.writeOnElement(registration_page.lastNameBox, "Karim");
		registration_page.selectWithVisibleText(registration_page.DOB_day, "5");
		registration_page.selectWithVisibleText(registration_page.DOB_month, "July");
		registration_page.selectWithVisibleText(registration_page.DOB_year, "2000");
		registration_page.writeOnElement(registration_page.email, "bitemi6348@bustayes.com");
		registration_page.writeOnElement(registration_page.compnyName, "XYZ");
		registration_page.writeOnElement(registration_page.password, "12345@A");
		registration_page.writeOnElement(registration_page.confirmPassword, "12345@A");
		registration_page.clickOnElement(registration_page.registerButton);
		
		Assert.assertTrue(registration_page.isElementVisible(registration_page.registrationConfirmMessage));
		Assert.assertEquals(registration_page.getElementString(registration_page.registrationConfirmMessage), registration_page.registrationConfirmText);
	}
}
