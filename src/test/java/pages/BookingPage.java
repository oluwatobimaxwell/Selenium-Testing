package pages;

import org.bet9jasite.testing.core.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends Base {
    @FindBy(id = "s_w_PC_PC_ctrlMessage_lblResponse")
    public WebElement informationElement;
    public BookingPage(){
        PageFactory.initElements(driver, this);
    }
}
