package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://retail.onlinesbi.com/");

		driver.findElement(By.className("login-new")).click();

		driver.findElement(By.className("login_button")).click();

		// click on Login button without enter UserName and Passwrd
		driver.findElement(By.id("Button2")).click();

		// to move cursor point to Alert and do clcikc action on Alert (Ok button Click
		// )
		// Get the text from Alert and print in console
		String alertText = driver.switchTo().alert().getText();
		System.out.println("alertText*************" + alertText);
		// To click on ok Button on alert
		driver.switchTo().alert().accept();

		// confirmation Alert
		// OK CANCEL / YES NO
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();

		Thread.sleep(5000);
		// to click on cancel button and confirmation alert we will use dismisses
		// function
		driver.switchTo().alert().dismiss();

	}

}
