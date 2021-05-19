package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GummyProductsPage  extends AbstractPage{
    public GummyProductsPage() {
        super();
        waitForLoadableElement();
    }
    @Override
    public void waitForLoadableElement() {
    }

    @FindBy(css = "[onclick=\"setLocalCookie(); $('#cookiebar').hide();\"]")
    private static WebElement cookieClick;

    @FindBy(css = "[alt =\"Hair Care Panda Vegan Gummies\"]")
    private static WebElement hover;

    @FindBy(css = "[data-name=\"Hair Care Panda Vegan Gummies\"]")
    private static WebElement byeButton;

    @FindBy(css ="[a.top-bag]")
    private static WebElement buscket;

    @FindBy(css ="[alt=\"Hair Care Panda Vegan Gummies\"]")
    private static WebElement scroll;

    public  void cookieClick(){
        cookieClick.click();
    }
    public WebElement hoverelement(){
      return  hover;
    }
    public void clickByButn(){
        byeButton.click();
      //  return new BuscketPage();
    }

    public BuscketPage clickOnBuscket(){
        buscket.click();
        return new BuscketPage();
    }
    @FindBy(css ="[class=\"btn btn-primary btn-rounded-smaller no-animation\"]")
    private static WebElement windowBuscketElement;

  //  class="btn btn-primary btn-rounded-smaller no-animation"
    public BuscketPage windowBuscket(){
       windowBuscketElement.click();
        return new BuscketPage();
    }
/*
    public void   scroleToElenent() {
        ((JavascriptExecutor) ProviderForDriver.INSTANCE.getDriver())
        .executeScript("arguments[0].scrollIntoView(true);", byeButton);
    }

 */
    public void alert(){
        Alert alert = ProviderForDriver.INSTANCE.getDriver().switchTo().alert();
        alert.accept();
    }

    public void clickBuscket(){
        buscket.click();
       // return  new BuscketPage();
    }




}
