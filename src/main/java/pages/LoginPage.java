package pages;

import static com.codeborne.selenide.Condition.*;
import static locators.Locators.LoginPageLocators.*;


public class LoginPage extends BasePage {

    public void registerNewUser(String email, String password) {
        REGISTER_FORM_EMAIL.setValue(email);
        REGISTER_FORM_PASSWORD.setValue(password);
        REPEAT_REGISTER_FORM_PASSWORD.setValue(password);
        REGISTRATION_BUTTON.click();
    }

    public void shouldBeLoginPage() {
        shouldBeLoginForm();
        shouldBeRegisterForm();
    }

    public void shouldBeLoginForm() {
        LOGIN_FORM.should(visible);
    }

    public void shouldBeRegisterForm() {
        REGISTER_FORM.should(visible);
    }
}
