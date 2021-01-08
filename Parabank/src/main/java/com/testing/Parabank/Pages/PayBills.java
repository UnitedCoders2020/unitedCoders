//package com.testing.Parabank.Pages;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.testing.Parabank.ExtensionMethods.ScreenShot;
//import com.testing.Parabank.TestBase.DriverSetup;
//
//
//public class PayBills {
//	static WebDriver driver= DriverSetup.driver;;
//	
//	 public static void screenshot(String name) {
//		    
//	    	ScreenShot.takeScreenshot(driver, name);
//	    }
//
//	public static String paybill() {
//
//		 
//		driver.findElement(By.linkText("Bill Pay")).click();
//		WebDriverWait Wait = new WebDriverWait(driver, 30);
//		
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));
//
//		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
//		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
//		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
//		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
//		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();
//
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@ng-show=\"showResult\"]")));
//
//		String actualResult = driver.getTitle();
//		return actualResult;
//
//	}
//	
//	public static String payeenameError() {
//
//		
//		driver.findElement(By.linkText("Bill Pay")).click();
//
//		WebDriverWait Wait = new WebDriverWait(driver, 30);
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));
//
//
//		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
//		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
//		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
//		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
//		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();
//
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.name\"]")).getText();
//		screenshot("BillPayment_nameError");
//		return actualResult;
//
//	}
//
//	
//	public static String addressError() {
//
//		
//		driver.findElement(By.linkText("Bill Pay")).click();
//
//		WebDriverWait Wait = new WebDriverWait(driver, 30);
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));
//
//		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
//		
//		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
//		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
//		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
//		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
//		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();
//
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.address\"]")).getText();
//		screenshot("BillPayment_addressError");
//		return actualResult;
//
//	}
//	
//	public static String cityError() {
//
//		
//		driver.findElement(By.linkText("Bill Pay")).click();
//
//		WebDriverWait Wait = new WebDriverWait(driver, 30);
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));
//
//		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
//		
//		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
//		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
//		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
//		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
//		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();
//
//		String errMessage = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.city\"]")).getText();
//		screenshot("BillPayment_cityError");
//		return errMessage;
//
//	}
//	
//	public static String stateError() {
//
//		
//		driver.findElement(By.linkText("Bill Pay")).click();
//
//		WebDriverWait Wait = new WebDriverWait(driver, 30);
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));
//
//		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
//		
//		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
//		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
//		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
//		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
//		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();
//
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.state\"]")).getText();
//		screenshot("BillPayment_stateError");
//		return actualResult;
//
//	}
//	
//	public static String zipCodeError() {
//
//		
//		driver.findElement(By.linkText("Bill Pay")).click();
//
//		WebDriverWait Wait = new WebDriverWait(driver, 30);
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));
//
//		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
//		
//		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
//		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
//		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
//		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();
//
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.zipCode\"]")).getText();
//		screenshot("BillPayment_zipcodeError");
//		return actualResult;
//
//	}
//	
//	public static String withoutphoneNumberRegister() {
//
//		
//		driver.findElement(By.linkText("Bill Pay")).click();
//
//		WebDriverWait Wait = new WebDriverWait(driver, 30);
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));
//
//		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
//		
//		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
//		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
//		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();
//
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@ng-show=\"!validationModel.phoneNumber\"]")));
//		
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.phoneNumber\"]")).getText();
//		screenshot("BillPayment_phonenumberError");
//		return actualResult;
//
//	}
//	
//	public static String accountNumberError() {
//
//		
//		driver.findElement(By.linkText("Bill Pay")).click();
//
//		WebDriverWait Wait = new WebDriverWait(driver, 30);
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));
//
//		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
//		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
//		
//		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
//		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
//		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();
//
//
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.account == 'empty'\"]")).getText();
//		screenshot("BillPayment_accountNumberError");
//		return actualResult;
//
//	}
//	
//     public static String accountNumberMismatchError() {
//
//		
//		
//		driver.findElement(By.linkText("Bill Pay")).click();
//
//		WebDriverWait Wait = new WebDriverWait(driver, 30);
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));
//
//		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
//		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
//		
//		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
//		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
//		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();
//		
//
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.verifyAccount == 'mismatch'\"]")).getText();
//		screenshot("BillPayment_accountMismatchError");
//		return actualResult;
//	}
//	
//	public static String verifyAccountError() {
//
//		
//		driver.findElement(By.linkText("Bill Pay")).click();
//
//		WebDriverWait Wait = new WebDriverWait(driver, 30);
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));
//
//		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
//		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
//		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
//		
//		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("30");
//		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
//		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();
//
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.verifyAccount == 'empty'\"]")).getText();
//		screenshot("BillPayment_verifyAccountError");
//		return actualResult;
//
//	}
//	
//	public static String amountError() {
//
//		
//		driver.findElement(By.linkText("Bill Pay")).click();
//
//		WebDriverWait Wait = new WebDriverWait(driver, 30);
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));
//
//		driver.findElement(By.xpath("//input[@name=\"payee.name\"]")).sendKeys("Sweta");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]")).sendKeys("Township");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]")).sendKeys("Haldia");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]")).sendKeys("westbengal");
//		driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]")).sendKeys("678534");
//		driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]")).sendKeys("8976537784");
//		driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]")).sendKeys("12345");
//		
//		driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]")).sendKeys("78654");
//		driver.findElement(By.xpath("//input[@value=\"Send Payment\"]")).click();
//
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.amount == 'empty'\"]")).getText();
//		screenshot("BillPayment_amountError");
//		return actualResult;
//
//	}
//	
//	
//	
//
//
//
//}

