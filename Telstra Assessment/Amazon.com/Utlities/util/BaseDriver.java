package util;
import java.io.File;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
public class BaseDriver {
 public static AppiumDriver < WebElement > driver;
 private static AppiumDriverLocalService service;
 public void setUp() throws Exception {
  service = AppiumDriverLocalService.buildDefaultService();
  service.start();
  if (service == null || !service.isRunning()) {
   throw new AppiumServerHasNotBeenStartedLocallyException(
    "An appium server node is not started!");
  }
  File classpathRoot = new File(System.getProperty("user.dir"));
  File appDir = new File(classpathRoot, ReadConfigPropFile.prop.getProperty("apkPath"));
  File app = new File(appDir.getCanonicalPath(), ReadConfigPropFile.prop.getProperty("apk"));
  DesiredCapabilities capabilities = new DesiredCapabilities();
  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ReadConfigPropFile.prop.getProperty("platformName"));
  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ReadConfigPropFile.prop.getProperty("platformVersion"));
  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ReadConfigPropFile.prop.getProperty("deviceName"));
  capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
  capabilities.setCapability("appPackage", "in.amazon.mShop.adroid.shoppig");
  capabilities.setCapability("appActivity", "com.amazo.mShop.splashscree.StartupActivity");
  driver = new AndroidDriver < > (service.getUrl(), capabilities);
 }
 public void stopAppium() throws Exception {
  if (driver != null) {
   driver.quit();
  }
  if (service != null) {
   service.stop();
  }
 }
}