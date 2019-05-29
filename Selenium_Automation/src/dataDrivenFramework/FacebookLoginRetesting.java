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

public class FacebookLoginRetesting {

	public static void main(String[] args) throws InterruptedException, JXLException, IOException {

		// dattype varaible = "path";
		String pathoftheExcelsheet = ".\\Testdata\\TD.xls";
		// Read the path of excel sheet
		FileInputStream f = new FileInputStream(pathoftheExcelsheet);
		// read the workbook form your local system
		Workbook w = Workbook.getWorkbook(f);
		// get the sheet from above workbook
		Sheet s = w.getSheet("Sheet1");
		Sheet rs = w.getSheet("Retesting");

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		System.out.println("Row count in retesting sheet***********" + rs.getRows());
		System.out.println("column count in retesting sheet#############" + rs.getColumns());

		driver.get("https://www.facebook.com/");
		for (int i = 2; i < rs.getRows(); i++) {// j =column, i=row 2<8 2>8
			// EditBox Script
			// driver.findElement(By.Locatername("LocaterValue")).sendKeys("inputData");
			driver.findElement(By.name(s.getCell(3, 2).getContents())).clear();
			driver.findElement(By.name(s.getCell(3, 2).getContents())).sendKeys(rs.getCell(1, i).getContents());
			driver.findElement(By.name(s.getCell(3, 3).getContents())).clear();
			driver.findElement(By.name(s.getCell(3, 3).getContents())).sendKeys(rs.getCell(2, i).getContents());
			// Click()
			// driver.findElement(By.Locatername("LocaterValue")).click();
			driver.findElement(By.id(s.getCell(3, 4).getContents())).click();
			Thread.sleep(5000);

			// validate whether giver username and password is valid or not?
			// Signup element has present or not?
			// if any element has present on page that element size would be 1 else 0
			if (driver.findElements(By.xpath("//*[@id='blueBarDOMInspector']/div/div[2]/div/div/span/a")).size() > 0) {
				System.out.println("Given credentials are invalid");
				System.out.println("Fail");

				driver.get("https://www.facebook.com/");
			} else {
				System.out.println("Given credentials are valid");
				System.out.println("Pass");
			}
		} // for loop end

		driver.close();

	}

}