//package com.testing.Parabank.Pages;
//
//import java.util.ArrayList;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.testing.Parabank.ExtensionMethods.ScreenShot;
//import com.testing.Parabank.TestBase.DriverSetup;
//import com.testing.Parabank.Utils.DateUtils;
//import com.testing.Parabank.Utils.ReadingExcel;
//
//public class PayBills {
//
//	@FindBy(how=How.XPATH,using = "//input[@name=\"payee.name\"]")
//	static WebElement payeename;
//	@FindBy(how=How.XPATH,using = "//input[@name=\"payee.address.street\"]")
//	static WebElement address;
//	@FindBy(how=How.XPATH,using = "//input[@name=\"payee.address.city\"]")
//	static WebElement city;
//	@FindBy(how=How.XPATH,using = "//input[@name=\"payee.address.state\"]")
//	static WebElement state;
//	@FindBy(how=How.XPATH,using = "//input[@name=\"payee.address.zipCode\"]")
//	static WebElement zipcode;
//	@FindBy(how=How.XPATH,using = "//input[@name=\"payee.phoneNumber\"]")
//	static WebElement phonenumber;
//	@FindBy(how=How.XPATH,using = "//input[@name=\"payee.accountNumber\"]")
//	static WebElement account;
//	@FindBy(how=How.XPATH,using = "//input[@name=\"verifyAccount\"]")
//	static WebElement verifyaccount;
//	@FindBy(how=How.XPATH,using = "//input[@name=\"amount\"]")
//	static WebElement amount;
//	@FindBy(how=How.XPATH,using = "//select[@name=\"fromAccountId\"]")
//	static WebElement fromaccount;
//	@FindBy(how=How.XPATH,using = "//input[@value=\"Send Payment\"]")
//	static WebElement sendpayment;
//	@FindBy(how=How.LINK_TEXT,using = "Accounts Overview")
//	static WebElement accoverview;
//	@FindBy(how=How.XPATH,using = "//div[@ng-app=\"BillPayApp\"]")
//	static WebElement success;
//	
//
//	
//	private static WebDriver driver=DriverSetup.driver;
//	static ArrayList<String> list = Registration.getData();
//	static WebDriverWait Wait = new WebDriverWait(driver, 50);
//
//	static String user = DateUtils.username();
//
//	public PayBills() {
//
//		PageFactory.initElements(driver, this);
//	}
//
//	public static void click(WebElement element) {
//		//Wait.until(ExpectedConditions.visibilityOf(element));
//		element.click();
//	}
//
//	public static void sendText(WebElement element, String text) {
//
//		element.clear();
//		element.sendKeys(text);
//	}
//
//	public static void clear(WebElement element) {
//		element.clear();
//	}
//
//	public static void fillBillPayForm() {
//		driver.findElement(By.linkText("Bill Pay")).click();
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"payee.name\"]")));
//
//		sendText(payeename, list.get(0));
//
//		sendText(address, list.get(2));
//		sendText(city, list.get(3));
//		sendText(state, list.get(4));
//		sendText(zipcode, list.get(5).replaceAll("\"", ""));
//		sendText(phonenumber, list.get(6).replaceAll("\"", ""));
//		sendText(account, list.get(23).replaceAll("\"", ""));
//		sendText(verifyaccount, list.get(23).replaceAll("\"", ""));
//		sendText(amount, list.get(25).replaceAll("\"", ""));
//
//	}
//
//	public static void screenshot(String name) {
//		ScreenShot.takeScreenshot(driver, name);
//	}
//
//	public static String billpay() {
//
//		fillBillPayForm();
//		click(sendpayment);
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@ng-app=\"BillPayApp\"]")));
//		String actualResult = success.getText();
//		// click(logout);
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Bill Pay")));
//		return actualResult;
//
//	}
//
//	public static String payeenameError() {
//
//		fillBillPayForm();
//		clear(payeename);
//		click(sendpayment);
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.name\"]")).getText();
//		screenshot("BillPay_payeenameError");
//		return actualResult;
//
//	}
//
//	public static String addressError() {
//
//		fillBillPayForm();
//		clear(address);
//		click(sendpayment);
//		String errMessage = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.address\"]")).getText();
//		screenshot("BillPay_addressError");
//		return errMessage;
//
//	}
//
//	public static String cityError() {
//
//		fillBillPayForm();
//		clear(city);
//		click(sendpayment);
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.city\"]")).getText();
//		screenshot("BillPay_cityError");
//		return actualResult;
//
//	}
//
//	public static String stateError() {
//
//		fillBillPayForm();
//		clear(state);
//		click(sendpayment);
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.state\"]")).getText();
//		screenshot("BillPay_stateError");
//		return actualResult;
//
//	}
//
//	public static String zipcodeError() {
//
//		fillBillPayForm();
//		clear(zipcode);
//		click(sendpayment);
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.zipCode\"]")).getText();
//		screenshot("BillPay_zipcodeError");
//		return actualResult;
//
//	}
//
//	public static String PhonenumberError() {
//
//		fillBillPayForm();
//		clear(phonenumber);
//		click(sendpayment);
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"!validationModel.phoneNumber\"]"))
//				.getText();
//		return actualResult;
//
//	}
//
//	public static String accountError() {
//
//		fillBillPayForm();
//		clear(account);
//		click(sendpayment);
//		String actualResult = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.account == 'empty'\"]"))
//				.getText();
//		screenshot("BillPay_accountError");
//		return actualResult;
//
//	}
//
//	public static String accountMismatchError() {
//
//		fillBillPayForm();
//		clear(verifyaccount);
//		sendText(verifyaccount, list.get(11));
//		click(sendpayment);
//		String actualResult = driver
//				.findElement(By.xpath("//span[@ng-show=\"validationModel.verifyAccount == 'mismatch'\"]")).getText();
//		screenshot("BillPay_account_numberMismatchError");
//
//		return actualResult;
//	}
//
//	public static String verify_accountError() {
//
//		fillBillPayForm();
//		clear(verifyaccount);
//		click(sendpayment);
//		String actualResult = driver
//				.findElement(By.xpath("//span[@ng-show=\"validationModel.verifyAccount == 'empty'\"]")).getText();
//		screenshot("BillPay_verify_accountError");
//		return actualResult;
//
//	}
//
//	public static String amountError() {
//
//		fillBillPayForm();
//		clear(amount);
//		click(sendpayment);
//		String actualResult = driver.findElement(By.id("//span[@ng-show=\"validationModel.amount == 'empty'\"]"))
//				.getText();
//		screenshot("BillPay_amountError");
//		return actualResult;
//
//	}
//
//	public static String AccountDetails() {
//		System.out.println(accoverview+"********************************************");
//		System.out.println(list.get(0));
//		click(driver.findElement(By.linkText("Accounts Overview")));
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='accountTable']/tbody/tr[1]/td/a")));
//		String accountnumber = driver.findElement(By.xpath("//table[@id='accountTable']/tbody/tr[1]/td/a")).getText();
//		String amount = driver.findElement(By.xpath("//table[@id='accountTable']/tbody/tr[1]/td[3]")).getText();
//		return amount;
//	}
//
//}



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
 
