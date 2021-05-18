package basePage;
import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    private final static Logger LOG = LogManager.getRootLogger();

    protected static void openPage(String pageURL) {
        Driver.getDriver().get(pageURL);
    }

    protected static WebElement initElement(By by){
        return Driver.getDriver().findElement(by);
    }
    protected static Boolean comparingPageTitles(String text) {
        String title = Driver.getDriver().getTitle();
        if (title.equalsIgnoreCase(text)) return true;
        else return false;
    }

    protected static void input(By element, String text){
        initElement(element).sendKeys(text);
    }
    protected static void clickButton(By element){
        initElement(element).click();
    }
    protected static void closeBrowser() {
        Driver.closeDriver();
        LOG.info("close browser");

    }






}
