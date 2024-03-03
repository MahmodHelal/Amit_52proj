package org.example.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_HomePage_PG;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SD03_currencies_StepDef {
    P01_HomePage_PG p01HomePagePg = new P01_HomePage_PG();


    @Given("User is on my home page")
    public void userIsOnMyHomePage(){
    }

    @When("User select currency {string}")
    public void userSelectCurrency(String currency) {
        Select selectCurrency = new Select(p01HomePagePg.currency_dropDown());
        selectCurrency.selectByVisibleText(currency);

        //هنا ال clickwishlist تمام ,,, في اخر feature مش شغال
/*
        p01HomePagePg.wishlist_Btn().click();
        Assert.assertTrue(p01HomePagePg.success_Msg().isDisplayed(), "Success message is not displayed");
        Assert.assertEquals(p01HomePagePg.success_Msg().getText(), "The product has been added to your wishlist", "Incorrect success message");
        Assert.assertEquals(p01HomePagePg.success_Msg().getCssValue("background-color"), "rgba(75, 176, 122, 1)", "Background color is not green");
*/

    }

    @Then("Products should be displayed in {string}")
    public void productsShouldBeDisplayedIn(String curr) {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfAllElements(p01HomePagePg.productsPrices()));
        for (int i = 0; i< p01HomePagePg.productsPrices().size(); i++){
            System.out.println(p01HomePagePg.productsPrices().get(i).getText());
            Assert.assertTrue(p01HomePagePg.productsPrices().get(i).getText().contains(curr));
        }
    }
}
