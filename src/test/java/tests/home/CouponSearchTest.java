package tests.home;

import org.bet9jasite.testing.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CouponSearch;

public class CouponSearchTest extends BaseTest {


    @Test
    public void searchCoupon() {
        CouponSearch homePage = new CouponSearch("B9TE195559790X8-1664380");
        homePage.searchCoupon();
        Assert.assertTrue(homePage.doesCouponExist());
    }



}
