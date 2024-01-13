import Base.TestBase;
import Pages.CartCheckoutPage;
import Pages.Products;
import Pages.YourInformation;
import org.testng.Assert;
import org.testng.annotations.*;

@Test(groups = {"e2e","Information"})
public class TestYourInformationPage extends TestBase {

    YourInformation info;
    Products product;
    CartCheckoutPage cart;

    @BeforeTest
    void setup(){
        initialization();
        login();
        product = new Products();
        info = new YourInformation();
        cart = new CartCheckoutPage();
        product.clickAddToCart();
        product.clickCartButton();
        cart.checkOutProduct();
    }

    @Test
    void validOrderData() throws InterruptedException {


        info.setFirstName(prop.getProperty("firstName"));
        info.setLastName(prop.getProperty("lastName"));
        info.setPostalCode(Integer.parseInt(prop.getProperty("zipCode")));
        info.clickYourInformation();
        Assert.assertEquals(cart.orderListPage.getText(),"Checkout: Overview");
        info.finsh_button.click();
        Assert.assertEquals(info.finish_Order.getText(),"Thank you for your order!");

    }


    @AfterTest
    void close(){
        tearDown();
    }
}
