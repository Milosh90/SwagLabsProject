package AppTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;



public class TotalPriceTest extends BaseTest {
    @Test
    public void totalPrice() {
        logInPage.uspesnoLogovanje();
        homePage.addBackpack();
        homePage.addingJacketInCart();
        homePage.goToshoppingCart();

        //for each
        List<WebElement> itemPriceElements = driver.findElements(By.className("inventory_item_price"));

        double totalPrice = 0;
        for (WebElement itemPriceElement : itemPriceElements) {
            String itemPriceText = itemPriceElement.getText();
            double itemPrice = Double.parseDouble(itemPriceText.replaceAll("[^0-9.]", ""));
            totalPrice += itemPrice;
        }
        System.out.println("Total Price with Taxes: $" + totalPrice);

        double actualTotalPriceOnPageWithoutTaxes = 79.98;
        double delta = 0.001;

        Assert.assertEquals("Ocekivani iznos nije jednak realnom iznosu ", actualTotalPriceOnPageWithoutTaxes , totalPrice, delta);




        }
    }

