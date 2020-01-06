package pageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
public class AppLoginPagefactory {
 public AppLoginPagefactory(AppiumDriver < WebElement > driver) {
  PageFactory.initElements(driver, this);
 }
 @FindBy(id = "in.amazon.mShop.android.shopping:id/sign_in_button")
 public static WebElement SigninBtn;
 @FindBy(id = "ap_email_login")
 public static WebElement UserNameTxt;
 @FindBy(id = "continue")
 public static WebElement ContinueBtn;
 @FindBy(id = "ap_password")
 public static WebElement PasswordText;
 @FindBy(id = "signInSubmit")
 public static WebElement LoginBtn;
}