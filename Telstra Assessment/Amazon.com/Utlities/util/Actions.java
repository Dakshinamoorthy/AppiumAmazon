package util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import io.appium.java_client.AppiumDriver;
public class Actions {
 public void ScrollToElem(WebElement WebElement, AppiumDriver < WebElement > driver) {
  TouchActions action = new TouchActions(driver);
  action.scroll(WebElement, 10, 100);
  action.perform();
 }
}