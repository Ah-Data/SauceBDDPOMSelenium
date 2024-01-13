package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformation extends TestBase {

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(id = "continue")
    WebElement cotinue_button;

    @FindBy(id = "finish")
    public WebElement finsh_button;

    @FindBy(className = "complete-header")
    public WebElement finish_Order;

    public YourInformation(){
        PageFactory.initElements(driver,this);
    }

    public void setFirstName(String fname){
        firstName.clear();
        firstName.sendKeys(fname);
    }

    public void setLastName(String lname){
        lastName.clear();
        lastName.sendKeys(lname);
    }

    public void setPostalCode(int code){
        postalCode.clear();
        postalCode.sendKeys(String.valueOf(code));
    }

    public void clickYourInformation(){
        cotinue_button.click();
    }

}
