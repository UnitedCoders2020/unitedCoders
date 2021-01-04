package com.testing.Parabank.ExtensionMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void takeScreenshot(WebDriver driver,String name) {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(SrcFile,
					new File(System.getProperty("user.dir")+"\\Screenshots\\"+name+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
