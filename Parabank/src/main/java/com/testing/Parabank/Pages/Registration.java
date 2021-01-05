package com.testing.Parabank.Pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.Parabank.ExtensionMethods.ScreenShot;
import com.testing.Parabank.TestBase.DriverSetup;
import com.testing.Parabank.Utils.ReadingExcel;

public class Registration {

	static WebDriver driver=DriverSetup.invokeDriver("FirefoxDriver_WindowsOS");
	static XSSFSheet sheet=ReadingExcel.getDataFromExcel();
    static WebDriverWait Wait = new WebDriverWait(driver, 50);
    
   
    public static void openRegisterForm() {
    	driver.findElement(By.linkText("Register")).click();
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));
    }
    
    public static void screenshot(String name) {
    	ScreenShot.takeScreenshot(driver, name);
    }
    
    public static void click(By by) {
    	Wait.until(ExpectedConditions.elementToBeClickable(by));
    	driver.findElement(by).click();
    }
    
    public static void sendText(By by,String text) {
    	Wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    	driver.findElement(by).sendKeys(text);
    }
    
	public static String register() {
		
		openRegisterForm();
		sendText(By.id("customer.firstName"),sheet.getRow(2).getCell(1).getStringCellValue());
		sendText(By.id("customer.lastName"),sheet.getRow(3).getCell(1).getStringCellValue());
		sendText(By.id("customer.address.street"),sheet.getRow(4).getCell(1).getStringCellValue());
		sendText(By.id("customer.address.city"),sheet.getRow(5).getCell(1).getStringCellValue());
		sendText(By.id("customer.address.state"),sheet.getRow(6).getCell(1).getStringCellValue());
		sendText(By.id("customer.address.zipCode"),sheet.getRow(7).getCell(1).getStringCellValue());
		sendText(By.id("customer.phoneNumber"),sheet.getRow(8).getCell(1).getStringCellValue());
		sendText(By.id("customer.ssn"),sheet.getRow(9).getCell(1).getStringCellValue());
		sendText(By.id("customer.username"),sheet.getRow(10).getCell(1).getStringCellValue());
		sendText(By.id("customer.password"),sheet.getRow(11).getCell(1).getStringCellValue());
		sendText(By.id("repeatedPassword"),sheet.getRow(12).getCell(1).getStringCellValue());
		click(By.xpath("//input[@value='Register']"));

		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rightPanel']/p")));

		String actualResult = driver.findElement(By.xpath("//div[@id='rightPanel']/p")).getText();
		click(By.linkText("Log Out"));
		
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register")));
		return actualResult;

	}

	
	public static String firstnameError() {

		openRegisterForm();
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		click(By.xpath("//input[@value='Register']"));
		String actualResult = driver.findElement(By.id("customer.firstName.errors")).getText();
		screenshot("Registration_firstnameError");
		return actualResult;

	}

	
	public static String lastnameError() {

		openRegisterForm();
		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		click(By.xpath("//input[@value='Register']"));
		String actualResult = driver.findElement(By.id("customer.lastName.errors")).getText();
		screenshot("Registration_lastnameError");
		return actualResult;

	}
	
	public static String addressError() {

		openRegisterForm();
		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		click( By.xpath("//input[@value='Register']"));
		String errMessage = driver.findElement(By.id("customer.address.street.errors")).getText();
		screenshot("Registration_addressError");
		return errMessage;

	}
	
	public static String cityError() {

		openRegisterForm();
		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		click(By.xpath("//input[@value='Register']"));
		String actualResult = driver.findElement(By.id("customer.address.city.errors")).getText();
		screenshot("Registration_cityError");
		return actualResult;

	}
	
	public static String stateError() {

		openRegisterForm();
		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		click( By.xpath("//input[@value='Register']"));
		String actualResult = driver.findElement(By.id("customer.address.state.errors")).getText();
		screenshot("Registration_stateError");
		return actualResult;

	}
	
	public static String zipcodeError() {

		openRegisterForm();
		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		click(By.xpath("//input[@value='Register']"));
		String actualResult = driver.findElement(By.id("customer.address.zipCode.errors")).getText();
		screenshot("Registration_zipcodeError");
		return actualResult;

	}
	
	public static String withoutPhonenumberRegister() {

		openRegisterForm();
		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue()+"aa");
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		click(By.xpath("//input[@value='Register']"));
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rightPanel']/p")));

		String actualResult = driver.findElement(By.xpath("//div[@id='rightPanel']/p")).getText();
		driver.findElement(By.xpath("//a[contains(text(),\"Log Out\")]")).click();
		return actualResult;

	}
	
	public static String ssnError() {

		openRegisterForm();
		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		click(By.xpath("//input[@value='Register']"));
		String actualResult = driver.findElement(By.id("customer.ssn.errors")).getText();
		screenshot("Registration_ssnError");
		return actualResult;

	}
	
	public static String usernameError() {

		openRegisterForm();
		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		click(By.xpath("//input[@value='Register']"));
		String actualResult = driver.findElement(By.id("customer.username.errors")).getText();
		screenshot("Registration_usernameError");
		return actualResult;

	}
	
	public static String passwordError() {

		openRegisterForm();
		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		click(By.xpath("//input[@value='Register']"));
		String actualResult = driver.findElement(By.id("customer.password.errors")).getText();
		screenshot("Registration_passwordError");
		return actualResult;

	}
	
	public static String confirmPasswordError() {

		openRegisterForm();
		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		click( By.xpath("//input[@value='Register']"));
		String actualResult = driver.findElement(By.id("repeatedPassword.errors")).getText();
		screenshot("Registration_confirmPasswordError");
		return actualResult;

	}
	
	public static String passwordMismatchError() {
		
		openRegisterForm();
		driver.findElement(By.id("customer.firstName")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.lastName")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.street")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.city")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.state")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.ssn")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		driver.findElement(By.id("customer.password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.id("repeatedPassword")).sendKeys(sheet.getRow(13).getCell(1).getStringCellValue());
		click(By.xpath("//input[@value='Register']"));
		String actualResult = driver.findElement(By.id("repeatedPassword.errors")).getText();
		screenshot("Registration_passwordMismatchError");
		return actualResult;
	}

}
