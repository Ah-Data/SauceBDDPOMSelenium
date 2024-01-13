package StepDefinitions;

import Base.TestBase;
import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginStepDefinition extends TestBase {

    private LoginPage login;

    @Given("User is on the login page")
    public void userIsOnLoginPage() {
        initialization();
        login = new LoginPage(driver);
    }

    @When("User enters valid username and password")
    public void userEntersValidCredentials() {
        login.enterUserName("validUsername");
        login.enterPassword("validPassword");
        login.clickLoginButton();
    }

    @When("User enters invalid username and password")
    public void userEntersInvalidCredentials() {
        login.enterUserName("validUsername");
        login.enterPassword("invalidPassword");
        login.clickLoginButton();
    }
    @When("User clicks the login button")
    public void userClicksLoginButton() {
        // Already implemented in the LoginTest class
    }

    @Then("User should be redirected to the Swag Labs home page")
    public void userIsRedirectedToHomePage() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
        tearDown();
    }

    @Then("User should see an error message")
    public void userSeesErrorMessage() {
        Assert.assertEquals(login.setErrorMessage(), "Expected Error Message");
        tearDown();
    }

}
