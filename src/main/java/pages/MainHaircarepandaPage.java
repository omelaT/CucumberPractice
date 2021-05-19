package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainHaircarepandaPage  extends AbstractPage{
    public MainHaircarepandaPage() {
        super();
        waitForLoadableElement();
    }
    @Override
    public void waitForLoadableElement() {

    }
    @FindBy(css ="a[href$='produkty/zelki'] .button")
    private static WebElement gummButton;

    public GummyProductsPage clickOnGummButton() {
        gummButton.click();
        return new GummyProductsPage();
    }

}
