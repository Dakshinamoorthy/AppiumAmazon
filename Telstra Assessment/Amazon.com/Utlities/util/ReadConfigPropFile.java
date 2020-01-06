package util;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ReadConfigPropFile {
 public static Properties prop;
 public static void ReadConfigFile() throws IOException {
  prop = new Properties();
  FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\Config\\config.properties");
  ip.close();
 }
}