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

        LoginPage loginPage;
    @BeforeMethod
    void setUp(){
        initialization();
        loginPage= new LoginPage();
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
        loginPage.enterPassword(prop.getProperty("inValidPassword"));
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.setErrorMessage(), loginPage.expectedErrorMessage);
    }

    @AfterMethod
    public void closeSetup(){

        tearDown();
    }
}
