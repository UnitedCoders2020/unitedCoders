package test;

import com.testing.Parabank.Pages.UpdateInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testing.Parabank.ExtensionMethods.ExtendReport;

public class updateinfoTest extends UpdateInfo {
	static ExtentReports report = ExtendReport.report;
	static ExtentTest logger;

	@Test(priority = 1,groups= {"SmokeTesting"})
	public static void validUpdate() {

		logger = report.createTest("Update Valid Information");

		String valid = UpdateInfo.update();
		Assert.assertEquals(valid, "Your updated address and phone number have been added to the system.");
		logger.log(Status.PASS, "Information Update Successfull with valid inputs.");
		
		String ph = UpdateInfo.UpdatePhnumber();
		Assert.assertEquals(ph,"Your updated address and phone number have been added to the system." );
		logger.log(Status.INFO, "Information Update Successful without phone number.");
		logger.log(Status.PASS, "Information Update Successfull with valid inputs.");
		
	

	}

	@Test(priority = 2,groups= {"RegressionTesting"})
	public static void invalidUpdate() {
		logger = report.createTest("Invalid Update Information");

		String fname = UpdateInfo.UpdatefnameErr();
		String lname = UpdateInfo.UpdatelnameErr();
		String address = UpdateInfo.UpdateaddressErr();
		String city = UpdateInfo.UpdatecityErr();
		String state = UpdateInfo.UpdatestateErr();
		String zip = UpdateInfo.UpdateZipCodeErr();
		

		Assert.assertEquals(fname, "First name is required.");
		logger.log(Status.INFO, "First name error message verified.");
		Assert.assertEquals(lname, "Last name is required.");
		logger.log(Status.INFO, "Last name error message verified.");
		Assert.assertEquals(address, "Address is required.");
		logger.log(Status.INFO, "Address error message verified.");
		Assert.assertEquals(city, "City is required.");
		logger.log(Status.INFO, "City error message verified.");
		Assert.assertEquals(state, "State is required.");
		logger.log(Status.INFO, "State error message verified.");
		Assert.assertEquals(zip, "Zip Code is required.");
		logger.log(Status.INFO, "Zip code error message verified.");
		
		logger.log(Status.PASS, "Invalid registration error message is recieved.");
		
		

		report.flush();
		
	}


}