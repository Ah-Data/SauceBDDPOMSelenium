package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends TestBase {

    //Page Locators
    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement passWord;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errorMessage;

    public static String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";

    public String titleLoginPage(){
        return driver.getTitle();
    }

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterUserName(String name) {
        userName.clear();
        userName.sendKeys(name);
    }

    public void enterPassword(String password) {
        passWord.clear();
        passWord.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public String setErrorMessage(){
        return errorMessage.getText();
    }
}
