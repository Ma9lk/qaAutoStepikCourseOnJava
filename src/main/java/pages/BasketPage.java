package pages;

import static com.codeborne.selenide.Condition.*;


import static locators.Locators.BasketPageLocators.*;

public class BasketPage extends BasePage {

    public void shouldBeEmptyBasket() {
        NOT_EMPTY_BASKET.shouldNotBe(exist);
    }

    public void shouldBeNotEmptyBasket() {
        NOT_EMPTY_BASKET.shouldBe(exist);
    }

    public void shouldBeTextThatBasketIsEmpty() {
        TEXT_ABOUT_EMPTY_BASKET.shouldBe(exist);
    }
}
