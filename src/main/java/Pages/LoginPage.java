package Pages;

import Base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage extends TestBase {

    //Page Locators
    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement passWord;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement errorMessage;

    public String titleLoginPage(){
        return driver.getTitle();
    }

    public LoginPage(){

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
