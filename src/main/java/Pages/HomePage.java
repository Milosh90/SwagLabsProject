package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;
    public By fotografijeNaPocetnojStrani= By.className("inventory_item_img");
    public By backPack= By.id("add-to-cart-sauce-labs-backpack");
    public By fleeceJacket= By.id("add-to-cart-sauce-labs-fleece-jacket");
    public By shoppingCart= By.id("shopping_cart_container");
    public By textRemoveButton= By.xpath("//*[text()='Remove']");
    public By twitterLink = By.xpath("//a[@href='https://twitter.com/saucelabs']");
    public By facebookLink = By.xpath("//a[@href='https://www.facebook.com/saucelabs']");
    public By linkedInLink = By.xpath("//a[@href='https://www.linkedin.com/company/sauce-labs/']");



    public HomePage(WebDriver driver){
        this.driver= driver;
    }
    public String getRemoveTextButton(){
        return driver.findElement(textRemoveButton).getText();
    }


    public boolean prisutnaJeFotografijaNaPocetnojStranici(){
       return driver.findElement(fotografijeNaPocetnojStrani).isDisplayed();

    }

   public boolean prisutnoJeDugmeAddToCart(){
    return driver.findElement(backPack).isDisplayed();
    }
    public boolean homePageElementsPresent(){
        if (driver.findElement(fotografijeNaPocetnojStrani).isDisplayed() && driver.findElement(backPack).isDisplayed()){
            return true;
    } else
            return false;
          }

    public void addingJacketInCart(){
        driver.findElement(fleeceJacket).click();
    }
    public void goToshoppingCart(){
        driver.findElement(shoppingCart).click();
    }
    public void addBackpack(){
        driver.findElement(backPack).click();
    }
    public void goOnTwitterPage(){
        driver.findElement(twitterLink).click();
    }
    public void goOnFacebookPage(){
        driver.findElement(facebookLink).click();
    }

    public void goOnLinkedInPage(){
        driver.findElement(linkedInLink).click();
    }
}

