package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
	public String homepageUrl = "https://demo.nopcommerce.com/";
	public String homePageTitle = "nopCommerce demo store";
	public By registrationButton = By.xpath("//a[normalize-space()='Register']");
	public By loginButton = By.xpath("//a[normalize-space()='Log in']");
}
