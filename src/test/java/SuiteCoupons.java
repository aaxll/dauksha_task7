import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Suite.class)
@SuiteClasses({
        LoginPageTest.class,
        NewCouponTest.class
})

public class SuiteCoupons {
/*    protected static WebDriver driver;
    protected static LoginPage loginPage;

    @ClassRule
    public static ExternalResource driverRule = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            System.out.println("Starting a browser");
            System.setProperty("webdriver.chrome.driver", "C:/testing/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
            loginPage = new LoginPage(driver);
            driver.get("http://open-eshop.stqa.ru/oc-panel/auth/login/");
        };

        @Override
        protected void after() {
            System.out.println("Stopping the browser");
            if (driver != null) {
                driver.quit();
            }
        };
    };*/

}
