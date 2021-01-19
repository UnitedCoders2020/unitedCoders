package stepDefination;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	
	public static WebDriver driver;
	static int c=0;

	@Before
	public static void DriverSetup() {
		if(c==0) {
		driver = com.testing.Parabank.TestBase.DriverSetup.invokeDriver("ChromeDriver_WindowsOS");
		c++;
		}
	}
	
	@After("@Test") 
	public static void closeBrowser() {
		driver.quit();
	}
}
