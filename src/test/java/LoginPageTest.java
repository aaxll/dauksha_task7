import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest extends TestBase {

/*    protected static WebDriver driver;
    protected static LoginPage loginPage;


    @BeforeClass
    public static void setUp() {
        System.out.println("Starting a browser");
        System.setProperty("webdriver.chrome.driver", "C:/testing/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Stopping the browser");
        if (driver != null) {
            driver.quit();
        }
    }*/

    @BeforeClass
    public static void setUp() {
        System.out.println("Starting a browser");
        System.setProperty("webdriver.chrome.driver", "C:/testing/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        adminPage = new AdminPage(driver);
        driver.get("http://open-eshop.stqa.ru/oc-panel/auth/login/");
        driver.manage().window().maximize();
    }


    @Test
    public void loginUserTest() {
        loginPage.loginUser("demo@open-eshop.com", "demo");
    }



}
