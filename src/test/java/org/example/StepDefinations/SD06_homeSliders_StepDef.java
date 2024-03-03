package org.example.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_HomePage_PG;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;


import static org.example.StepDefinations.Hooks.driver;

public class SD06_homeSliders_StepDef {
    P01_HomePage_PG p01HomePagePg = new P01_HomePage_PG();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("User opens the home page")
    public void userOpensTheHomePage(){
        
    }

    @When("User clicks on the first slider")
    public void userClicksOnTheFirstSlider() {
        p01HomePagePg.firstSlider().click();
    }
    @When("User clicks on the second slider")
    public void userClicksOnTheSecondSlider() {
        p01HomePagePg.secondSlider().click();
    }

    @Then("The URL should contain {string}")
    public void theURLShouldContain(String expUrl) {

        wait.until(ExpectedConditions.urlContains(expUrl));
        //This is a Bug
        Assert.assertTrue(driver.getCurrentUrl().contains(expUrl));

    }


}
