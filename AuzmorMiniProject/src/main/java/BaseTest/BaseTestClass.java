package BaseTest;
import java.lang.String;
import Utilities.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.time.Duration;

// Base class for test classes to initialize WebDriver and open a browser
public class BaseTestClass {
    // WebDriver instance shared across test cases
    public static WebDriver driver;
    public static String question;
    public static String option1;
    public static String option2;
    public static String minimumQuestion;

    // Method to open a browser and navigate to the specified URL
    public void initializeWebDriverAndOpenBrowser() throws Exception {
        // Reading browser and URL from configuration properties
        String browser = ReadProperties.getPropertyy("browser");
        String url = ReadProperties.getPropertyy("url");
        question = ReadProperties.getPropertyy("question");
        option1 = ReadProperties.getPropertyy("option1");
        option2 = ReadProperties.getPropertyy("option2");
        minimumQuestion = ReadProperties.getPropertyy("minimumQuestion");
        // Initializing WebDriver based on the specified browser
        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }
        else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        // Setting implicit wait and maximizing the browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        // Navigating to the specified URL
        driver.get(url);
    }
}
