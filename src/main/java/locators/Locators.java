package locators;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class Locators {
    public static class BasePageLocators {
        public static final SelenideElement LOGIN_LINK = $("#login_link");
        public static final SelenideElement LOGIN_LINK_INVALID = $("#login_link_inc");
        public static final SelenideElement BASKET_LINK = $(".btn-group");
        public static final SelenideElement USER_ICON = $(".icon-user");
}

    public static class LoginPageLocators {
        public static final SelenideElement LOGIN_FORM = $("#login_form");
        public static final SelenideElement LOGIN_FORM_EMAIL = $("#id_login-username");
        public static final SelenideElement LOGIN_FORM_PASSWORD = $("#id_login-password");
        public static final SelenideElement REGISTER_FORM = $("#register_form");
        public static final SelenideElement REGISTER_FORM_EMAIL = $("#id_registration-email");
        public static final SelenideElement REGISTER_FORM_PASSWORD = $("#id_registration-password1");
        public static final SelenideElement REPEAT_REGISTER_FORM_PASSWORD = $("#id_registration-password2");
        public static final SelenideElement REGISTRATION_BUTTON = $("[value=\"Register\"]");
    }

        public static class ProductPageLocators {
            public static final SelenideElement ADD_TO_BASKET = $(".btn-add-to-basket");
            public static final SelenideElement NAME_OF_BOOK = $(".product_main h1");
            public static final SelenideElement SUCCESS_MESSAGE = $(".alert-success:first-child strong");
            public static final SelenideElement PRODUCT_PRICE = $(".product_main > .price_color");
            public static final SelenideElement PRODUCT_PRICE_IN_BASKET_MESSAGE = $(".alert-info strong");
        }

        public static class BasketPageLocators {
            public static final SelenideElement NOT_EMPTY_BASKET = $(".basket-items");
            public static final SelenideElement TEXT_ABOUT_EMPTY_BASKET = $("#content_inner > p");
        }
}
