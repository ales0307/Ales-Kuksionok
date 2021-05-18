package tests;

import basketLocators.ProductAddition;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasketTest extends BaseTest {
    @BeforeTest
    void initDriver(){
        ProductAddition.openBasket();

    }
    @Test(priority = 7)
    @Description("add an item to cart")
    public void BasketTest(){
        ProductAddition.sectionSuit();
        ProductAddition.toCostumes();
        ProductAddition.chooseSize();
        ProductAddition.addSize();
        ProductAddition.addCart();
        ProductAddition.addCart2();
        ProductAddition.Payment();
    }
}
