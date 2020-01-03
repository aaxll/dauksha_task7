import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(css = "section.col-lg-9 input[name=\"email\"]")
    private WebElement loginEmail;

    @FindBy(css = "section.col-lg-9 input[name=\"password\"]")
    private WebElement loginPassword;

    @FindBy(css = "section.col-lg-9 div.col-sm-offset-2 button")
    private WebElement loginBtn;


    public LoginPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public LoginPage setLoginEmail (String value){
        loginEmail.sendKeys(value);
        return this;
    }

    public LoginPage setLoginPassword (String value){
        loginPassword.sendKeys(value);
        return this;
    }

    public LoginPage clickLoginBtn (){
        loginBtn.click();
        return new LoginPage(driver);
    }

    public LoginPage loginUser (String email, String password){
        this.setLoginEmail(email);
        this.setLoginPassword(password);
        this.clickLoginBtn();
        return new LoginPage(driver);
    }

}
