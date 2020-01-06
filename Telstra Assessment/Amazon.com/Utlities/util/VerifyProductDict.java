package util;
import java.util.Map;
import org.testng.Assert;
public class VerifyProductDict implements IVerifyProdDict {
 @Override
 public void verifyTwoProdDict(Map < String, String > dict1, Map < String, String > dict2) {
  for (String k: dict1.keySet()) {
   for (String k1: dict2.keySet()) {
    if (k.equals(k1)) {
     Assert.assertTrue(dict1.get(k).contains(dict2.get(k1)), k.toString() + " is mismatches in product page & Shopping Cart Page");
    }
   }
  }
 }
}