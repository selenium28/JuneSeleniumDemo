package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopHandling {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demo.guru99.com/test/delete_customer.php";
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement cusID = driver.findElement(By.xpath("//input[@type='text']"));
		cusID.sendKeys("56754");
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(3000);
		Alert popup = driver.switchTo().alert();
//		popup.accept();
		
		String popupmesg = popup.getText();
		System.out.println("Alert Message " +popupmesg);
		popup.dismiss();
		System.out.println("Cus ID has been deleted ");
		
		driver.quit();
		
	}

}
