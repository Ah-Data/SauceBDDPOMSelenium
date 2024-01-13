import Base.TestBase;
import Pages.CartCheckoutPage;
import Pages.LoginPage;
import Pages.Products;
import org.testng.Assert;
import org.testng.annotations.*;

@Test(groups = {"e2e","Checkout"})
public class TestCheckoutProduct extends TestBase {
    Products product;
    CartCheckoutPage cart;
    @BeforeTest
    void setUp() throws InterruptedException {
        initialization();
        login();
        product = new Products();
        cart = new CartCheckoutPage();
        product.clickAddToCart();

    }

    @Test
    public void verifyTheUserOnYourCartScreen() throws InterruptedException {

       product.clickCartButton();
       Assert.assertEquals(cart.orderListPage.getText(),"Your Cart");
       cart.checkOutProduct();

    }




    @AfterTest
    void close(){
        tearDown();
    }
}
