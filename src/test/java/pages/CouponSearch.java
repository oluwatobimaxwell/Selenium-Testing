package pages;

import org.bet9jasite.testing.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CouponSearch extends BasePage {

    String couponCode;
    @FindBy(id = "h_w_PC_ctl06_txtCodiceCoupon")
    WebElement couponInput;

    @FindBy(id = "h_w_PC_ctl06_lnkCheckCoupon")
    WebElement searchCouponButton;

    public CouponSearch(String couponCode){
        this.couponCode = couponCode;
        PageFactory.initElements(driver, this);
    }

    public void searchCoupon(){
        couponInput.sendKeys(couponCode);
        searchCouponButton.click();
    }

    public boolean doesCouponExist(){
        driver.switchTo().frame("iframeCC");
        WebElement resultCouponElement = waitForElement("//*[contains(text(),'"+couponCode+"')]");
        boolean isDisplayed = resultCouponElement.isDisplayed();
        driver.switchTo().parentFrame();
        return  isDisplayed;

    }

}
