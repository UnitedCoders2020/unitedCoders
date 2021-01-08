package test;



import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testing.Parabank.ExtensionMethods.ExtendReport;
import com.testing.Parabank.Pages.TransferAmount;
import com.testing.Parabank.TestBase.DriverSetup;




public class TransferAmountTest extends TransferAmount{
	
    //Declaration of static variables.
	public static ExtentReports report = ExtendReport.report;
	public static ExtentTest test;
	
   
	//Complete Transfer Amount operation
	@Test(groups= {"SmokeTesting","RegressionTesting"})
	public static void transferringAmount() throws Exception {
		
		test = report.createTest("Transferring Amount");
		
		
		test.log(Status.INFO, "Starting the transfer");
		String ssString = TransferAmount.transferringFunds();
		test.log(Status.PASS, ssString);
		test.log(Status.INFO, "Transferring negative amount");
		String ssString2 = TransferAmount.checkingAmount();
		test.log(Status.PASS,ssString2);
		test.log(Status.INFO, "Passing invalid characters");
		String ssString3 = TransferAmount.checkingAmountType();
		test.log(Status.PASS, ssString3);
		test.log(Status.INFO, "Transferring large amount");
		String ssString4 = TransferAmount.checkingAmountRange();
		test.log(Status.PASS, ssString4);
		test.log(Status.INFO, "Giving no amount");
		String ssString5 = TransferAmount.noAmountGiven();
		test.log(Status.PASS, ssString5);
		
	}
	
}