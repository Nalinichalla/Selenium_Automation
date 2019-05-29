package coreJava;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshot {
	//create global variable for WebDriver
	static WebDriver driver ;

	public static void TakeScreenshot(String name) throws Exception {
		Date d = new Date();
		System.out.println(d);//Mon Apr 08 21:39:40 CDT 2019
		
		//create our own format dd_MM_yyyy_HH_mm_ss
		DateFormat df = new  SimpleDateFormat("yyyy_MMM_dd_HH_mm_ss");//08_Apr_2019_21_44_19
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
		// take screenshot
		String screenshotPath = "F:\\Selenium\\Workspace\\Selenium_Automation\\Screenshots\\";
		// take screenshot using below code and store it to RAM location
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File(screenshotPath + name +timeStamp+".png"));
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakeScreenshot("Homepage");
		// EditBox Script
		// driver.findElement(By.Locatername("LocaterValue")).sendKeys("inputData");
		driver.findElement(By.name("email")).sendKeys("nalini@gmail.com");
		TakeScreenshot("UN");
		driver.findElement(By.name("pass")).sendKeys("nalini123");
		TakeScreenshot("pwd");
		// Click()
		// driver.findElement(By.Locatername("LocaterValue")).click();
		driver.findElement(By.id("loginbutton")).click();
		TakeScreenshot("afterLogin");
		driver.close();

	}

}
