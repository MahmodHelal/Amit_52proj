package org.example.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_HomePage_PG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SD08_Wishlist_StepDef {

    P01_HomePage_PG p01HomePagePg =new P01_HomePage_PG();

@Given("User is on homepage")
    public void UserIsOnHomepage(){
    
}

    @When("User adds an item to the wishlist")
    public void userAddsAnItemToTheWishlist() throws InterruptedException {
    // معرفش ليه مش راضي يشتغل
        p01HomePagePg.wishlist_Btn().click();
        Thread.sleep(1200);
    }

    @Then("Success message will appear")
    public void successMessageWillAppear() {
                SoftAssert soft = new SoftAssert();
        soft.assertTrue(p01HomePagePg.success_Msg().isDisplayed(), "Success message is not displayed");
        soft.assertEquals(p01HomePagePg.success_Msg().getText(), "The product has been added to your wishlist", "Incorrect success message");
        soft.assertEquals(p01HomePagePg.success_Msg().getCssValue("background-color"), "rgba(75, 176, 122, 1)", "Background color is not green");
                soft.assertAll();
    }

    @Then("Item should be added to the wishlist")
    public void itemShouldBeAddedToTheWishlist() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(p01HomePagePg.success_Msg()));
        Assert.assertTrue(p01HomePagePg.qtyElement() > 0, "Qty value is not bigger than 0");


    }



}
