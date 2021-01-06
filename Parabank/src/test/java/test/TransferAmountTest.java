package test;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testing.Parabank.ExtensionMethods.ExtendReport;
import com.testing.Parabank.Pages.TransferAmount;
import com.testing.Parabank.TestBase.DriverSetup;




public class TransferAmountTest extends TransferAmount{
	
    //Declaration of static variables.
	public static WebDriver driver;
	public static ExtentReports report = ExtendReport.report;
	public static ExtentTest test;
	
   
	//Complete Transfer Amount operation
	@Test(groups= {"SmokeTesting","RegressionTesting"})
	public static void transferringAmount() throws Exception {
		
		test = report.createTest("Transferring Amount");
		driver=DriverSetup.driver;
		
		test.log(Status.INFO, "Starting the transfer");
		String ssString = TransferAmount.transferringFunds(driver);
		test.log(Status.PASS, ssString);
		test.log(Status.INFO, "Transferring negative amount");
		String ssString2 = TransferAmount.checkingAmount(driver);
		test.log(Status.PASS,ssString2);
		test.log(Status.INFO, "Passing invalid characters");
		String ssString3 = TransferAmount.checkingAmountType(driver);
		test.log(Status.PASS, ssString3);
		test.log(Status.INFO, "Transferring large amount");
		String ssString4 = TransferAmount.checkingAmountRange(driver);
		test.log(Status.PASS, ssString4);
		String ssString5 = TransferAmount.noAmountGiven(driver);
		test.log(Status.PASS, ssString5);
		
	}
	
}