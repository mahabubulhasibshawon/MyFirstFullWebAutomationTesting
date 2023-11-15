package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Utilities.driverSetup.getDriver;

public class BasePage {
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
}
