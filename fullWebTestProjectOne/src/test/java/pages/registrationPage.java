package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class registrationPage extends BasePage{
	public String registrationPageUrl = "https://demo.nopcommerce.com/register?returnUrl=%2F";
	public String registrationPageTitle = "nopCommerce demo store. Register";
	public String h1title = "Register";
	public String h2title = "Your Personal Details";
	public By genderCheckBoxMale = By.xpath("//input[@id='gender-male']");
	public By genderCheckBoxFemale = By.xpath("//input[@id='gender-female']");
	public By firstNameBox = By.xpath("//input[@id='FirstName']");
	public By lastNameBox = By.xpath("//input[@id='LastName']");
	public By DOB_day = By.xpath("//select[@name='DateOfBirthDay']");
	public By DOB_month = By.xpath("//select[@name='DateOfBirthMonth']");
	public By DOB_year = By.xpath("//select[@name='DateOfBirthYear']");
	public By email = By.xpath("//input[@id='Email']");
	public By compnyName = By.xpath("//input[@id='Company']");
	public By newslatterCheckbox = By.xpath("//input[@id='Newsletter']");
	public By password = By.xpath("//input[@id='Password']");
	public By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
	public By registerButton = By.xpath("//button[@id='register-button']");
	public By registrationConfirmMessage = By.xpath("//div[@class='result']");
	public String registrationConfirmText = "Your registration completed";
}
