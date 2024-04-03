package pages;

import org.bet9jasite.testing.core.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CashierDashBoardPage extends Base {

    @FindBy(id = "hl_w_PC_PC_lblBentornato")
    public WebElement welcomeTextElement;
    public CashierDashBoardPage() {    PageFactory.initElements(driver, this);    }
}
