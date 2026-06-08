package tests;

import base.BaseTest;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() throws InterruptedException{

        LoginPage loginPage = new LoginPage(driver);

        String username="standard_user";
        String password="secret_sauce";

        Thread.sleep(3000);
        loginPage.enterUsername(username);
        //loginPage.enterUsername(username); // Wrong user_name
        System.out.println("Enter UserName "+ username);


        Thread.sleep(3000);
        loginPage.enterPassword(password);
        //loginPage.enterPassword(password); // Wrong Password
        System.out.println("Enter Password "+password);


        Thread.sleep(3000);
        loginPage.clickLogin();

        String actualTitle = driver.getTitle();
        System.out.println("Title: " + actualTitle);

        Assert.assertEquals(actualTitle, "Swag Labs", "Login Failed!");
    }
}