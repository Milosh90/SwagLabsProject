package AppTests;

import AppTests.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class LogInTest extends BaseTest {
    @Test
    public void SuccesfulLogin() {
        logInPage.uspesnoLogovanje();
        Assert.assertTrue("logovanje nije bilo uspesno", homePage.prisutnaJeFotografijaNaPocetnojStranici());
        Assert.assertTrue("Logovanje nije bilo uspesno", homePage.prisutnoJeDugmeAddToCart());
        Assert.assertTrue("Neuspesno logovanje ", homePage.homePageElementsPresent());
    }

    @Test
    public void validUsernameInvalidPassword(){
        logInPage.userNameVrednost("standard_user");
        logInPage.passwordVrednost("13251");
        logInPage.dugmeZaLogovanje();
        Assert.assertTrue("Nije se pojavila ERROR poruka", logInPage.nijeUspesnoLogovanje());
    }

    @Test
    public void invalidUsernameValidPassword(){
        logInPage.userNameVrednost("qwdasdas");
        logInPage.passwordVrednost("secret_sauce");
        logInPage.dugmeZaLogovanje();
        Assert.assertTrue("Nije se pojavila ERROR poruka", logInPage.nijeUspesnoLogovanje());
    }

    @Test
    public void invalidUsernameInvaldPassword() {
        logInPage.userNameVrednost("notvalid");
        logInPage.passwordVrednost("notvalid");
        logInPage.dugmeZaLogovanje();
        Assert.assertTrue("Nije se pojavila ERROR poruka", logInPage.nijeUspesnoLogovanje());
    }


    @Test
    public void emptyInputFields() throws InterruptedException {
        logInPage.userNameVrednost("");
        logInPage.passwordVrednost("");
        logInPage.dugmeZaLogovanje();
        Thread.sleep(3000);
        Assert.assertTrue("Nije se pojavila ERROR poruka", logInPage.bezKredencijala());
    }

    @Test
    public void inputCapitalLetterInUsername() {
        logInPage.userNameVrednost("Standard_user");
        logInPage.passwordVrednost("secret_sauce");
        logInPage.dugmeZaLogovanje();
        Assert.assertTrue("Nije se pojavila ERROR poruka", logInPage.nijeUspesnoLogovanje());
    }

    @Test
    public void inputCapitalLetterInPassword() {
            logInPage.userNameVrednost("standard_user");
            logInPage.passwordVrednost("Secret_sauce");
            logInPage.dugmeZaLogovanje();
            Assert.assertTrue("Nije se pojavila ERROR poruka", logInPage.nijeUspesnoLogovanje());
    }

    @Test
    public void inputOnlyUsername() {
        logInPage.userNameVrednost("standard_user");
        logInPage.passwordVrednost("");
        logInPage.dugmeZaLogovanje();
        Assert.assertTrue("Nije se pojavila ERROR poruka", logInPage.bezPassword());
    }

    @Test
    public void inputOnlyPassword() {
        logInPage.userNameVrednost("");
        logInPage.passwordVrednost("secret_sauce");
        logInPage.dugmeZaLogovanje();
        Assert.assertTrue("Nije se pojavila ERROR poruka", logInPage.bezKredencijala());

    }
}
