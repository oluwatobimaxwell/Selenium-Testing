package org.bet9jasite.testing.core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest  extends Base {

    @BeforeMethod(alwaysRun = true)
    public void setup() throws IOException {
        driverSetup();
        driver.get(getBaseUrl());
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

}
