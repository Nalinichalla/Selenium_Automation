package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		// EditBox Script
		// driver.findElement(By.Locatername("LocaterValue")).sendKeys("inputData");
		driver.findElement(By.name("email")).sendKeys("H2OTESTINGTOOLS@GMAIL.COM");//nalini@gmail.com
		driver.findElement(By.name("pass")).sendKeys("selenium@7");
		// Click()
		// driver.findElement(By.Locatername("LocaterValue")).click();
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		// validate whether giver username and password is valid or not?
		// Signup element has present or not?
		// if any element has present on page that element size would be 1 else 0
		if (driver.findElements(By.xpath("//*[@id='blueBarDOMInspector']/div/div[2]/div/div/span/a")).size() > 0) {
			System.out.println("Given credentials are invalid");
		}
		else {
			System.out.println("Given credentials are valid");	
		}

		driver.close();

	}
}
