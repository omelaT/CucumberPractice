package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuscketPage extends AbstractPage {
    public BuscketPage() {
        super();
        waitForLoadableElement();
    }

    @Override
    public void waitForLoadableElement() {

    }

    //  @FindBy(css = "[class=\"visible-xs biger-text\"]")
    // private static WebElement item;
    //[src="https://media.noblehealth.com/2049/grey200x200/hair-care-panda-vegan-gummies-x2.jpg" ]
//a[href="/product/hair-care-panda-vegan-gummies-x2"]
    //  @FindBy(css = "[src=\"https://media.noblehealth.com/2049/grey200x200/hair-care-panda-vegan-gummies-x2.jpg\" ]")
    @FindBy(css = "[class=\"biger-text\"]")
    private static WebElement itemInBuscket;


    @FindBy(css = "[class=\"glyphicon glyphicon-trash visible-xs-inline\"]")
    private static WebElement deleteButton;

    @FindBy(css = "[class=\"glyphicon glyphicon-trash visible-xs-inline\"]")
    private static WebElement hoverDeleteButton;

    @FindBy(css = "[class=\"glyphicon glyphicon-trash visible-xs-inline\"]")
    private static WebElement visibleDeleteButton;

    @FindBy(css = "[class=\"text-center biger-text hidden-xs\"]")
    private static WebElement textEmptyBuscket;

    @FindBy(css = "[class=\"plus\"]")
    private static WebElement plusButton;

    @FindBy(css = "[value=\"2\"]")
    private static WebElement increaseValue;

    @FindBy(css = "[value=\"2\"]")
    private static WebElement CheckPrice;

    public boolean itemInBuscket() {
        return itemInBuscket.isDisplayed();
    }

    public boolean visibleDeleteButton() {
        return visibleDeleteButton.isDisplayed();
    }

    public void clickOnDeleteButton() {
        deleteButton.click();
    }

    public boolean textEmptyBuscketDisplayed() {
        return textEmptyBuscket.isDisplayed();
    }

    public void alert() {
        Alert alert = ProviderForDriver.INSTANCE.getDriver().switchTo().alert();
        alert.accept();
    }

    public void clickOnPlusButton() {
        plusButton.click();
    }

    public String increaseValue() {
        return increaseValue.getText();
    }


}
