package com.testing.Parabank.Pages;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
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
import com.testing.Parabank.Utils.ReadingExcel;

public class OpenAccount {
	@FindBy(how = How.LINK_TEXT, using = "Open New Account")
	private static WebElement opennewaccount;
	@FindBy(how = How.ID, using = "type")
	private static WebElement type;
	@FindBy(how = How.ID, using = "fromAccountId")
	private static WebElement accountid;
	@FindBy(how = How.NAME, using = "username")
	private static WebElement username;
	@FindBy(how = How.NAME, using = "password")
	private static WebElement password;
	@FindBy(how = How.XPATH, using = "//input[@value=\"Log In\"]" )
	private static WebElement login;
	@FindBy(how = How.XPATH, using = "//input[@class='button']")
	private static WebElement openaccountbutton;
	@FindBy(how = How.XPATH, using = "//*[@id=\\\"rightPanel\\\"]/div/div/p[1]")
	private static WebElement accountopenmessage;
	@FindBy(how = How.ID, using = "newAccountId")
	private static WebElement newaccountid;
	@FindBy(how = How.LINK_TEXT, using = "Accounts Overview")
	private static WebElement accountsoverview;
	@FindBy(how = How.XPATH, using = "//*[@id='accountTable']/tbody/tr/td[1]/a")
	private static WebElement accountidlist;
	@FindBy(how = How.XPATH, using = "//*[@id=\"accountTable\"]/tbody/tr[14]/td[2]")
	private static WebElement miniumbalance;
	public static WebDriver driver=DriverSetup.driver;
	static XSSFSheet sheet=ReadingExcel.sheet;
	
	public OpenAccount() {

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

	public static String opennewaccount() {
		sendText(username,sheet.getRow(10).getCell(1).getStringCellValue());
		sendText(password,sheet.getRow(11).getCell(1).getStringCellValue());
		click(login);
		//driver.findElement(By.name("username")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		//driver.findElement(By.name("password")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		//driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		
		WebDriverWait Wait = new WebDriverWait(driver, 50);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Open New Account")));
		
		click(opennewaccount);
		//driver.findElement(By.linkText("Open New Account")).click();
		Select T = new Select(type);
		T.selectByVisibleText(sheet.getRow(2).getCell(2).getStringCellValue());
		Select acc = new Select(accountid);
		acc.selectByIndex(0);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//driver.findElement(By.xpath("//input[@class='button']")).click();
		click(openaccountbutton);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rightPanel\"]/div/div/p[1]")));

		//String result = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/p[1]")).getText();
		String result=getText(accountopenmessage);
		screenshot("Open Account");
		return result;
	}

	public static String validateaccount() {
		//String accno = new String(driver.findElement(By.id("newAccountId")).getText());
		String accno=getText(newaccountid);
		//driver.findElement(By.linkText("Accounts Overview")).click();
		click(accountsoverview);
		WebDriverWait Wait = new WebDriverWait(driver, 50);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='accountTable']/tbody/tr/td[1]/a")));
		
		//List<WebElement> element =driver.findElements(By.xpath("//*[@id='accountTable']/tbody/tr/td[1]/a"));
		List<WebElement> element=(List<WebElement>) accountidlist;
		String balance=getText(miniumbalance);
		int c=0;
		for(int i=0;i<element.size();i++) {
			String str=element.get(i).getText();
			//if(str.contains(accno) && balance.equals(100)) {
			if(str.contains(accno)){
				c++;
			}
		}
		if(c>0) {
			screenshot("Account verified");
			return "Account created";
		}
		else {
			screenshot("Account not verified");
			return "Account not created";
		}
		
	}
}
