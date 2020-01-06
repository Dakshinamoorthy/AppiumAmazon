package util;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import io.appium.java_client.AppiumDriver;
import pageFactory.AppLoginPagefactory;
public class AppLogin extends AppLoginPagefactory {
 public AppLogin(AppiumDriver < WebElement > driver) {
  super(driver);
  // TODO Auto-generated constructor stub
 }
 @Parameters({  "userName",  "password" })
 public void Login(String userName, String password, AppiumDriver < WebElement > driver) throws IOException, InterruptedException {
  SigninBtn.click();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  UserNameTxt.clear();
  UserNameTxt.sendKeys(userName);
  ContinueBtn.click();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  PasswordText.clear();
  PasswordText.sendKeys(password);
  LoginBtn.click();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  Thread.sleep(70000);
 }
}