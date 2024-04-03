package pages;

import org.bet9jasite.testing.core.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CouponSearch1 extends Base {

    @FindBy(xpath = "//td[contains(text(),'B9TE195559790X8-1664380')]")
    public WebElement couponCheckElement;

    public CouponSearch1() { PageFactory.initElements(driver, this);    }
}
