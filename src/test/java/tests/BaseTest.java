package tests;

import allure.AllureScreenShooter;
import driver.Driver;
import io.qameta.allure.Description;
import loginPage.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import services.TestListener;

@Listeners({AllureScreenShooter.class, TestListener.class})
public class BaseTest {
    @BeforeTest(alwaysRun = true)
    @Description("Opening the browser")
    public void init() {
        Driver.getDriver();
    }

    @AfterTest(alwaysRun = true)
    @Description("Closing the browser")
    public void tearDown() {
        LoginPage.browserClose();
    }
}