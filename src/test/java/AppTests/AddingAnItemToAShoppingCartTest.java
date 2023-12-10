package AppTests;

import org.junit.Assert;
import org.junit.Test;

public class AddingAnItemToAShoppingCartTest extends BaseTest{
    @Test
    public void addingAnItemToACart() {
        logInPage.uspesnoLogovanje();
        homePage.addBackpack();
        homePage.goToshoppingCart();

        String actualResult=shoppingCartPage.getNumberOfItemsInCart();
        System.out.println(actualResult);
        Assert.assertTrue("Nema proizvoda u korpi", actualResult.contains("1"));


        String productNameInCart=shoppingCartPage.nameOfProductInCart();
        System.out.println(productNameInCart);
        Assert.assertTrue("Ranac nije u korpi", productNameInCart.contains("Sauce Labs Backpack"));

    }
}
