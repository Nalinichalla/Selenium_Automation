package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", ".\\BrowserDrivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com/");
		// EditBox Script
		// driver.findElement(By.Locatername("LocaterValue")).sendKeys("inputData");
		driver.findElement(By.name("email")).sendKeys("H2OTESTINGTOOLS@GMAIL.COM");// nalini@gmail.com
	

	}

}
