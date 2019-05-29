package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://retail.onlinesbi.com/");

		driver.findElement(By.className("login-new")).click();

		driver.findElement(By.className("login_button")).click();

		driver.findElement(By.linkText("New User ? Register here/Activate")).click();

		Thread.sleep(5000);
		// to click on cancel button and confirmation alert we will use dismisses
		// function
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		
		//system will display new window
		//Two windows are avalable (Cursor will be on first iwndow,...)
//		driver.close();//where ever cursor is avalable that only will close
		
		driver.quit(); // system will close allthe related windows

	}

}
