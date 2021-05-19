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
    public void i_put_cursor_on_product() {
        // Write code here that turns the phrase above into concrete actions
        gummyProductsPage = new GummyProductsPage();
        gummyProductsPage.cookieClick();
        gummyProductsPage.hoverelement();
    }

    @When("I tap on “Buy now” button")
    public void i_tap_on_buy_now_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        gummyProductsPage.clickByButn();
        Thread.sleep(2000);
        gummyProductsPage.windowBuscket();

    }

    @Then("the basket page is displayed with selected previously product")
    public void the_basket_page_is_displayed_with_selected_previously_product() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        buscketPage = new BuscketPage();
        Thread.sleep(2000);
    /*     buscketPage.waitForLoadableElement();
        buscketPage.itemInBuscket();
        Assert.assertTrue( buscketPage.itemInBuscket().contains("Hair Care Panda Vegan Gummies") )
     */
        Assert.assertTrue(buscketPage.itemInBuscket());
    }


}
