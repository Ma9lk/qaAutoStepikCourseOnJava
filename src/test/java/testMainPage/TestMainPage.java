package testMainPage;

import org.junit.Test;
import pages.BasePage;
import pages.BasketPage;
import pages.LoginPage;

import static Common.Config.*;


public class TestMainPage {

    protected BasePage basePage = new BasePage();
    protected LoginPage loginPage = new LoginPage();
    protected BasketPage basketPage = new BasketPage();

    @Test
    public void AtestGuestCanGoToLoginPage() {
        basePage
                .openPage(MAIN_LINK)
                .goToLoginPage();
        loginPage
                .shouldBeLoginPage();
    }

    @Test
    public void BtestGuestCantSeeProductInBasketOpenedFromMainPage() {
        basePage
                .openPage(MAIN_LINK)
                .goToBasketPage();
        basketPage
                .shouldBeEmptyBasket()
                .shouldBeTextThatBasketIsEmpty();
    }
}
