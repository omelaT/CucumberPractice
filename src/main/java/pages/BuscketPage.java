package pages;

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
    @FindBy(css = "[class=\"visible-xs biger-text\"]")
    private static WebElement item;

    @FindBy(css = "[src=\"https://media.noblehealth.com/2049/grey200x200/hair-care-panda-vegan-gummies-x2.jpg\" ]")
   private static WebElement itemInBuscket;
    //alt='Hair Care Panda Vegan Gummies x2"
    //[src="https://media.noblehealth.com/2049/grey200x200/hair-care-panda-vegan-gummies-x2.jpg" ]
    public boolean itemInBuscket(){
      return   itemInBuscket.isDisplayed();
    }
}
