package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/test/newtours/register.php";
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement country = driver.findElement(By.name("country"));
		
		// 1. Index
		// 2. Value
		// 3. VisibleText
		Select select = new Select(country);
//		select.selectByIndex(45);
//		select.selectByValue("INDIA");
		select.selectByVisibleText("KENYA");
		
	}

}
