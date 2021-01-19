package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testing.Parabank.TestBase.DriverSetup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class practice {

	WebDriver driver;
	
	@Given("^user prints hello world\\.$")
	public void user_prints_hello_world()  {
	  driver = DriverSetup.driver; 
	}

	@Then("^user prints its name\\.$")
	public void user_prints_its_name() throws Exception  {
	    driver.findElement(By.name("username")).sendKeys("Rahul@171144");
	    driver.findElement(By.name("password")).sendKeys("rahul123");
	    driver.findElement(By.xpath("//input[@value='Log In']")).click();
	    Thread.sleep(3000);
	}

}
