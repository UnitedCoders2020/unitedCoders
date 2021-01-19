package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testing.Parabank.ExtensionMethods.ExtendReport;
import com.testing.Parabank.TestBase.DriverSetup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class registrationStep {

	@FindBy(id = "customer.firstName")
	public static WebElement Firstname;
	@FindBy(id = "customer.lastName")
	static WebElement Lastname;
	@FindBy(id = "customer.address.street")
	static WebElement Address;
	@FindBy(id = "customer.address.city")
	static WebElement City;
	@FindBy(id = "customer.address.state")
	static WebElement State;
	@FindBy(id = "customer.address.zipCode")
	static WebElement Zipcode;
	@FindBy(id = "customer.phoneNumber")
	static WebElement Phonenumber;
	@FindBy(id = "customer.ssn")
	static WebElement Ssn;
	@FindBy(id = "customer.username")
	static WebElement Username;
	@FindBy(id = "customer.password")
	static WebElement Password;
	@FindBy(id = "repeatedPassword")
	static WebElement Confirmpassword;
	@FindBy(linkText = "Register")
	static WebElement registerationForm;
	@FindBy(linkText = "Log Out")
	static WebElement logout;
	@FindBy(xpath = "//div[@id='rightPanel']/p")
	static WebElement success;
	@FindBy(xpath = "//input[@value='Register']")
	static WebElement register;
	@FindBy(xpath = "//span")
	static WebElement error;

	WebDriver driver;
	ExtentReports report = ExtendReport.getReportInstance();
	ExtentTest logger;

	@Given("^User is on home page of parabank website\\.$")
	public void user_is_on_home_page_of_parabank_website() {

		driver = DriverSetup.driver;
		PageFactory.initElements(driver, this);

	}

	@Then("^User clicks on register link to fill the form\\.$")
	public void user_clicks_on_register_link_to_fill_the_form() throws Exception {

		registerationForm.click();
		Thread.sleep(3000);
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" to register\\.$")
	public void user_enters_and_and_and_and_and_and_and_and_and_and_to_register(String firstname, String lastname,
			String address, String city, String state, String zipcode, String phonenumber, String ssn, String username,
			String password, String confirmpassword) throws Exception {

		driver.navigate().refresh();
		Firstname.sendKeys(firstname);
		Lastname.sendKeys(lastname);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		Zipcode.sendKeys(zipcode);
		Phonenumber.sendKeys(phonenumber);
		Ssn.sendKeys(ssn);
		Username.sendKeys(username);
		Password.sendKeys(password);
		Confirmpassword.sendKeys(confirmpassword);

		register.click();
		Thread.sleep(2000);

	}

	@Then("^User retrieves the message displayed using \"([^\"]*)\"\\.$")
	public void user_retrieves_the_message_displayed(String id) {

		String message = success.getText();
		logout.click();
		if (id.equals("1")) {
			logger = report.createTest("Successful registration with all valid inputs.");
			Assert.assertEquals(message, "Your account was created successfully. You are now logged in.");
			logger.log(Status.PASS, "Registration successfull with valid inputs.");
		} else if (id.equals("2")) {
			logger = report.createTest("Successful registration without phone number.");
			Assert.assertEquals(message, "Your account was created successfully. You are now logged in.");
			logger.log(Status.PASS, "Registration successfull without phonenumber.");
		}

	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" to get error message\\.$")
	public void user_enters_and_and_and_and_and_and_and_and_and_and_to_get_error_message(String firstname,
			String lastname, String address, String city, String state, String zipcode, String phonenumber, String ssn,
			String username, String password, String confirmpassword) throws Exception {

		driver.navigate().refresh();
		Firstname.sendKeys(firstname);
		Lastname.sendKeys(lastname);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		Zipcode.sendKeys(zipcode);
		Phonenumber.sendKeys(phonenumber);
		Ssn.sendKeys(ssn);
		Username.sendKeys(username);
		Password.sendKeys(password);
		Confirmpassword.sendKeys(confirmpassword);

		register.click();
		Thread.sleep(2000);

	}

	@Then("^User retrieves the error message displayed using \"([^\"]*)\"\\.$")
	public void user_retrieves_the_message_displayed_using(String id) {

		String errmsg = error.getText();
		if (id.equals("1")) {
			logger = report.createTest("First name error message.");
			Assert.assertEquals(errmsg, "First name is required.");
			logger.log(Status.INFO, "First name error message verified.");
			logger.log(Status.PASS, "Test passed.");
		} else if (id.equals("2")) {
			logger = report.createTest("Last name error message.");
			Assert.assertEquals(errmsg, "Last name is required.");
			logger.log(Status.INFO, "Last name error message verified.");
			logger.log(Status.PASS, "Test passed.");
		} else if (id.equals("3")) {
			logger = report.createTest("Address error message.");
			Assert.assertEquals(errmsg, "Address is required.");
			logger.log(Status.INFO, "Address error message verified.");
			logger.log(Status.PASS, "Test passed.");
		} else if (id.equals("4")) {
			logger = report.createTest("City error message.");
			Assert.assertEquals(errmsg, "City is required.");
			logger.log(Status.INFO, "City error message verified.");
			logger.log(Status.PASS, "Test passed.");
		} else if (id.equals("5")) {
			logger = report.createTest("State error message.");
			Assert.assertEquals(errmsg, "State is required.");
			logger.log(Status.INFO, "State error message verified.");
			logger.log(Status.PASS, "Test passed.");

		} else if (id.equals("6")) {
			logger = report.createTest("Zipcode error message.");
			Assert.assertEquals(errmsg, "Zip Code is required.");
			logger.log(Status.INFO, "Zip code error message verified.");
			logger.log(Status.PASS, "Test passed.");

		} else if (id.equals("7")) {
			logger = report.createTest("SSN error message.");
			Assert.assertEquals(errmsg, "Social Security Number is required.");
			logger.log(Status.INFO, "SSN error message verified.");
			logger.log(Status.PASS, "Test passed.");

		} else if (id.equals("8")) {
			logger = report.createTest("Username error message.");
			Assert.assertEquals(errmsg, "Username is required.");
			logger.log(Status.INFO, "Username error message verified.");
			logger.log(Status.PASS, "Test passed.");
			
		} else if (id.equals("9")) {
			logger = report.createTest("Password error message.");
			Assert.assertEquals(errmsg, "Password is required.");
			logger.log(Status.INFO, "Password error message verified.");
			logger.log(Status.PASS, "Test passed.");
			
		} else if (id.equals("10")) {
			logger = report.createTest("Confirm password error message.");
			Assert.assertEquals(errmsg, "Password confirmation is required.");
			logger.log(Status.INFO, "Confirm password error message verified.");
			logger.log(Status.PASS, "Test passed.");
			
		} else if (id.equals("11")) {
			logger = report.createTest("Password mismatch error message.");
			Assert.assertEquals(errmsg, "Passwords did not match.");
			logger.log(Status.INFO, "Matching password error message verified.");
			logger.log(Status.PASS, "Test passed.");
			
		} else if (id.equals("12")) {
			logger = report.createTest("First name maximum character error message.");
			Assert.assertEquals(errmsg, "This username already exists.");
			logger.log(Status.INFO, "First name maximum character is verified");
			logger.log(Status.PASS, "Test passed.");
			
		} else if (id.equals("13")) {
			logger = report.createTest("last name maximum character error message.");
			Assert.assertEquals(errmsg, "This username already exists.");
			logger.log(Status.INFO, "last name maximum character is verified");
			logger.log(Status.PASS, "Test passed.");
			
		} else if (id.equals("14")) {
			logger = report.createTest("Address maximum character error message.");
			Assert.assertEquals(errmsg, "This username already exists.");
			logger.log(Status.INFO, "Address maximum character is verified");
			logger.log(Status.PASS, "Test passed.");
			
		} else if (id.equals("15")) {
			logger = report.createTest("City maximum character error message.");
			Assert.assertEquals(errmsg, "This username already exists.");
			logger.log(Status.INFO, "City maximum character is verified");
			logger.log(Status.PASS, "Test passed.");
			
		} else if (id.equals("16")) {
			logger = report.createTest("State maximum character error message.");
			Assert.assertEquals(errmsg, "This username already exists.");
			logger.log(Status.INFO, "State maximum character is verified");
			logger.log(Status.PASS, "Test passed.");
			
		} else if (id.equals("17")) {
			logger = report.createTest("Zipcode maximum character error message.");
			Assert.assertEquals(errmsg, "This username already exists.");
			logger.log(Status.INFO, "Zipcode maximum character is verified");
			logger.log(Status.PASS, "Test passed.");
			
		} else if (id.equals("18")) {
			logger = report.createTest("Phone number maximum character error message.");
			Assert.assertEquals(errmsg, "This username already exists.");
			logger.log(Status.INFO, "Phone number maximum character is verified");
			logger.log(Status.PASS, "Test passed.");
			
		} else if (id.equals("19")) {
			logger = report.createTest("SSN maximum character error message.");
			Assert.assertEquals(errmsg, "This username already exists.");
			logger.log(Status.INFO, "SSN maximum character is verified");
			logger.log(Status.PASS, "Test passed.");
			
		} else if (id.equals("20")) {
			logger = report.createTest("Username maximum character error message.");
			Assert.assertEquals(errmsg, "This username already exists.");
			logger.log(Status.INFO, "Username maximum character is verified");
			logger.log(Status.PASS, "Test passed.");
			
		} else if (id.equals("21")) {
			logger = report.createTest("Password maximum character error message.");
			Assert.assertEquals(errmsg, "This username already exists.");
			logger.log(Status.INFO, "Password maximum character is verified");
			logger.log(Status.PASS, "Test passed.");
		} 
		report.flush();

	}

}
