package com.testing.Parabank.Pages;

import java.util.ArrayList;
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
import com.testing.Parabank.Utils.DateUtils;
import com.testing.Parabank.Utils.ReadingExcel;

public class Registration {

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
	@FindBy(how=How.ID,using="customer.ssn")
	static WebElement ssn;
	@FindBy(how=How.ID,using="customer.username")
	static WebElement username;
	@FindBy(how=How.ID,using="customer.password")
	static WebElement password;
	@FindBy(how=How.ID,using="repeatedPassword")
	static WebElement confirmpassword;
	@FindBy(how=How.LINK_TEXT,using="Register")
	static WebElement register;
	@FindBy(how=How.LINK_TEXT,using="Log Out")
	static WebElement logout;
	@FindBy(how=How.XPATH,using="//div[@id='rightPanel']/p")
	static WebElement success;
	@FindBy(xpath="//input[@value='Register']")
	static WebElement button;
	
	
	static WebDriver driver=DriverSetup.invokeDriver("ChromeDriver_WindowsOS");
	static XSSFSheet sheet=ReadingExcel.getDataFromExcel();
    static WebDriverWait Wait = new WebDriverWait(driver, 50);
    static ArrayList<String> list;
    static String user=DateUtils.username();
    
    public Registration() {
    	
    	PageFactory.initElements(driver, this);
    }
   
    public static void getData() {
    	
    	list=new ArrayList<String>();
    	for(int j=2;j<26;j++) {
    		list.add(sheet.getRow(j).getCell(1).getStringCellValue());
    	}

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
    
    public static void fillRegisterForm() {
    	driver.findElement(By.linkText("Register")).click();
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.firstName")));
		
		sendText(firstname,list.get(0));
		sendText(lastname,list.get(1));
		sendText(address,list.get(2));
		sendText(city,list.get(3));
		sendText(state,list.get(4));
		sendText(zipcode,list.get(5));
		sendText(phonenumber,list.get(6));
		sendText(ssn,list.get(7));
		sendText(username,user);
		sendText(password,list.get(9));
		sendText(confirmpassword,list.get(10));
    }
    
    public static void screenshot(String name) {
    	ScreenShot.takeScreenshot(driver, name);
    }
    
	public static String register() {
		
		fillRegisterForm();		
		click(button);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rightPanel']/p")));
		String actualResult = success.getText();
		click(logout);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register")));
		return actualResult;

	}

	
	public static String firstnameError() {

		fillRegisterForm();
		clear(firstname);
		click(button);
		String actualResult = driver.findElement(By.id("customer.firstName.errors")).getText();
		screenshot("Registration_firstnameError");
		return actualResult;

	}

	
	public static String lastnameError() {

		fillRegisterForm();
		clear(lastname);
		click(button);
		String actualResult = driver.findElement(By.id("customer.lastName.errors")).getText();
		screenshot("Registration_lastnameError");
		return actualResult;

	}
	
	public static String addressError() {

		fillRegisterForm();
		clear(address);
		click(button);
		String errMessage = driver.findElement(By.id("customer.address.street.errors")).getText();
		screenshot("Registration_addressError");
		return errMessage;

	}
	
	public static String cityError() {

		fillRegisterForm();
		clear(city);
		click(button);
		String actualResult = driver.findElement(By.id("customer.address.city.errors")).getText();
		screenshot("Registration_cityError");
		return actualResult;

	}
	
	public static String stateError() {

		fillRegisterForm();
		clear(state);
		click(button);
		String actualResult = driver.findElement(By.id("customer.address.state.errors")).getText();
		screenshot("Registration_stateError");
		return actualResult;

	}
	
	public static String zipcodeError() {

		fillRegisterForm();
		clear(zipcode);
		click(button);
		String actualResult = driver.findElement(By.id("customer.address.zipCode.errors")).getText();
		screenshot("Registration_zipcodeError");
		return actualResult;

	}
	
	public static String withoutPhonenumberRegister() {

		fillRegisterForm();
		clear(phonenumber);
		sendText(username,user+"a");
		click(button);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rightPanel']/p")));

		String actualResult = driver.findElement(By.xpath("//div[@id='rightPanel']/p")).getText();
		driver.findElement(By.xpath("//a[contains(text(),\"Log Out\")]")).click();
		return actualResult;

	}
	
	public static String ssnError() {

		fillRegisterForm();
		clear(ssn);
		click(button);
		String actualResult = driver.findElement(By.id("customer.ssn.errors")).getText();
		screenshot("Registration_ssnError");
		return actualResult;

	}
	
	public static String usernameError() {

		fillRegisterForm();
		clear(username);
		click(button);
		String actualResult = driver.findElement(By.id("customer.username.errors")).getText();
		screenshot("Registration_usernameError");
		return actualResult;

	}
	
	public static String passwordError() {

		fillRegisterForm();
		clear(password);
		click(button);
		String actualResult = driver.findElement(By.id("customer.password.errors")).getText();
		screenshot("Registration_passwordError");
		return actualResult;

	}
	
	public static String confirmPasswordError() {

		fillRegisterForm();
		clear(confirmpassword);
		click(button);
		String actualResult = driver.findElement(By.id("repeatedPassword.errors")).getText();
		screenshot("Registration_confirmPasswordError");
		return actualResult;

	}
	
	public static String passwordMismatchError() {
		
		fillRegisterForm();
		clear(confirmpassword);
		sendText(confirmpassword,list.get(11));
		click(button);
		String actualResult = driver.findElement(By.id("repeatedPassword.errors")).getText();
		screenshot("Registration_passwordMismatchError");
		
		return actualResult;
	}

}

