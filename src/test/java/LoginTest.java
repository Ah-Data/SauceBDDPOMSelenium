import Base.TestBase;
import Pages.LoginPage;
import Pages.Products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends TestBase{

        LoginPage loginPage = new LoginPage();;
    @BeforeTest
    void setUp(){
        initialization();
    }

    @Test(priority = 1)
    public void LoginWithValidCredentials(){

        loginPage.enterUserName(prop.getProperty("username"));
        loginPage.enterPassword(prop.getProperty("password"));
        loginPage.clickLoginButton();
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
    }

    @Test(priority = 2)
    public void LoginWithInValidCredentials(){

        loginPage.enterUserName(prop.getProperty("username"));
        loginPage.enterPassword(prop.getProperty("password"));
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.setErrorMessage(),"Epic sadface: Username and password do not match any user in this service");
    }

    @AfterTest
    public void closeSetup(){

        tearDown();
    }
}
