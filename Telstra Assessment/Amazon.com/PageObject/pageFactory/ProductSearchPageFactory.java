package pageFactory;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
public class ProductSearchPageFactory {
 public ProductSearchPageFactory(AppiumDriver < WebElement > driver) {
  PageFactory.initElements(driver, this);
 }
 @FindBy(id = "in.amazon.mShop.android.shopping:id/rs_search_src_text")
 public WebElement SearchInputField;
 @FindBy(xpath = "//android.widget.Textandroid.view.View[contains(@text, '(65 inches)')]")
 public List < WebElement > ProductRow;
 @FindBy(id = "bylineInfo")
 public WebElement BrandName;
 @FindBy(xpath = "//titleExpanderContent/android.view.View/android.view.View")
 public WebElement ProductDesc;
 @FindBy(xpath = "//android.widget.Button[1]")
 public WebElement ProductInch;
 @FindBy(className = "android.widget.EditText")
 public WebElement ProductPrice;
 @FindBy(id = "atfRedesign_strikeThroughPrice")
 public WebElement ProductActualPrice;
 @FindBy(id = "atfRedesign_priceToPay_savings")
 public WebElement ProductSavedPrice;
 @FindBy(id = "add-to-cart-button")
 public WebElement AddToCartBtn;
}