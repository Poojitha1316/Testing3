package BaseTest;

import Utilities.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTestClass {
    public static WebDriver driver;

    public void openBrowserAndNavigate() throws Exception {

        String browser = ReadProperties.getPropertyy("browser");
        String url = ReadProperties.getPropertyy("url");

        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
//        if (browser.equalsIgnoreCase("chrome")){
//            WebDriverManager.chromedriver().setup();
//            ChromeOptions options = new ChromeOptions();
//            options.setExperimentalOption("debuggerAddress", "localhost:9222");
//            driver = new ChromeDriver(options);
//        }
        else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        driver.get(url);
    }
}
