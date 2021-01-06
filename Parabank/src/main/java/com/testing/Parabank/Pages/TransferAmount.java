package com.testing.Parabank.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

import com.testing.Parabank.ExtensionMethods.ScreenShot;
import com.testing.Parabank.TestBase.DriverSetup;

public class TransferAmount {
	
	 public static void screenshot(String name) {
		   WebDriver driver = DriverSetup.driver;
	    	ScreenShot.takeScreenshot(driver, name);
	    }
	
	public static String transferringFunds(WebDriver driver) throws Exception { //Positive Test
		
		driver.findElement(By.linkText("Transfer Funds")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("20000");
		
		Select account1 = new Select(driver.findElement(By.id("fromAccountId")));
		account1.selectByIndex(0);
		Select account2 = new Select(driver.findElement(By.id("toAccountId")));
		account2.selectByIndex(1);
		
		
		driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
		
		Thread.sleep(5000);
		String ssString = driver.findElement(By.xpath("//div[@class=\"ng-scope\"]/p[1]")).getText();
		return ssString;
		
	}
	public static String checkingAmount(WebDriver driver) throws InterruptedException { // Giving Negative Amount
		driver.findElement(By.linkText("Transfer Funds")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("-10000");
		
		Select account1 = new Select(driver.findElement(By.id("fromAccountId")));
		account1.selectByIndex(0);
		Select account2 = new Select(driver.findElement(By.id("toAccountId")));
		account2.selectByIndex(1);
		
		
		driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
		
		Thread.sleep(5000);
		String ssString = driver.findElement(By.xpath("//div[@class=\"ng-scope\"]/p[1]")).getText();
		return ssString;
	}
	
	public static String checkingAmountType(WebDriver driver) throws InterruptedException { //Giving invalid Amount
		driver.findElement(By.linkText("Transfer Funds")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("aaaaa");
		
		Select account1 = new Select(driver.findElement(By.id("fromAccountId")));
		account1.selectByIndex(0);
		Select account2 = new Select(driver.findElement(By.id("toAccountId")));
		account2.selectByIndex(1);
		
		
		driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
		
		Thread.sleep(5000);
		String ssString = driver.findElement(By.xpath("//p[@id='amount.errors']")).getText();
		screenshot("Transferamount_invalidamoutnError");
		return ssString;
		
	}
	
	public static String checkingAmountRange(WebDriver driver) throws InterruptedException { //Going above [1-9] * 10^14
		driver.findElement(By.linkText("Transfer Funds")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("999999999999");
		
		Select account1 = new Select(driver.findElement(By.id("fromAccountId")));
		account1.selectByIndex(0);
		Select account2 = new Select(driver.findElement(By.id("toAccountId")));
		account2.selectByIndex(1);
		
		
		driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
		
		Thread.sleep(5000);
		String ssString = driver.findElement(By.xpath("//div[@class='ng-scope']/p")).getText();
		
		return ssString;
		
		
	}
	public static String noAmountGiven(WebDriver driver) throws InterruptedException{
		driver.findElement(By.linkText("Transfer Funds")).click();
		Thread.sleep(3000);
		Select account1 = new Select(driver.findElement(By.id("fromAccountId")));
		account1.selectByIndex(0);
		Select account2 = new Select(driver.findElement(By.id("toAccountId")));
		account2.selectByIndex(1);
		driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
		
		Thread.sleep(5000);
		String ssString = driver.findElement(By.xpath("//p[@id='amount.errors']")).getText();
		return ssString;
		
	}
}