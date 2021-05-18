package basketLocators;

import basePage.BasePage;
import io.qameta.allure.Step;

import static basketLocators.BasketLocators.*;


public class ProductAddition extends BasePage {
    private static final String BASKET_URL = "https://www.mirtrik.by/";

    public static void openBasket(){
        openPage(BASKET_URL);
    }
    @Step("Click the suits section")
    public static void sectionSuit(){
        clickButton(OPEN_THE_COSTUMES_SECTION);
    }
    @Step("Click on the item Sandyna Suit")
    public static void toCostumes(){ clickButton(CHOOSE_A_SUIT);
    }
    @Step("Click Size")
    public static void chooseSize(){
        clickButton(CHOOSE_SIZE);
    }
    @Step("Press 44")
    public static void addSize(){
        clickButton(SIZE_SELECTION);
    }
    @Step("Click the button to the shopping cart")
    public static void addCart(){
        clickButton(CLICK_TO_BASKET);
    }
    @Step ("Click to go to cart")
    public static void addCart2(){
        clickButton(CLICK_TO_BASKET2);
    }
    @Step ("Click on the select shipping and payment button")
    public static void Payment(){ clickButton(SHIPPING_AND_PAYMENT);
    }
}

