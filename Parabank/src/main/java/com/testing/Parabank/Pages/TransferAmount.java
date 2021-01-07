package com.testing.Parabank.Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.Parabank.ExtensionMethods.ScreenShot;
import com.testing.Parabank.TestBase.DriverSetup;

public class TransferAmount
{
	
	@FindBy(how = How.LINK_TEXT, using = "Transfer Funds")
	private static WebElement transferAmount;
	@FindBy(how = How.XPATH, using = "//input[@type = 'submit']")
	private static WebElement transferButton;
	@FindBy(how = How.XPATH, using = "//input[@id = 'amount']")
	private static WebElement amountTextBox;
	@FindBy(how = How.ID, using = "fromAccountId")
	private static WebElement fromAccount;
	@FindBy(how = How.ID, using = "toAccountId")
	private static WebElement toAccount;
	@FindBy(how = How.XPATH, using = "//div[@class=\"ng-scope\"]/p[1]" )
	private static WebElement smallSuccessMessage;
	@FindBy(how = How.XPATH, using = "//div[@class=\"ng-scope\"]/p")
	private static WebElement largeSuccessMessage;
	@FindBy(how = How.XPATH, using = "//p[@id='amount.errors']")
	private static WebElement errorMessage;
	
	public static WebDriver driver=DriverSetup.driver;
	
	public TransferAmount() {

		PageFactory.initElements(driver, this);
	}
	
	public static void sendText(WebElement element, String text)
	{
		element.clear();
		element.sendKeys(text);
	}
	public static void click(WebElement element)
	{
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
	    element.click();
	}
	public static void screenshot(String name)
	{
		ScreenShot.takeScreenshot(driver, name);
	}
	public static String getText(WebElement element)
	{
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		String s = element.getText();
		return s;
	}
	public static String transferringFunds() throws Exception { //Positive Test
		
		click(transferAmount);
		Thread.sleep(3000);
		sendText(amountTextBox , "20000");
		Select account1 = new Select(fromAccount);
		account1.selectByIndex(0);
		Select account2 = new Select(toAccount);
		account2.selectByIndex(1);
		click(transferButton);
		Thread.sleep(2000);
		String ssString = getText(smallSuccessMessage);
		screenshot("Positive Amount given");
		return ssString;
	}
	public static String checkingAmount() throws InterruptedException { // Giving Negative Amount
		click(transferAmount);
		Thread.sleep(3000);
		sendText(amountTextBox , "-10000");
		Select account1 = new Select(fromAccount);
		account1.selectByIndex(0);
		Select account2 = new Select(toAccount);
		account2.selectByIndex(1);
		click(transferButton);
		Thread.sleep(2000);
		String ssString = getText(smallSuccessMessage);
		screenshot("Negative Amount Given");
		return ssString;
	}
	public static String checkingAmountType() throws InterruptedException { //Giving invalid Amount
		click(transferAmount);
		Thread.sleep(3000);
		sendText(amountTextBox, "aaaaa");
		Select account1 = new Select(fromAccount);
		account1.selectByIndex(0);
		Select account2 = new Select(toAccount);
		account2.selectByIndex(1);
		click(transferButton);
		Thread.sleep(2000);
		String ssString = getText(errorMessage);
		screenshot("Transferamount_invalidamoutnError");
		return ssString;
	}
	public static String checkingAmountRange() throws InterruptedException { //Going above [1-9] * 10^14
		click(transferAmount);
		Thread.sleep(3000);
		sendText(amountTextBox , "999999999999");
		Select account1 = new Select(fromAccount);
		account1.selectByIndex(0);
		Select account2 = new Select(toAccount);
		account2.selectByIndex(1);
		click(transferButton);
		Thread.sleep(2000);
		String ssString = getText(largeSuccessMessage);
		screenshot("Long Amount value given");
		return ssString;
	}
	public static String noAmountGiven() throws InterruptedException{ //Amount field is kept blank
		click(transferAmount);
		Thread.sleep(3000);
		Select account1 = new Select(fromAccount);
		account1.selectByIndex(0);
		Select account2 = new Select(toAccount);
		account2.selectByIndex(1);
		click(transferButton);
		Thread.sleep(2000);
		String ssString = getText(errorMessage);
		screenshot("Not Amount Given");
		return ssString;
		
	}
}
