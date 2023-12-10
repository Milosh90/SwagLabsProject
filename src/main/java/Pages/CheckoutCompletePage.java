package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {
    public WebDriver driver;
    public By backHomeButton = By.id("back-to-products");
    public By successfulOrderText = By.xpath("//*[text()='Thank you for your order!']");
    public By orderConfirmationText = By.xpath("//*[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']");
    public By checkoutCompleteText = By.xpath("//*[text()='Checkout: Complete!']");
    public CheckoutCompletePage(WebDriver driver) {
        this.driver=driver;
    }

    public boolean uspesnaKupovina(){
        if (driver.findElement(successfulOrderText).isDisplayed() && driver.findElement(orderConfirmationText).isDisplayed()&& driver.findElement(checkoutCompleteText).isDisplayed()){
            return true;
        } else
            return false;
    }
public void goBackOnHomePage(){
        driver.findElement(backHomeButton).click();
}
}
