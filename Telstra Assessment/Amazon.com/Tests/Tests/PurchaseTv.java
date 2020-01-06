package Tests;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import pages.ProductSearch;
import util.BaseDriver;
import util.ReportGenerator;
import util.ScreenShot;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.testng.annotations.AfterMethod;

public class PurchaseTv extends BaseDriver {
	
 @BeforeMethod
 public void beforeMethod() {
  new ReportGenerator().CreateReport();
 }
 
 @Test
 public void purchase65inchTv(String purchaseProduct1) throws IOException {
  try 
  {
   new ProductSearch(driver).SearchProductAndAddtoCart(driver);
  }
  catch (Exception ex) 
  {
   new ScreenShot();
   String temp = ScreenShot.TakeScreenShot(LogStatus.FAIL.toString(), driver);
   ReportGenerator.logger.log(LogStatus.FAIL, ex.getMessage(), ReportGenerator.logger.addScreenCapture(temp));
  }
 }
 
 @AfterMethod
 public void afterMethod() {
  new ReportGenerator().flushReport();
 }
}