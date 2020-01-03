import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {
    private WebDriver driver;

    @FindBy(css = "a[href=\"#collapseOne\"]")
    private WebElement eShopAccordion;

    @FindBy(css = "a[title=\"Coupons\"]")
    private WebElement couponsAccordion;

    @FindBy(css = "a[href=\"http://open-eshop.stqa.ru/oc-panel/Coupon/create\"]")
    private WebElement newCouponBtn;

    @FindBy(css = "input[name=\"name\"]")
    private WebElement couponName;

    @FindBy(css = "input[name=\"valid_date\"]")
    private WebElement validDate;

    @FindBy(css = "input[name=\"number_coupons\"]")
    private WebElement numberOfCoupons;

    @FindBy(css = "button[name=\"submit\"]")
    private WebElement submitNewCouponBtn;

    public AdminPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public AdminPage clickEShopBtn (){
        eShopAccordion.click();
        return new AdminPage(driver);
    }

    public AdminPage clickCouponsBtn (){
        couponsAccordion.click();
        return new AdminPage(driver);
    }

    public AdminPage clickNewCouponBtn (){
        newCouponBtn.click();
        return new AdminPage(driver);
    }

    public AdminPage clickSubmitNewCouponBtn (){
        submitNewCouponBtn.click();
        return new AdminPage(driver);
    }

    public AdminPage setCouponName (String value){
        couponName.sendKeys(value);
        return this;
    }

    public AdminPage setValidDate (String value){
        validDate.clear();
        validDate.sendKeys(value);
        return this;
    }

    public AdminPage setNumberOfCoupons (String value){
        numberOfCoupons.clear();
        numberOfCoupons.sendKeys(value);
        return this;
    }

    public AdminPage addNewCoupon (String name, String date, String count){
        this.clickEShopBtn();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(couponsAccordion));
        this.clickCouponsBtn();
        wait.until(ExpectedConditions.elementToBeClickable(newCouponBtn));
        this.clickNewCouponBtn();
        this.setCouponName(name);
        this.setValidDate(date);
        this.setNumberOfCoupons(count);
        this.clickSubmitNewCouponBtn();
        return new AdminPage(driver);

    }


}
