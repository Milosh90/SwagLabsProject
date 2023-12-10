package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LogInPage {
    //lokatori
    public WebDriver driver;
    public By userNameInputField=By.id("user-name");
    public By passwordInputField=By.id("password");
    public By logInButton=By.id("login-button");
    public By errorMessage=By.xpath("//*[text()='Epic sadface: Username and password do not match any user in this service']");
    public By errorMessageEmptyFields=By.xpath("//*[text()='Epic sadface: Username is required']");
    public By errorMessageEmptyPasswordField=By.xpath("//*[text()='Epic sadface: Password is required']");

    //parametarizovani konstruktor
    public LogInPage(WebDriver driver) {
        this.driver=driver;
    }

    //metode

    public void userNameVrednost(String username) {
        driver.findElement(userNameInputField).sendKeys(username);
    }
    public void passwordVrednost(String password){
        driver.findElement(passwordInputField).sendKeys(password);
    }
    public void dugmeZaLogovanje(){
        driver.findElement(logInButton).click();
    }
    public boolean nijeUspesnoLogovanje(){
        return driver.findElement(errorMessage).isDisplayed();
    }
    public boolean bezKredencijala(){
        return driver.findElement(errorMessageEmptyFields).isDisplayed();
    }
    public boolean bezPassword(){
        return driver.findElement(errorMessageEmptyPasswordField).isDisplayed();
    }

    public void uspesnoLogovanje(){
        driver.findElement(userNameInputField).sendKeys("standard_user");
        driver.findElement(passwordInputField).sendKeys("secret_sauce");
        driver.findElement(logInButton).click();
    }
}
