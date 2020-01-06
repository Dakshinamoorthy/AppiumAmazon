package util;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import io.appium.java_client.AppiumDriver;
public class ScreenShot {
 static ITestContext testContext;
 public static String TakeScreenShot(String status, AppiumDriver < WebElement > driver) throws IOException {
  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  String path = System.getProperty("user.dir") + ReadConfigPropFile.prop.getProperty("ScreenShotsPath") + System.currentTimeMillis() +
   testContext.getName() + " - " + status + ".png";
  File Dest = new File(path);
  try {
   FileUtils.copyFile(scrFile, Dest);
  } catch (IOException ex) {}
  return path;
 }
}