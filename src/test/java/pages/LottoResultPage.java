package pages;

import org.bet9jasite.testing.core.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LottoResultPage extends Base {

    @FindBy(id = "outerContainer")
    public WebElement lottoResultElement;
    public LottoResultPage() { PageFactory.initElements(driver, this);  }
}
