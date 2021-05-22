package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.BuscketPage;
import pages.GummyProductsPage;
import pages.MainHaircarepandaPage;



public class StepDefinitions {
    // public static final String searchText= "Hair Care Panda Vegan Gummies";
    MainHaircarepandaPage mainHaircarepandaPage;
    GummyProductsPage gummyProductsPage;
    BuscketPage buscketPage;


    @Given("I login as non registered user on haircarepanda")
    public void i_login_as_non_registered_user_on_haircarepanda() {
        // Write code here that turns the phrase above into concrete actions
        mainHaircarepandaPage = new MainHaircarepandaPage();
    }

    @Given("I select category “gummies”")
    public void i_select_category_gummies() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        mainHaircarepandaPage.clickOnGummButton();

    }

    @Given("I put cursor on product")
    public void i_put_cursor_on_product() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        gummyProductsPage = new GummyProductsPage();
        gummyProductsPage.cookieClick();
        gummyProductsPage.hoverelement();

        ////
     //   Thread.sleep(5000);
    }

    @When("I tap on “Buy now” button")
    public void i_tap_on_buy_now_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        gummyProductsPage.clickByButn();
        Thread.sleep(3000);
       // buscketPage.waitForLoadableElement();
        gummyProductsPage.windowBuscketClick();
        Thread.sleep(3000);

    }

    @Then("the basket page is displayed with selected previously product")
    public void the_basket_page_is_displayed_with_selected_previously_product() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        buscketPage = new BuscketPage();
        Thread.sleep(3000);
     ;
        buscketPage.itemInBuscket();
        Thread.sleep(3000);

        Assert.assertTrue(buscketPage.itemInBuscket());
    }

//CASE2
@Given("I add product to basket")
public void i_add_product_to_basket() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    mainHaircarepandaPage = new MainHaircarepandaPage();
    mainHaircarepandaPage.clickOnGummButton();

    gummyProductsPage = new GummyProductsPage();
    gummyProductsPage.cookieClick();
    gummyProductsPage.hoverelement();

    gummyProductsPage.clickByButn();
    Thread.sleep(3000);


}

    @Given("I navigate to basket")
    public void i_navigate_to_basket() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        gummyProductsPage.windowBuscketClick();
        buscketPage = new BuscketPage();
        Thread.sleep(3000);
        buscketPage.itemInBuscket();
        Thread.sleep(3000);

    }
    @When("I tap on “delete” icon near product name")
    public void i_tap_on_delete_icon_near_product_name() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        buscketPage.visibleDeleteButton();
        System.out.println(("delete btn visible"));
        Thread.sleep(5000);
        buscketPage.clickOnDeleteButton();
        System.out.println("click on delete");
        Thread.sleep(3000);
        buscketPage.alert();
        Thread.sleep(3000);

    }
    @Then("the message “Your shopping cart is empty An empty basket is a sad basket” is displayed")
    public void the_message_your_shopping_cart_is_empty_an_empty_basket_is_a_sad_basket_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(buscketPage.textEmptyBuscketDisplayed());
    }


    @When("I tap on “+” icon near product name")
    public void i_tap_on_icon_near_product_name() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        mainHaircarepandaPage = new MainHaircarepandaPage();
        mainHaircarepandaPage.clickOnGummButton();

        gummyProductsPage = new GummyProductsPage();
        gummyProductsPage.cookieClick();
        gummyProductsPage.hoverelement();

        gummyProductsPage.clickByButn();
        Thread.sleep(3000);

        gummyProductsPage.windowBuscketClick();
        buscketPage = new BuscketPage();
        Thread.sleep(3000);

        buscketPage.itemInBuscket();
        Thread.sleep(5000);

        //add one more
        buscketPage.clickOnPlusButton();
        Thread.sleep(5000);

    }


    @Then("the quantity of products is increased")
    public void the_quantity_of_products_is_increased() {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertTrue(buscketPage.increaseValue().contains("2"));

    }
    @Then("the price is calculated correctly")
    public void the_price_is_calculated_correctly() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(buscketPage.increaseValue().contains("2"));

    }

}
