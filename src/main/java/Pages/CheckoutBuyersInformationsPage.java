package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutBuyersInformationsPage {
    public WebDriver driver;
    public By checkoutText=By.xpath("//*[text()='Checkout: Your Information']");
    public By firstNameInputField = By.id("first-name");
    public By lastNameInputField = By.id("last-name");
    public By zipPostalcodeInputField = By.id("postal-code");
    public By cancelButton=By.id("cancel");
    public By continueButton=By.id("continue");

    public CheckoutBuyersInformationsPage(WebDriver driver) {
        this.driver=driver;
    }
    public boolean checkoutTextIsVisible(){
        return driver.findElement(checkoutText).isDisplayed();
    }
    public void nameValue(String name){
        driver.findElement(firstNameInputField).sendKeys(name);
    }
    public void lastNameValue(String lastName){
        driver.findElement(lastNameInputField).sendKeys(lastName);
    }
    public void zipPostalCodeValue(String zip){
        driver.findElement(zipPostalcodeInputField).sendKeys(zip);
    }
    public void goToCheckoutCompletePage(){
        driver.findElement(continueButton).click();
    }
    public void goBackOnShoppingCartPage(){
        driver.findElement(cancelButton).click();
    }
    public void correctBuyersInfo() throws InterruptedException {
        driver.findElement(firstNameInputField).sendKeys("Pera");
        driver.findElement(lastNameInputField).sendKeys("Peric");
        driver.findElement(zipPostalcodeInputField).sendKeys("11000");
        driver.findElement(continueButton).click();

    }


}
