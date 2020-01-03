import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {


    protected static WebDriver driver;
    protected static LoginPage loginPage;
    protected static AdminPage adminPage;


/*    @BeforeClass
    public static void setUp() {
        System.out.println("Starting a browser");
        System.setProperty("webdriver.chrome.driver", "C:/testing/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        adminPage = new AdminPage(driver);
        driver.get("http://open-eshop.stqa.ru/oc-panel/auth/login/");
    }*/

/*    @AfterClass
    public static void tearDown() {
        System.out.println("Stopping the browser");
        if (driver != null) {
            driver.quit();
        }
    }*/
}
