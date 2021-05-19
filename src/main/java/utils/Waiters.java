package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ProviderForDriver;
import java.time.Duration;

public class Waiters {

/*    public static WebElement waitForElementToBeVisible(WebElement webElement, WebDriver driver){
        return (new WebDriverWait(driver, Duration.ofSeconds(2)))
                .until(ExpectedConditions.visibilityOf(webElement));
    }*/

    public static WebElement waitForElementToBeVisible(WebElement webElement){
        return (new WebDriverWait(ProviderForDriver.INSTANCE.getDriver(), Duration.ofSeconds(4)))
                .until(ExpectedConditions.visibilityOf(webElement));
    }
}
