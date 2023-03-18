package pages;

import static com.codeborne.selenide.Condition.*;


import static locators.Locators.BasketPageLocators.*;

public class BasketPage extends BasePage {

    public BasketPage shouldBeEmptyBasket() {
        NOT_EMPTY_BASKET.shouldNotBe(exist);
        return this;
    }

    public BasketPage shouldBeNotEmptyBasket() {
        NOT_EMPTY_BASKET.shouldBe(exist);
        return this;
    }

    public BasketPage shouldBeTextThatBasketIsEmpty() {
        TEXT_ABOUT_EMPTY_BASKET.shouldBe(exist);
        return this;
    }
}
