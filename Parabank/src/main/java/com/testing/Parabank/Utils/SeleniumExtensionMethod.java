package com.testing.Parabank.Utils;


import org.openqa.selenium.WebElement;



public class SeleniumExtensionMethod {
	
	public static void enterText( WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

}
