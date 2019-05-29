package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//Firefox browser launch
		driver.get("https://www.facebook.com/");
		// EditBox Script
		// driver.findElement(By.Locatername("LocaterValue")).sendKeys("inputData");
		driver.findElement(By.name("email")).sendKeys("H2OTESTINGTOOLS@GMAIL.COM");// nalini@gmail.com
		
	}
	

}
