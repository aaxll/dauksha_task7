import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;

public class NewCouponTest extends TestBase {

    @Test
    public void addNewCouponTest(){
        adminPage.addNewCoupon("coupon453456","2020-01-03","3");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Stopping the browser");
        if (driver != null) {
            driver.quit();
        }
    }
}
