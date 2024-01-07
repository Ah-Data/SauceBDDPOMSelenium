import Base.TestBase;
import Pages.LoginPage;
import Pages.Products;
import org.testng.annotations.BeforeTest;

public class TestCheckoutProduct extends TestBase {

    LoginTest login;
    ProductTest product;
    @BeforeTest
    void setUp() throws InterruptedException {
        initialization();
        login = new LoginTest();
        login.LoginWithValidCredentials();
        product.cartButton();
    }
}
