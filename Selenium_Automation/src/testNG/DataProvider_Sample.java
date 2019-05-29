package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProvider_Sample {
	@Test(dataProvider = "nalini")
	public void f(String username, String password) throws InterruptedException {
		System.out.println(username);
		System.out.println(password);
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chrome-74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Firefox browser launch
		driver.get("https://www.facebook.com/");
		// EditBox Script
		// driver.findElement(By.Locatername("LocaterValue")).sendKeys("inputData");
		driver.findElement(By.name("email")).sendKeys(username);// nalini@gmail.com
		driver.findElement(By.name("pass")).sendKeys(password);
		// Click()
		// driver.findElement(By.Locatername("LocaterValue")).click();
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		// validate whether giver username and password is valid or not?
		// Signup element has present or not?
		// if any element has present on page that element size would be 1 else 0
		if (driver.findElements(By.xpath("//*[@id='blueBarDOMInspector']/div/div[2]/div/div/span/a")).size() > 0) {
			System.out.println("Given credentials are invalid");
		} else {
			System.out.println("Given credentials are valid");
		}

	}

	@DataProvider
	public Object[][] nalini() {
		return new Object[][] {
			new Object[] { "Test@gmail.com", "asdf@123" },
			new Object[] { "Sample@gmail.com", "Jan@2019" },
			new Object[] { "sadf@gmail.com", "Summer@123" },
			};

	}
}
