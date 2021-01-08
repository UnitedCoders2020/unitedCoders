//package test;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.testing.Parabank.ExtensionMethods.ExtendReport;
//import com.testing.Parabank.Pages.OpenAccount;
//
//public class openaccountTest extends OpenAccount {
//
//	static ExtentReports report = ExtendReport.report;
//	static ExtentTest logger;
//
//	@Test(priority = 1,groups= {"SmokeTesting","RegressionTesting"})
//	public static void openaccountmessage() {
//
//		logger = report.createTest("Open Account Message");
//
//		String success = OpenAccount.opennewaccount();
//
//		Assert.assertEquals(success, "Congratulations, your account is now open.");
//		logger.log(Status.PASS, "New Account has been opened with minimum balance");
//	}
//
//	@Test(priority = 2,groups= {"SmokeTesting","RegressionTesting"})
//	public static void verifyAccount() {
//
//		logger = report.createTest("Verify Account");
//
//		String verify = OpenAccount.validateaccount();
//		Assert.assertEquals(verify, "Account created");
//		logger.log(Status.PASS, "New Account has been opened and verified");
//	}
//
//	
//}

package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testing.Parabank.ExtensionMethods.ExtendReport;
import com.testing.Parabank.Pages.OpenAccount;

public class openaccountTest extends OpenAccount {

	static ExtentReports report = ExtendReport.report;
	static ExtentTest logger;

	@Test(priority = 1,groups= {"SmokeTesting","RegressionTesting"})
	public static void openaccountmessage() {

		logger = report.createTest("Open Account Message");

		String success = OpenAccount.open();

		Assert.assertEquals(success, "Congratulations, your account is now open.");
		logger.log(Status.PASS, "New Account has been opened with minimum balance");
	}

	@Test(priority = 2,groups= {"SmokeTesting","RegressionTesting"})
	public static void verifyAccount() {

		logger = report.createTest("Verify Account");

		String verify = OpenAccount.validateaccount();
		Assert.assertEquals(verify, "Account created");
		logger.log(Status.PASS, "New Account has been opened and verified");
	}

	
}

