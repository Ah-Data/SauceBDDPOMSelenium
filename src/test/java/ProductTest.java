import Base.TestBase;
import Pages.LoginPage;
import Pages.Products;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.*;

public class ProductTest extends TestBase {
    LoginPage login;
    Products product;

    @BeforeTest
    void setup(){
        initialization();
        login = new LoginPage();
        product = new Products();
        login.enterUserName(prop.getProperty("username"));
        login.enterPassword(prop.getProperty("password"));
        login.clickLoginButton();
    }

    @Test
    void findProductTitle(){

        Assert.assertEquals(product.getProductName(),product.product_title);
    }

    @Test
    void findProductDescription(){
        Assert.assertEquals(product.getProductDescription(),product.getProduct_description);
    }

    @Test
    void findProductPrice(){

        Assert.assertEquals(product.getProductPrice(),product.product_price);
    }

    @Test(dependsOnMethods = {"findProductPrice"})
    public void addToCart() throws InterruptedException {
        product.clickAddToCart();
        Assert.assertTrue(product.remove.isDisplayed(),"Button not displayed");
    }
    @Test(dependsOnMethods = {"addToCart"})
    public void cartButton(){
        int cartCount = Integer.parseInt(product.cartButton.getText());
        Assert.assertTrue(cartCount>0,"No product in Cart.");
        product.clickCartButton();
    }

    @AfterTest
    void close(){
        tearDown();
    }
}
