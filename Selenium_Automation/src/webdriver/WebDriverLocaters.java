package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLocaters {

	public static void main(String[] args) {

		// ID
//		NAME
//		CLASS 
//		LinkText
//		Partial LinkTest
//		TAGNAME
//		XPATH
//		CSS Selector

		// click on Gmail link on https://www.google.com/
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		//driver.findElement(By.linkText("Images")).click();
		
		driver.findElement(By.partialLinkText("ma")).click();
		
		//driver.findElement(By.className("gb_d")).click();
		
	}

}
