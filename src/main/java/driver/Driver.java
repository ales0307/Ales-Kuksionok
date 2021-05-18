package driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Driver {
    private final static Logger LOG = LogManager.getRootLogger();
    private static WebDriver driver;

    public Driver() {
    }

    public static WebDriver getDriver() {
        return (driver == null) ? initDriver() : driver;
    }

    private static WebDriver initDriver() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        LOG.info("Driver initialization");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        return driver;
    }
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
            LOG.info("close driver");
        }
    }
}

