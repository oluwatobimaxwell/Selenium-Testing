package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.bet9jasite.testing.core.Base.driver;

public class ZoomOddsTvPage {

    @FindBy(className = "top-bar__logo")
    public WebElement ZoomVirtualSoccerElement;
    public ZoomOddsTvPage() {   PageFactory.initElements(driver, this);    }
}
