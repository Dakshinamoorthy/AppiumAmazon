package appSetup;
import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.LogStatus;
import util.AppLogin;
import util.BaseDriver;
import util.ReportGenerator;
public class Setup extends BaseDriver {
 @BeforeSuite
 public void setupInit() throws Exception {
  setUp();
  ReportGenerator.logger.log(LogStatus.INFO, "Setting Up Screen Orientation");
  driver.rotate(ScreenOrientation.PORTRAIT);
  new AppLogin(driver).Login("", "", driver);
  ReportGenerator.logger.log(LogStatus.INFO, "Login");
 }
 @AfterSuite
 public void tearDown() throws Exception {
  stopAppium();
 }
}