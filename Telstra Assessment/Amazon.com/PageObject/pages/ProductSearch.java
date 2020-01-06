package pages;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import pageFactory.ProductSearchPageFactory;
import util.Actions;
import util.ProdDetails;
import util.ReadConfigPropFile;
public class ProductSearch extends ProductSearchPageFactory {
 public ProductSearch(AppiumDriver < WebElement > driver) {
  super(driver);
  // TODO Auto-generated constructor stub
 }
 public Map < String, String > SearchProductAndAddtoCart(AppiumDriver < WebElement > driver) throws InterruptedException {
  Map < String, String > productPageDetailsDict = new HashMap < String, String > ();
  SearchInputField.clear();
  SearchInputField.sendKeys(ReadConfigPropFile.prop.getProperty("purchaseProduct"));
  SearchInputField.sendKeys(Keys.ENTER);
  Thread.sleep(70000);
  int numberofProdRow = ProductRow.size();
  Random rand = new Random();
  int getSelectedProdRow = rand.nextInt(numberofProdRow);
  //randomaly select row
  new util.Actions().ScrollToElem(ProductRow.get(getSelectedProdRow), driver);
  ProductRow.get(getSelectedProdRow).click();
  driver.rotate(ScreenOrientation.LANDSCAPE);
  productPageDetailsDict.put(ProdDetails.BrandName.toString(), BrandName.getTagName());
  productPageDetailsDict.put(ProdDetails.ProductDescribtion.toString(), ProductDesc.getTagName());
  productPageDetailsDict.put(ProdDetails.ProductSize.toString(), ProductInch.getTagName());
  productPageDetailsDict.put(ProdDetails.ProductPrices.toString(), ProductPrice.getTagName());
  productPageDetailsDict.put(ProdDetails.ProductActPrice.toString(), ProductActualPrice.getTagName());
  productPageDetailsDict.put(ProdDetails.ProductSavePrice.toString(), ProductSavedPrice.getTagName());
  new Actions().ScrollToElem(AddToCartBtn, driver);
  AddToCartBtn.click();
  driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
  driver.rotate(ScreenOrientation.PORTRAIT);
  return productPageDetailsDict;
 }
}