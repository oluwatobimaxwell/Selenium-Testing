package pages;

import org.bet9jasite.testing.core.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LottoDrawsPage extends Base {
    @FindBy(xpath = "//div[text()='Enable sound']")
    public WebElement lottoDrawsElement;
    public LottoDrawsPage() { PageFactory.initElements(driver, this);     }
}
