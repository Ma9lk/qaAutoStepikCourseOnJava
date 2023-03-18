package pages;


import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.Selenide;

import static locators.Locators.BasePageLocators.*;


public class BasePage {

    public BasePage openPage(String url) {
        Selenide.open(url);
        return this;
    }

    public BasePage goToLoginPage() {
        LOGIN_LINK.click();
        return this;
    }

    public void goToBasketPage() {
        BASKET_LINK.click();
    }

    public void shouldBeLoginLink() {
        LOGIN_LINK.shouldBe(exist);
    }

    public void shouldBeAuthorizedUser() {
        USER_ICON.shouldBe(exist);
    }
}
