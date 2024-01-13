package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class CartCheckoutPage extends TestBase {


    @FindBy(xpath = "//span[@class='title']")
    public WebElement orderListPage;

    @FindBy(className = "shopping_cart_badge")
    public WebElement badge;

    @FindBy(id = "continue-shopping")
    WebElement ContinueShopping;

    @FindBy(id = "checkout")
    WebElement Checkout;

    public CartCheckoutPage(){
        PageFactory.initElements(driver, this);
    }

    public void checkOutProduct(){
        Checkout.click();
    }

    public void backToProductList(){
        ContinueShopping.click();
    }


}
