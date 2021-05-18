package loginPage;

import basePage.BasePage;
import io.qameta.allure.Step;

public class LoginPage extends BasePage {

    private static final String LOGIN_PAGE_URL = "https://www.mirtrik.by/user/login-or-registration?destination=";


    public static void openLoginPage() {
        openPage(LOGIN_PAGE_URL);
    }

    @Step("Entering e-mail")
    public static void insertUserName(String text){ input(loginPage.LoginPageLocators.USERNAME_INPUT, text ); }
    @Step("Entering password")
    public static void insertUserPassword(String text) { input(loginPage.LoginPageLocators.PASSWORD_INPUT, text); }
    @Step("click the enter button")
    public static void clickSignInButton() { clickButton(loginPage.LoginPageLocators.SIGN_IN_BUTTON); }
    @Step("The user logged in to his personal account")
    public static boolean comparingTitleLoginPage(String text) {
        return comparingPageTitles(text);
    }

    @Step("Closing the browser")
    public static void browserClose() {
        closeBrowser();
    }

    public static void clickOpen() {
    }
}

