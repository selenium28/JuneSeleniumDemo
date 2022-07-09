package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConcept {

	public static void main(String[] args) {
		// We can create object of Class in java.
		// But we can't create object of Interface
		
//		WebDriver driver = new Webdriver(); // Not allowed 
		// WebDriver = Interface
		// driver = reference variable
		// new = keyword
		// ChromeDriver() = Constructor
		// new ChromeDriver(); - object of ChromeDriver class
		
		WebDriver driver = new ChromeDriver();  // allowed
		ChromeDriver driver2 = new ChromeDriver();  // allowed
		WebDriver driver3 = new FirefoxDriver();
		FirefoxDriver driver4 = new FirefoxDriver();
		
		

	}

}
