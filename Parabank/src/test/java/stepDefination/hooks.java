package stepDefination;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	
	public static WebDriver driver;

	@Before
	public static void DriverSetup() {
		driver = com.testing.Parabank.TestBase.DriverSetup.invokeDriver("ChromeDriver_WindowsOS");
	}
	
	@After 
	public static void closeBrowser() {
		driver.quit();
	}
}
