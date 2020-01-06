package util;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
public class ReportGenerator {
 public static ExtentTest logger;
 public static ExtentReports extent;
 public void CreateReport() {
  extent = new ExtentReports(System.getProperty("user.dir") + ReadConfigPropFile.prop.getProperty("ExtendReportPath"));
  logger = extent.startTest(ReadConfigPropFile.prop.getProperty("ExtentReportTestName"));
 }
 public void flushReport() {
  extent.endTest(logger);
  extent.flush();
 }
}