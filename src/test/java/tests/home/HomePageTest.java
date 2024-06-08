package tests.home;


import org.bet9jasite.testing.core.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.ArrayList;

public class HomePageTest extends BaseTest {

    @Test(description = "Should have BOOK A BET on", groups = {"smoke"})
    public void shouldHaveBookABetButton() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.bookABetButton.isDisplayed());
    }

    @Test(description = "Should navigate to odd selection page, when I click book a bet button", groups = {"smoke"})
    public void shouldNavigateToBookingBetWhenBookABetIsClicked() {
        HomePage homePage = new HomePage();
        homePage.bookABetButton.click();
        BookingPage bookingPage = new BookingPage();
        waitUntilVisible(bookingPage.informationElement);
        Assert.assertTrue(bookingPage.informationElement.isDisplayed());
    }

    @Test (description = "Bet9ja Logo should appear at the top left angle", groups = {"smoke"})
    public  void bet9jaHomepageLogo(){
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.bet9jaHomepageLogo.isDisplayed());
    }

    @Test (description = "should open a new tab and nagivate to Report when I click REPORT", groups = {"smoke"})
    public void ReportButton(){

        HomePage homePage = new HomePage();
        homePage.reportElement.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        ReportPage reportPage = new ReportPage();
        waitUntilVisible(reportPage.reportAdminElement);
        Assert.assertTrue(reportPage.reportAdminElement.isDisplayed());
    }

    @Test (description = "should be able to login with valid username and password", groups = {"smoke"})
    public void shouldLoginWithValidCredentials(){
        HomePage homePage = new HomePage();
        homePage.userNameInput.sendKeys("cashier14935-05");
        homePage.passWordInput.sendKeys("06738208");
        homePage.loginButton.click();
        CashierDashBoardPage cashierDashBoardPage = new CashierDashBoardPage();
        waitUntilVisible(cashierDashBoardPage.welcomeTextElement);
        Assert.assertTrue(cashierDashBoardPage.welcomeTextElement.isDisplayed());
    }

    @Test (description = " ZOOM ODDS TV should be on the homepage and when click, It should be able to navigate to new tab Zoom Virtual Soccer")
    public void shouldHaveAZoomOddsTv (){
        HomePage homePage = new HomePage();
        homePage.ZoomOddTvButton.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        ZoomOddsTvPage zoomOddsTvPage = new ZoomOddsTvPage();
        WebElement webElement = waitUntilVisible(zoomOddsTvPage.ZoomVirtualSoccerElement);
        Assert.assertTrue(webElement.isDisplayed());
    }

    @Test (description = " LOTTO DRAWS should be on the homepage and when click, It should be able to navigate to new tab Lotto draws page")
    public void shouldHaveALottoDraws () {
        HomePage homePage = new HomePage();
        homePage.lottoDrawsButton.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        LottoDrawsPage lottoDrawsPage = new LottoDrawsPage();
        waitUntilVisible(lottoDrawsPage.lottoDrawsElement);
       // Assert.assertTrue(lottoDrawsPage.lottoDrawsElement.isDisplayed());
    }

    @Test (description = "LOTTO RESULT should be on the homepage and when click, It should be able to navigate to new tab Lotto Results pdf file")
        public void shouldHAveALottoResults () {
        HomePage homePage= new HomePage();
        homePage.lottoResultButton.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        LottoResultPage lottoResultPage = new LottoResultPage();
       // driver.wait();

     //   Thread.sleep(4000);
        waitUntilVisible(lottoResultPage.lottoResultElement);
    //        Assert.assertEquals(driver.getTitle(), "lotto_results.pdf");
        Assert.assertTrue(lottoResultPage.lottoResultElement.isDisplayed());
    }

    @Test (description = "Coupon Check")
    public void couponCheck () {
        HomePage homePage = new HomePage();
        homePage.couponSearchElement.sendKeys("B9TE195559790X8-1664380");
        homePage.couponButtonElement.click();
        CouponSearch1 couponSearch1 = new CouponSearch1();
        waitUntilVisible(couponSearch1.couponCheckElement);
        //Assert.assertTrue(couponSearch1.couponCheckElement.isDisplayed());
    }



}
