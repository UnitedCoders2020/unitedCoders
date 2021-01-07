package com.testing.Parabank.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	//Declaring the static variable
	public static WebDriver driver;
	
	
	//Crating invokeDriver method which will take browserName as a parameter
	public static WebDriver invokeDriver(String browserName) {
		
		//Invoking Chrome Driver in WindowsOS
		if (browserName.equalsIgnoreCase("ChromeDriver_WindowsOS")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();	
			
		}
		//Invoking Firefox Driver in WindowsOS
		else if (browserName.equalsIgnoreCase("FirefoxDriver_WindowsOS")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
		}
		// Invoking IE driver in WindowOS
		else if (browserName.equalsIgnoreCase("IEDriver_WindowsOS")) {

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		//Invoking Opera Driver in WindowsOS
		else if(browserName.equalsIgnoreCase("OperaDriver_WindowsOS")) {
			WebDriverManager.operadriver().setup();
			driver= new OperaDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		//Returning the Driver
		return driver;
	}
	
	
}
