package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

    public static WebDriver driver;
     public static Properties prop;
   static private final String filePath = System.getProperty("user.dir")+"/src/main/resources/config/config.properties";


    public TestBase() {
        prop = new Properties();
        File configFile = new File(filePath);
        try {
            FileInputStream fi = new FileInputStream(configFile);
            prop.load(fi);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

       public void initialization(){
        //System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+"src/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().fullscreen();
        driver.get(prop.getProperty("url"));
    }

    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
