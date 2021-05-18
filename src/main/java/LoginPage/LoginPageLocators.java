package loginPage;
import org.openqa.selenium.By;

public class LoginPageLocators {

    final static By USERNAME_INPUT =  By.xpath("//*[@id=\"login_emailOrPhone\"]");
    final static By PASSWORD_INPUT =  By.xpath("//*[@id=\"login_pass\"]");
    final static By SIGN_IN_BUTTON =  By.xpath("//*[@id=\"wrapper\"]/main/div/div/div[1]/div/form/button");

}

