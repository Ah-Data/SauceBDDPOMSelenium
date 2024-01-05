package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Products extends TestBase {

    @FindBy(id = "item_4_title_link")
    WebElement itemNameLink;

    @FindBy(className = "inventory_item_desc")
    WebElement itemDescription;

    @FindBy(className = "inventory_item_price")
    WebElement itemPrice;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton;

    public Products(){
        PageFactory.initElements(driver,this);
    }

    // Get the name of the product
    public String getProductName() {
        return itemNameLink.getText();
    }

    // Get the description of the product
    public String getProductDescription() {
        return itemDescription.getText();
    }

    // Get the price of the product
    public String getProductPrice() {
        return itemPrice.getText();
    }

    //Adding to cart
    public void clickAddToCart() {
        addToCartButton.click();
    }
}
