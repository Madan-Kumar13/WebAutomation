package tests;

import base.BaseTest;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() throws InterruptedException{

        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(3000);
        loginPage.enterUsername("standard_user");
        Thread.sleep(3000);
        loginPage.enterPassword("secret_sauce");
        Thread.sleep(3000);
        loginPage.clickLogin();

        String actualTitle = driver.getTitle();
        System.out.println("Title: " + actualTitle);

        Assert.assertEquals(actualTitle, "Swag Labs", "Login Failed!");
    }
}