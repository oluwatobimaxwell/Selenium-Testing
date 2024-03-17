package org.bet9jasite.testing.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bet9jasite.testing.utils.PropertiesFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;

//Read configuration properties/information such as url, browser & setup web driver
public class Base {
    public static Map<String, String> configDetails;
    public static WebDriver driver;

    static  {
        // Read configured properties
        configDetails = PropertiesFileReader.getProperties();
    }

    public static String getBrowser(){
        return configDetails.get("browser");
    }

    public static  String getBaseUrl(){
        return configDetails.get("url");
    }

    public void driverSetup() throws IOException {
        String browser = configDetails.get("browser");
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                throw new IOException("Browser name: " + browser + ", is not currently supported.");
        }
    }

    public static WebElement waitForElement (String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        return element;
    }

    public static WebElement waitUntilVisible( WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        try {
            return wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            return null; // Return null if element is not found within timeout
        }
    }
}
