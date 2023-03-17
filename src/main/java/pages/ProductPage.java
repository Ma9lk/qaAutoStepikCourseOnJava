package pages;

import static com.codeborne.selenide.Condition.*;
import static locators.Locators.ProductPageLocators.*;

public class ProductPage extends BasePage {

    public void shouldBeAddToBasket() {
        ADD_TO_BASKET.click();
    }

    public String shouldBeNameOfBook() {
        return NAME_OF_BOOK.text();
    }

    public void shouldNotBeSuccessMessage() {
        SUCCESS_MESSAGE.shouldNotBe(exist);
    }

    public String shouldBeSuccessMessage() {
        return SUCCESS_MESSAGE.text();
    }

    public void shouldBeDisappearedSuccessMessage() {
        SUCCESS_MESSAGE.should(disappear);
    }

    public String shouldBeProductPrice() {
        return PRODUCT_PRICE.text();
    }

    public String shouldBeProductPriceInBasket() {
       return PRODUCT_PRICE_IN_BASKET_MESSAGE.text();
    }
}
