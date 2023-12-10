package AppTests;

import org.junit.Assert;
import org.junit.Test;

public class RemoveProductTest extends BaseTest{
    @Test
    public void removeProductFromCartSuccessfully() {
        logInPage.uspesnoLogovanje();
        homePage.addBackpack();
        homePage.addingJacketInCart();
        homePage.goToshoppingCart();
        System.out.println("Pre uklanjanja u korpi se nalazi ukupno " + shoppingCartPage.getNumberOfItemsInCart() + "proizvoda");
        shoppingCartPage.setRemoveButtonBackpack();
        System.out.println("Posle uklanjanja u korpi se nalazi ukupno " + shoppingCartPage.getNumberOfItemsInCart() + "proizvoda");
        Assert.assertFalse("Nije uklonjen proizvod iz korpe",shoppingCartPage.nameOfProductInCart().contains("Sauce Labs Backpack"));
    }
}
