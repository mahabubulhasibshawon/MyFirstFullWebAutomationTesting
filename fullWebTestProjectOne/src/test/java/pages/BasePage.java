package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utilities.driverSetup.getDriver;

import java.time.Duration;

public class BasePage {
//	finding an element
	public WebElement getElement(By locator) {
		return waitForElementPresenc(locator);
//		return getDriver().findElement(locator);
	}
//	clicking on element
	public void clickOnElement(By locator) {
		waitforElementTobeClickable(locator);
		getElement(locator).click();
	}
//	write on element
	public void writeOnElement(By locator, String text) {
		getElement(locator).clear();
		getElement(locator).sendKeys(text);
	}
//	getting text
	public String getElementString(By locator) {
		return getElement(locator).getText();
	}
//	checking visibility of element on webpage
	public boolean isElementVisible(By locator) {
		return getElement(locator).isDisplayed();
	}
//	waiting for element
	public WebElement waitForElementPresenc(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
//	waiting for element to be clickable
	public void waitforElementTobeClickable(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
//	select visible text
	public void selectWithVisibleText(By selectlocator , String visibleText) {
		Select select = new Select(getElement(selectlocator));
		select.selectByVisibleText(visibleText);
	}

}
