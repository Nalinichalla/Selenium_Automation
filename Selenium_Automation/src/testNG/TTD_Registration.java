package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class TTD_Registration {
	WebDriver driver;
	@Test // functionality script will impliment here
	public void TTD_reg() throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//*[@name='fName']")).sendKeys("test");
		driver.findElement(By.xpath("//*[@name='lName']")).sendKeys("asdfd");
		driver.findElement(By.xpath("//*[@name='mobNo']")).sendKeys("7702315291");
		// DOB
		driver.findElement(By.id("regdob")).click();
		Thread.sleep(2000);
		// Selct Month
		new Select(driver.findElement(By.xpath("//*[@title='Change the month']"))).selectByVisibleText("May");
		// select Year
		new Select(driver.findElement(By.xpath("//*[@title='Change the year']"))).selectByVisibleText("2012");
		// click on Date
		driver.findElement(By.xpath("//*[contains(@title,'May 18')]")).click();

		driver.findElement(By.xpath("(//*[@name='gender'])[2]")).click();
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("310 ridgewood dr");
		driver.findElement(By.xpath("//*[@name='cityS']")).sendKeys("Lewisville");
		new Select(driver.findElement(By.xpath("//*[@name='countryS']"))).selectByVisibleText("India");
		new Select(driver.findElement(By.xpath("//*[@name='stateS']"))).selectByVisibleText("Andhra Pradesh");
		driver.findElement(By.xpath("(//*[@type='text'])[7]")).sendKeys("50035");
		new Select(driver.findElement(By.xpath("//*[@name='proofS']"))).selectByVisibleText("PAN Card");
		driver.findElement(By.xpath("(//*[@type='text'])[8]")).sendKeys("AAAPL1234C");
		driver.findElement(By.xpath("//*[@name='emailId']")).sendKeys("Nalinichalla@gmail.com");
		driver.findElement(By.xpath("(//*[@type='password'])[1]")).sendKeys("May@2019");
		driver.findElement(By.xpath("//*[@name='repassword']")).sendKeys("May@2019");
		driver.findElement(By.xpath("(//*[@class='btn btn-act ng-binding'])[5]")).click();

	}

	@BeforeClass // Pre-condition
	public void beforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ttdsevaonline.com/#/registration");
		Thread.sleep(3000);
	}

	@AfterClass // Post condition
	public void afterClass() {
		driver.quit();
	}
	
	@AfterMethod
	public void screenshot() throws Exception
	{
		Date d = new Date();
		System.out.println(d);//Mon Apr 08 21:39:40 CDT 2019
		
		//create our own format dd_MM_yyyy_HH_mm_ss
		DateFormat df = new  SimpleDateFormat("yyyy_MMM_dd_HH_mm_ss");//08_Apr_2019_21_44_19
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
		// take screenshot
		String screenshotPath = ".\\Screenshots\\";
		// take screenshot using below code and store it to RAM location
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File(screenshotPath + "TTD" +timeStamp+".png"));
	}

}
