package tests.home;

import org.bet9jasite.testing.core.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BookingPage;
import pages.CouponSearch;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test(description = "Should have book a bet button on")
    public void shouldHaveBookABetButton() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.bookABetButton.isDisplayed());
    }
    @Test(description = "Should navigate to odd selection page, when I click book a bet button")
    public void shouldNavigateToBookingBetWhenBookABetIsClicked() {
        HomePage homePage = new HomePage();
        homePage.bookABetButton.click();
        BookingPage bookingPage = new BookingPage();
        waitUntilVisible(bookingPage.informationElement);
        Assert.assertTrue(bookingPage.informationElement.isDisplayed());
    }
}
