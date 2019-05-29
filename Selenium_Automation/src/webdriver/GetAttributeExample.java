package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAttributeExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ncalculators.com/interest/monthly-interest-calculator.htm");
		// to maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// get the defalut value from amount field
		String amount = driver.findElement(By.id("amount")).getText();
		System.out.println("Beofre text:" + amount);

		// to get the attribute from devewloprer window
		String attamount = driver.findElement(By.id("amount")).getAttribute("value");
		System.out.println("attribute  text:" + attamount);

		// defalut text/data should be clear before sendkeys
		driver.findElement(By.id("amount")).clear();
		driver.findElement(By.id("amount")).sendKeys("500000");

		String amount1 = driver.findElement(By.id("amount")).getText();
		System.out.println("After manulaentry amount : " + amount1);

		// to get the attribute from devewloprer window
		String attamount1 = driver.findElement(By.id("amount")).getAttribute("value");
		System.out.println("attribute  text:" + attamount1);

	}
}
