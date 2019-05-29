package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Validation_sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
//		whether the checkbox is selected or not
		
		boolean abc = driver.findElement(By.id("checkbox1")).isSelected();
		if (abc) {
			System.out.println("element by default isselected");
			
		} else {
			System.out.println("element by default notselected");

		}
		// click on terms and conditions check box
		driver.findElement(By.id("checkbox")).click();
//		whether the checkbox is selected or not
		boolean xyz = driver.findElement(By.id("checkbox")).isSelected();
		if (xyz) {
			System.out.println("element by default isselected*****");
			
		} else {
			System.out.println("element by default notselected****");

		}
//		whether the the textbox has displayed or not
		boolean name = driver.findElement(By.id("signup_name")).isDisplayed();
		if (name) {
			System.out.println("name edit box has present on page");
		} else {
			
			System.out.println("name edit box has not present on page");
			

		}
//		save button is enabled or disabled 
		driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
		boolean wxyz = driver.findElement(By.id("demo")).isEnabled();
		if (wxyz) {
			System.out.println("save button is enabled");
		} else {
			
			System.out.println("save button is disabled");
			

		}
			
		
	}

}
