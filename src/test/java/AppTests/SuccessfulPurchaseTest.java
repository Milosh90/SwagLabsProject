package AppTests;

import Pages.CheckoutBuyersInformationsPage;
import Pages.CheckoutCompletePage;
import Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class SuccessfulPurchaseTest extends BaseTest {
    @Test
    public void uspesnaKupovina() throws InterruptedException {
        logInPage.uspesnoLogovanje();
        homePage.addBackpack();
        Thread.sleep(3000);
        String expectedResult="Remove";
        String actualResult= homePage.getRemoveTextButton();
        System.out.println(actualResult);
        Assert.assertTrue("nije se pojavilo dugme return", expectedResult.equals(actualResult));
        homePage.goToshoppingCart();
        Thread.sleep(3000);
        Assert.assertTrue("Dodavanje u korpu nije uspesno ", shoppingCartPage.successfullyOpenedCart());
        shoppingCartPage.goToCheckoutPage();
        Thread.sleep(3000);
        String urlOfCheckoutBuyersPage=driver.getCurrentUrl();
        System.out.println(urlOfCheckoutBuyersPage);
        Assert.assertTrue("Nismo na dobroj stranici", buyersInfosPage.checkoutTextIsVisible());
        buyersInfosPage.correctBuyersInfo();
        Thread.sleep(3000);
        Assert.assertTrue("Nismo na dobroj stranici", overviewPage.textOnTheOverviewPage());
        overviewPage.finishShopping();
        Thread.sleep(3000);
        Assert.assertTrue("Kupovina nije uspesna", completePage.uspesnaKupovina());
    }
}
