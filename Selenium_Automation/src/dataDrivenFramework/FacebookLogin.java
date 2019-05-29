package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException, JXLException, IOException {
		
		//dattype  varaible = "path";
		String pathoftheExcelsheet = ".\\Testdata\\TD.xls";
		//Read the path of excel sheet
		FileInputStream f = new FileInputStream(pathoftheExcelsheet);
		//read the workbook form your local system
		Workbook w = Workbook.getWorkbook(f);
		//get the sheet from above workbook
		Sheet s = w.getSheet("Sheet1");		
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		// EditBox Script
		// driver.findElement(By.Locatername("LocaterValue")).sendKeys("inputData");
		driver.findElement(By.name(s.getCell(3, 2).getContents())).sendKeys(s.getCell(4,2).getContents());// nalini@gmail.com
		driver.findElement(By.name(s.getCell(3, 3).getContents())).sendKeys(s.getCell(4,3).getContents());
		// Click()
		// driver.findElement(By.Locatername("LocaterValue")).click();
		driver.findElement(By.id(s.getCell(3,4).getContents())).click();
		Thread.sleep(5000);
		// validate whether giver username and password is valid or not?
		// Signup element has present or not?
		// if any element has present on page that element size would be 1 else 0
		if (driver.findElements(By.xpath("//*[@id='blueBarDOMInspector']/div/div[2]/div/div/span/a")).size() > 0) {
			System.out.println("Given credentials are invalid");
		} else {
			System.out.println("Given credentials are valid");
		}

		driver.close();

	}

}
