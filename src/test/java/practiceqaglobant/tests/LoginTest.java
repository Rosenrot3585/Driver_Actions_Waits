package practiceqaglobant.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import practiceqaglobant.pages.*;

public class LoginTest extends BaseTest{
    
    
    @Test
    @Parameters({"username", "password"})
    public void loginImplicitWait(String username, String password) {
        LoginPage loginPage = getLoginPage();
        ProductsPage productsPage = loginPage.login(username, password);
        assertTrue(productsPage.getDriver().getCurrentUrl().contains("inventory.html"));
    }

//Fix the following test
    @Test
    @Parameters({"username", "password"})
    public void loginExplicitWait(String username, String password) {
        LoginPage loginPage = getLoginPage();
        ProductsPage productsPage = loginPage.login(username, password);
        assertTrue(productsPage.getDriver().getCurrentUrl().contains("inventory.html"));
    }


    //Fix the following test
    @Test
    @Parameters({"username", "password"})
    public void loginFluentWait(String username, String password) {
        LoginPage loginPage = getLoginPage();
        ProductsPage productsPage = loginPage.login(username, password);
        assertTrue(productsPage.getDriver().getCurrentUrl().contains("inventory.html"));
    }
}
