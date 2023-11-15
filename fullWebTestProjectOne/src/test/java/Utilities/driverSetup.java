package Utilities;

import java.time.Duration;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class driverSetup {
//	setting a browser
	private static String browserName = System.getProperty("browser", "chrome");
//	creating Thread local to run every taste case
	private static final ThreadLocal<WebDriver> LOCAL_DRIVER = new ThreadLocal<WebDriver>();
//	creating getter & setter methods
//	setter
	public static void setDriver(WebDriver driver) {
		driverSetup.LOCAL_DRIVER.set(driver);
	}
//	getter
	public static WebDriver getDriver() {
		return LOCAL_DRIVER.get();
	}

	public static WebDriver getBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			return new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			return new EdgeDriver();
		}else {
			throw new RuntimeErrorException(null, "Browser not found! using the given name : "+ browserName);
		}
	}
	
	@BeforeSuite
	public static synchronized void setBrowser() {
		WebDriver driver = getBrowser(browserName);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		setDriver(driver);
	}
	@AfterSuite
	public static synchronized void quiteBrowser() {
		getDriver().quit();
	}
}
