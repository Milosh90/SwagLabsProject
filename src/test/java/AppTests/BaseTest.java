package AppTests;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new  ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void afterClass() throws Exception {
        driver.quit();

    }

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");

    }

    LogInPage logInPage=new LogInPage(driver);
    HomePage homePage = new HomePage(driver);
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
    CheckoutBuyersInformationsPage buyersInfosPage=new CheckoutBuyersInformationsPage(driver);
    CheckoutOverviewPage overviewPage=new CheckoutOverviewPage(driver);
    CheckoutCompletePage completePage=new CheckoutCompletePage(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;





}
