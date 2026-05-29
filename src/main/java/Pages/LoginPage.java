package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String userName) {
        driver.findElement(username).sendKeys(userName);
    }

    public void enterPassword(String passWord) {
        driver.findElement(password).sendKeys(passWord);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}