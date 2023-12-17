package practiceqaglobant.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import practiceqaglobant.pages.LoginPage;
import practiceqaglobant.utils.Driver;

public class BaseTest {
    Driver driver;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser", "url"})
    public void setup(String browser, String url) {
        driver = new Driver(browser);
        driver.getDriver().manage().window().maximize();
        navigateTo(url);
    }

    public void navigateTo(String url) {
        driver.getDriver().get(url);
    }

    public LoginPage getLoginPage() {
        return new LoginPage(driver.getDriver());
    }

    @AfterMethod()
    public void tearDown() {
        driver.getDriver().close();
    }
}