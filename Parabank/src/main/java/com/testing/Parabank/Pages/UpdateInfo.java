package com.testing.Parabank.Pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.Parabank.ExtensionMethods.ScreenShot;
import com.testing.Parabank.TestBase.DriverSetup;
import com.testing.Parabank.Utils.ReadingExcel;

public class UpdateInfo {
	
	@FindBy(how=How.ID,using="customer.firstName")
	static WebElement firstname;
	@FindBy(how=How.ID,using="customer.lastName")
	static WebElement lastname;
	@FindBy(how=How.ID,using="customer.address.street")
	static WebElement address;
	@FindBy(how=How.ID,using="customer.address.city")
	static WebElement city;
	@FindBy(how=How.ID,using="customer.address.state")
	static WebElement state;
	@FindBy(how=How.ID,using="customer.address.zipCode")
	static WebElement zipcode;
	@FindBy(how=How.ID,using="customer.phoneNumber")
	static WebElement phonenumber;
	@FindBy(xpath="//input[@value='Update Profile']")
	static WebElement button;
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Your updated address and phone number have been ad')]")
	static WebElement success;
	
	static WebDriver driver=DriverSetup.invokeDriver("ChromeDriver_WindowsOS");
	static XSSFSheet sheet=ReadingExcel.getDataFromExcel();
    static WebDriverWait Wait = new WebDriverWait(driver, 50);
   
    
    
    public UpdateInfo() {
    	PageFactory.initElements(driver, this);
    }
    
    	
    	
    
    public static void click(WebElement element) {
    	Wait.until(ExpectedConditions.visibilityOf(element));
    	element.click();
    }
    
    public static void sendText(WebElement element,String text) {
    	element.clear();
    	element.sendKeys(text);
    	
    }
    
    public static void clear(WebElement element) {
    	element.clear();
    }
    
    public static void fillUpdateInfoform() {
    	driver.findElement(By.linkText("Update Contact Info")).click();
    	Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));
    	
    	clear(firstname);
    	clear(lastname);
    	clear(address);
    	clear(city);
    	clear(state);
    	clear(zipcode);
    	clear(phonenumber);
    	
    	sendText(firstname,"Ajinkya");
		sendText(lastname,"Rahane");
		sendText(address,"Charming Avenue");
		sendText(city,"Chennai");
		sendText(state,"Tamil Nadu");
		sendText(zipcode,"603203");
		sendText(phonenumber,"932756465");
    	
    }
    
    
    public static void screenshot(String name) {
    	ScreenShot.takeScreenshot(driver, name);
    }
    
    public static String update() {
    	fillUpdateInfoform();
    	click(button);
    	Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your updated address and phone number have been ad')]")));
		String result0 = success.getText();
		return result0;
    	
    	
    }
    
    public static String UpdatefnameErr() {

		fillUpdateInfoform();
		clear(firstname);
		click(button);
		String result1 = driver.findElement(By.xpath("//span[contains(text(),'First name is required.')]")).getText();
		screenshot("UpdateInfo_fnameErr");
		return result1;

	}

	
	public static String UpdatelnameErr() {

		fillUpdateInfoform();
		clear(lastname);
		click(button);
		String result2 = driver.findElement(By.xpath("//span[contains(text(),'Last name is required.')]")).getText();
		screenshot("UpdateInfo_lnameErr");
		return result2;

	}
	
	public static String UpdateaddressErr() {

		fillUpdateInfoform();
		clear(address);
		click(button);
		String result3 = driver.findElement(By.xpath("//span[contains(text(),'Address is required.')]")).getText();
		screenshot("UpdateInfo_addressErr");
		return result3;

	}
	
	public static String UpdatecityErr() {

		fillUpdateInfoform();
		clear(city);
		click(button);
		String result4 = driver.findElement(By.xpath("//span[contains(text(),'City is required.')]")).getText();
		screenshot("UpdateInfo_cityErr");
		return result4;

	}
	
	public static String UpdatestateErr() {

		fillUpdateInfoform();
		clear(state);
		click(button);
		String result5 = driver.findElement(By.xpath("//span[contains(text(),'State is required.')]")).getText();
		screenshot("UpdateInfo_stateErr");
		return result5;

	}
	
	public static String UpdateZipCodeErr() {

		fillUpdateInfoform();
		clear(zipcode);
		click(button);
		String result6 = driver.findElement(By.xpath("//span[contains(text(),'Zip Code is required.')]")).getText();
		screenshot("UpdateInfo_zipcodeErr");
		return result6;

	}
	public static String UpdatePhnumber() {
		
		fillUpdateInfoform();
		clear(phonenumber);
		click(button);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your updated address and phone number have been ad')]")));
		String result7 = success.getText();
		return result7;
		
		
	}
    public static String InvalidPhnumber() {
    	fillUpdateInfoform();
    	clear(phonenumber);
    	sendText(phonenumber,"abcdef1234");
    	click(button);
    	Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your updated address and phone number have been ad')]")));
		String result8 = success.getText();
		screenshot("Updateinfo_PhnumberErr");
		return result8;
    	
    }
    public static String InvalidfnameErr() {
    	fillUpdateInfoform();
		clear(firstname);
		sendText(firstname,"abcd123");
		click(button);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your updated address and phone number have been ad')]")));
		String result9 = success.getText();
		screenshot("Invalidfname_Err");
		return result9;
    	
    }
    public static String InvalidlnameErr() {
    	fillUpdateInfoform();
		clear(lastname);
		sendText(lastname,"abcd@123");
		click(button);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your updated address and phone number have been ad')]")));
		String result10 = success.getText();
		screenshot("Invalidlname_Err");
		return result10;
		
    }
    
    public static String InvalidaddErr() {
    	fillUpdateInfoform();
		clear(address);
		sendText(address,"12345687");
		click(button);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your updated address and phone number have been ad')]")));
		String result11 = success.getText();
		screenshot("Invalidadd_Err");
		return result11;
    	
    }
    
    public static String InvalidcityErr() {
    	fillUpdateInfoform();
		clear(city);
		sendText(city,"@adasf112");
		click(button);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your updated address and phone number have been ad')]")));
		String result12 = success.getText();
		screenshot("Invalidcity_Err");
		return result12;
    	
    }
    
    public static String InvalidstateErr() {
    	fillUpdateInfoform();
		clear(state);
		sendText(state,"#Gujarat123");
		click(button);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your updated address and phone number have been ad')]")));
		String result13 = success.getText();
		screenshot("Invalidstate_Err");
		return result13;
    }
    public static String InvalidzipcodeErr() {
    	fillUpdateInfoform();
		clear(zipcode);
		sendText(zipcode,"adc@123");
		click(button);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your updated address and phone number have been ad')]")));
		String result14 = success.getText();
		screenshot("Invalidzip_Err");
		return result14;
    }
    
    	
    	
    	
    		
    	


}
