package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCartPage {
    public WebDriver driver;
    public By checkoutButton = By.id("checkout");
    public By removeButtonBackpack=By.id("remove-sauce-labs-backpack");
    public By continueShoppingButton= By.id("continue-shopping");
    public By shoppingCartNumberOfItems=By.className("shopping_cart_badge");
    public By cartPageContainsProduct=By.className("inventory_item_name");
    public By cartPageYourCartText=By.xpath("//*[text()='Your Cart']");


    public ShoppingCartPage(WebDriver driver) {
        this.driver=driver;
    }
    public String nameOfProductInCart(){
        return driver.findElement(cartPageContainsProduct).getText();
    }
    public String getNumberOfItemsInCart(){
        return driver.findElement(shoppingCartNumberOfItems).getText();
    }

    public boolean successfullyOpenedCart(){
        if (driver.findElement(cartPageYourCartText).isDisplayed() && driver.findElement(cartPageContainsProduct).isDisplayed()){
            return true;
        } else
            return false;
    }

    public void goToCheckoutPage(){
        driver.findElement(checkoutButton).click();
    }
    public void setRemoveButtonBackpack(){
        driver.findElement(removeButtonBackpack).click();
    }


}
