package pages;

import org.bet9jasite.testing.core.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ReportPage extends Base {

    @FindBy(xpath = "//a[@title='Report']")
    public WebElement reportAdminElement;
    public ReportPage(){ PageFactory.initElements(driver, this);    }
}
