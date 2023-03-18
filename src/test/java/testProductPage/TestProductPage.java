package testProductPage;


import org.junit.Test;
import pages.BasePage;
import pages.BasketPage;
import pages.LoginPage;

import static Common.Config.*;


public class TestProductPage {
    protected BasePage basePage = new BasePage();
    protected BasketPage basketPage = new BasketPage();
    protected LoginPage loginPage = new LoginPage();


    @Test
    public void Dtest3GuestCanGoToLoginPageFromProductPage() {
        basePage
                .openPage(PRODUCT_LINK)
                .goToLoginPage();
    }

    @Test
    public void registerNewUerFromProductPage() {
        basePage
                .openPage(PRODUCT_LINK)
                .goToLoginPage();
        loginPage
                .registerNewUser(EMAIL, PASSWORD);
    }
}
