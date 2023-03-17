package testProductPage;


import org.junit.Test;
import pages.BasePage;
import pages.BasketPage;

import static Common.Config.PRODUCT_LINK;


public class TestProductPage {
    protected BasePage basePage = new BasePage();
    protected BasketPage basketPage = new BasketPage();


    @Test
    public void Dtest3GuestCanGoToLoginPageFromProductPage() {
        basePage.openPage(PRODUCT_LINK);
        basePage.goToLoginPage();
    }

    @Test
    public void Ftest4GuestCantSeeProductInBasketOpenedFromProductPage() {
        basePage.openPage(PRODUCT_LINK);
        basePage.goToBasketPage();
        basketPage.shouldBeEmptyBasket();
        basketPage.shouldBeTextThatBasketIsEmpty();
    }
}
