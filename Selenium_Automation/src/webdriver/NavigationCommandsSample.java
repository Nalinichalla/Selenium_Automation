package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandsSample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.justrechargeit.com/index_justrecharge.aspx");
		driver.navigate().to("https://www.justrechargeit.com/index_justrecharge.aspx");
		//Maximize thw window
		driver.manage().window().maximize();
		
		
		//get the current window title
		String currentURL = driver.getCurrentUrl();
		System.out.println("currentURL******:"+ currentURL);
		String curreentTitle = driver.getTitle();
		System.out.println("curreentTitle******:"+ curreentTitle);
		
		
		// click on Create New Account link
		driver.findElement(By.linkText("Create New Account")).click();
		String createAccountURL = driver.getCurrentUrl();
		System.out.println("createAccountURL******:"+ createAccountURL);
		
		String createpageTitle = driver.getTitle();
		System.out.println("createpageTitle******:"+ createpageTitle);
		
		// Enter UserName data and click on refresh icon on left top of the page
		driver.findElement(By.id("signup_name")).sendKeys("afgdsgsdgsdgs");

		// use navigation command
		driver.navigate().refresh();
		Thread.sleep(3000);
		
//		backward icon
		driver.navigate().back();
		Thread.sleep(3000);
		
		String backURL = driver.getCurrentUrl();
		System.out.println("backURL******:"+ backURL);
		
//		forward icon
		driver.navigate().forward();
		Thread.sleep(3000);
		
		String frwdURL = driver.getCurrentUrl();
		System.out.println("frwdURL******:"+ frwdURL);
		
	}

}
