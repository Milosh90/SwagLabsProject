package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {
    public WebDriver driver;
    public By finishButton=By.id("finish");
    public By cancelButton=By.id("cancel");
    public By paymentInformationText=By.xpath("//*[text()='Payment Information']");
    public By shippingInformationText=By.xpath("//*[text()='Shipping Information']");
    public By priceTotalText=By.xpath("//*[text()='Price Total']");
    public CheckoutOverviewPage(WebDriver driver) {
        this.driver=driver;
    }

    public boolean textOnTheOverviewPage(){
        if (driver.findElement(priceTotalText).isDisplayed() && driver.findElement(paymentInformationText).isDisplayed() && driver.findElement(shippingInformationText).isDisplayed()){
            return true;
        } else
            return false;
    }
    public void clickOnCancelButon(){
        driver.findElement(cancelButton).click();
    }
    public void finishShopping(){
        driver.findElement(finishButton).click();
    }


}
