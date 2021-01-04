package com.testing.Parabank.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.Parabank.ExtensionMethods.ScreenShot;
import com.testing.Parabank.TestBase.DriverSetup;


public class PayBills {
	static WebDriver driver;
	
	 public static void screenshot(String name) {
		    
	    	ScreenShot.takeScreenshot(driver, name);
	    }

	public static String paybill() {

		driver = DriverSetup.driver;
		driver.findElement(By.linkText("Bill Pay")).click();
		WebDriverWait Wait = new WebDriverWait(driver, 30);
		
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@ng-show=\"showResult\"]")));

		String actualResult = driver.getTitle();
		return actualResult;

	}
	
	public static String payeenameError() {

		
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));


		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.name\"]")).getText();
		screenshot("BillPayment_nameError");
		return actualResult;

	}

	
	public static String addressError() {

		
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.address\"]")).getText();
		screenshot("BillPayment_addressError");
		return actualResult;

	}
	
	public static String cityError() {

		
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String errMessage = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.city\"]")).getText();
		screenshot("BillPayment_cityError");
		return errMessage;

	}
	
	public static String stateError() {

		
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.state\"]")).getText();
		screenshot("BillPayment_stateError");
		return actualResult;

	}
	
	public static String zipCodeError() {

		
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.zipCode\"]")).getText();
		screenshot("BillPayment_zipcodeError");
		return actualResult;

	}
	
	public static String withoutphoneNumberRegister() {

		
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@ng-show=\"!validationModel.phoneNumber\"]")));
		
		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.phoneNumber\"]")).getText();
		screenshot("BillPayment_phonenumberError");
		return actualResult;

	}
	
	public static String accountNumberError() {

		
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();


		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.account == 'empty'\"]")).getText();
		screenshot("BillPayment_accountNumberError");
		return actualResult;

	}
	
     public static String accountNumberMismatchError() {

		
		
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();
		

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.verifyAccount == 'mismatch'\"]")).getText();
		screenshot("BillPayment_accountMismatchError");
		return actualResult;
	}
	
	public static String verifyAccountError() {

		
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.verifyAccount == 'empty'\"]")).getText();
		screenshot("BillPayment_verifyAccountError");
		return actualResult;

	}
	
	public static String amountError() {

		
		driver.findElement(By.linkText("Bill Pay")).click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));

		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
		
		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();

		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.amount == 'empty'\"]")).getText();
		screenshot("BillPayment_amountError");
		return actualResult;

	}
	
	
	



}
