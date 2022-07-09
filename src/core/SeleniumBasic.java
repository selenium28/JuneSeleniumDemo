package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println("Browser Launched");
		driver.manage().window().maximize();
		System.out.println("My browser is maximized");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("My login has been successful");
		
		

	}

}

//http://demo.guru99.com/test/newtours/register.php -- DropDown
//http://demo.guru99.com/test/delete_customer.php  --- AlertPopup
//https://www.travolook.in/?gclid=Cj0KCQjw4cOEBhDMARIsAA3XDRjGAeFHS8cqdKjY45Sc7ZEf98H63uG7bP6HsxGr9ugbNNNMU0GJZdYaAoH4EALw_wcB   --- ActionClass
//http://automationpractice.com/index.php 
//
