package pages;

import org.bet9jasite.testing.core.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    @FindBy(className = "bookBet")
    public WebElement bookABetButton;

    @FindBy(className = "admin")
    public WebElement reportElement;

    @FindBy(id = "h_w_Image1")
    public WebElement bet9jaHomepageLogo;

    @FindBy(id = "h_w_PC_cLogin_ctrlLogin_Username")
    public WebElement userNameInput;

    @FindBy(id = "h_w_PC_cLogin_ctrlLogin_Password")
    public WebElement passWordInput;

    @FindBy(id = "h_w_PC_cLogin_ctrlLogin_lnkBtnLogin")
    public WebElement loginButton;

    @FindBy(className = "zoomScores")
    public WebElement ZoomOddTvButton;

    @FindBy(className = "LottoResults")
    public WebElement lottoDrawsButton;

//    @FindBy(className = "lotto")
//    public WebElement lottoResultButton;

    @FindBy(id = "h_w_PC_ctl06_txtCodiceCoupon")
    public WebElement couponSearchElement;

    @FindBy(id = "h_w_PC_ctl06_lnkCheckCoupon")
    public WebElement couponButtonElement;

    @FindBy(xpath = "h_w_PC_ctl06_lnkCheckCoupon")
    public WebElement aboutUsElement;






    public HomePage(){
        PageFactory.initElements(driver, this);
    }
}
