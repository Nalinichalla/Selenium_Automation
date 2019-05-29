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

public class JustrechargeIT_signon {

	public static void main(String[] args) throws JXLException, IOException {

		String pathoftheExcelsheet = ".\\Testdata\\TD.xls";
		// Read the path of excel sheet
		FileInputStream f = new FileInputStream(pathoftheExcelsheet);
		// read the workbook form your local system
		Workbook w = Workbook.getWorkbook(f);
		// get the sheet from above workbook
		Sheet s = w.getSheet("Sheet2");

		// Create Webdriver object
		WebDriver driver;
		// string path= "F:\\Selenium\Workspace\\Selenium_Nalini\\Browser
		// drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		// to launch the chrome browser
		driver = new ChromeDriver();
		// Type URL
		driver.get("https://www.justrechargeit.com/SignIn.aspx");

		driver.findElement(By.name(s.getCell(1, 0).getContents())).sendKeys(s.getCell(2, 0).getContents());
		driver.findElement(By.name(s.getCell(1, 1).getContents())).sendKeys(s.getCell(2, 1).getContents());
		driver.findElement(By.id(s.getCell(1, 2).getContents())).click();

	}

}
