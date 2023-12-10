package AppTests;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Set;

public class FooterLinksTest extends BaseTest{
    @Test
    public void twiterTab() throws InterruptedException {
        logInPage.uspesnoLogovanje();
        js.executeScript("window.scrollBy(0,10000)");
        homePage.goOnTwitterPage();
        Thread.sleep(3000);
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        String expectedURL="https://twitter.com/saucelabs";
        String actualURL=driver.getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertTrue("Nije otvoren Twitter tab", expectedURL.equals(actualURL));
        driver.close();
        driver.switchTo().window(newTab.get(0));
        Assert.assertTrue("Homepage nije ucitan", homePage.homePageElementsPresent());
        String homePageUrl="https://www.saucedemo.com/inventory.html";
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue("Nismo na pocetnoj strani", driver.getCurrentUrl().equals(homePageUrl));
    
    }

    @Test
    public void facebookTab() throws InterruptedException {
        logInPage.uspesnoLogovanje();
        js.executeScript("window.scrollBy(0,10000)");
        homePage.goOnFacebookPage();
        Thread.sleep(3000);
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        String expectedURl="https://www.facebook.com/saucelabs";
        String actualURL=driver.getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertTrue("Nije otvoren Twitter tab", expectedURl.equals(actualURL));
        driver.close();
        driver.switchTo().window(newTab.get(0));
        Assert.assertTrue("Homepage nije ucitan", homePage.homePageElementsPresent());
        String homePageUrl="https://www.saucedemo.com/inventory.html";
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue("Nismo na pocetnoj strani", driver.getCurrentUrl().equals(homePageUrl));

    }

    @Test
    public void linkedInTab() throws InterruptedException {
        logInPage.uspesnoLogovanje();
        js.executeScript("window.scrollBy(0,10000)");
        homePage.goOnLinkedInPage();
        Thread.sleep(3000);
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        String expectedURl="https://www.linkedin.com/company/sauce-labs/";
        String actualURL=driver.getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertTrue("Nije otvoren linkedIn tab", expectedURl.equals(actualURL));
        driver.close();
        driver.switchTo().window(newTab.get(0));
        Assert.assertTrue("Homepage nije ucitan", homePage.homePageElementsPresent());
        String homePageUrl="https://www.saucedemo.com/inventory.html";
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue("Nismo na pocetnoj strani", driver.getCurrentUrl().equals(homePageUrl));
    }
}
