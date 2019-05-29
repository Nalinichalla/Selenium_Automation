package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL ="https://www.facebook.com/";
		driver.get(baseURL);
		//Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//String text = driver.findElement(By.className("inlineBlock _3ma _6n _6s _6v")).getText();
		
		String text = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/h2")).getText();
		System.out.println(text);
		
		driver.findElement(By.name("email")).sendKeys("nalini@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("nalini123");
	
		//driver.findElement(By.Locatername("LocaterValue")).click();
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		
		//GetcurrentURL from opened webpage
		String capturedUrl = driver.getCurrentUrl();
		System.out.println(capturedUrl);
		
		
	}

}
