package pages;

import org.bet9jasite.testing.core.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    @FindBy(className = "bookBet")
    public WebElement bookABetButton;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
}
