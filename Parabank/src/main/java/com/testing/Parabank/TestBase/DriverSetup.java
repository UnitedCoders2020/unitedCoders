package com.testing.Parabank.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
			driver.get("https://parabank.parasoft.com/parabank/index.htm");
		}
		//Invoking Firefox Driver in WindowsOS
		else if (browserName.equalsIgnoreCase("FirefoxDriver_WindowsOS")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.get("https://parabank.parasoft.com/parabank/index.htm");
		}
		//Invoking Opera Driver in WindowsOS
		else if(browserName.equalsIgnoreCase("OperaDriver_WindowsOS")) {
			WebDriverManager.operadriver().setup();
			driver= new OperaDriver();
			driver.get("https://parabank.parasoft.com/parabank/index.htm");
		}
		
		//Returning the Driver
		return driver;
	}
	
	
}
