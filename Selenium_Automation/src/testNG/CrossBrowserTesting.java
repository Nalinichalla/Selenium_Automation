package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class CrossBrowserTesting {
	WebDriver driver;

	@Test
	public void login() {
		// Firefox browser launch
		driver.get("https://www.facebook.com/");
		// EditBox Script
		// driver.findElement(By.Locatername("LocaterValue")).sendKeys("inputData");
		driver.findElement(By.name("email")).sendKeys("H2OTESTINGTOOLS@GMAIL.COM");
	}

	
	@Parameters("browsername")
	@BeforeClass // pre-condtion
	public void beforeClass(String browsername ) {

		if (browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chrome-74\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", ".\\BrowserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		} else {
			System.out.println("Please enter valid browser name");
		}
	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

}
