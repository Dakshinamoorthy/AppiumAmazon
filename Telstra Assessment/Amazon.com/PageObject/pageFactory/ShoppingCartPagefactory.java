package pageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
public class ShoppingCartPagefactory {
 public ShoppingCartPagefactory(AppiumDriver < WebElement > driver) {
  PageFactory.initElements(driver, this);
 }
 @FindBy(id = "in.amazon.mShop.android.shopping:id/action_bar_cart_image")
 public WebElement CartImageBtn;
 @FindBy(xpath = "//sc-active-cart//activeCartandroid.view.ViewForm//@android.view.View[contains(@id,'sc-item')]/android.android.view.View.android.view.View[1]/android.view.View[0]/android.view.View[2]/android.view.View[0]")
 public WebElement CartProductName;
 @FindBy(xpath = "//sc-active-cart//activeCartandroid.view.ViewForm//@android.view.View[contains(@id,'sc-item')]/android.view.View[1]/android.view.View[0]/android.view.View[2]//android.widget.Listandroid.view.View[1]/android.view.View[0]/android.view.View[2]")
 public WebElement CartProductPrice;
 @FindBy(xpath = "//android.widget.Button[contains(@text, 'Proceed to Buy')]")
 public WebElement ProceedtoBuyBtn;
}