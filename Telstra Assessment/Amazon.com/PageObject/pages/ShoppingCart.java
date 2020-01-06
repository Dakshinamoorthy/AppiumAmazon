package pages;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import pageFactory.ShoppingCartPagefactory;
import util.ProdDetails;
public class ShoppingCart extends ShoppingCartPagefactory {
 public ShoppingCart(AppiumDriver < WebElement > driver) {
  super(driver);
  // TODO Auto-generated constructor stub
 }
 public Map < String, String > ShoppingCartPage(AppiumDriver < WebElement > driver, String purchaseProductName) throws InterruptedException {
  {
   Map < String, String > cartPageItemDetailsDict = new HashMap < String, String > ();
   CartImageBtn.click();
   driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
   //scroll to product
   new util.Actions().ScrollToElem(CartProductName, driver);
   cartPageItemDetailsDict.put(ProdDetails.BrandName.toString(), CartProductName.getText());
   cartPageItemDetailsDict.put(ProdDetails.ProductDescribtion.toString(), CartProductName.getText());
   cartPageItemDetailsDict.put(ProdDetails.ProductSize.toString(), CartProductName.getText());
   cartPageItemDetailsDict.put(ProdDetails.ProductPrices.toString(), CartProductPrice.getText());
   ProceedtoBuyBtn.click();
   return cartPageItemDetailsDict;
  }
 }
}