package org.example.StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_HomePage_PG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class SD05_hoverCategories_StepDef {
    P01_HomePage_PG p01HomePagePg =new P01_HomePage_PG();
    Random rand = new Random();
    int index = rand.nextInt(3) + 1;
    int sub = rand.nextInt(3) + 1;

    Actions actions = new Actions(Hooks.driver);


    @Given("User is on the Home page")
    public void userIsOnTheHomePage(){
        
    }

    @When("User selects a random main category")
    public void userSelectsARandomMainCategory() {
                p01HomePagePg.mainCategory_Btn(index).click();
    }

    @And("User hovers over the selected main category")
    public void userHoversOverTheSelectedMainCategory() {
        actions.moveToElement(p01HomePagePg.mainCategory_Btn(index)).perform();
    }

    @And("User selects a random sub category")
    public void userSelectsARandomSubCategory() {

        p01HomePagePg.subCategory_Btn(index,sub).click();


    }

    @Then("User should verify that the sub category page title matches the selected sub category")
    public void userShouldVerifyThatTheSubCategoryPageTitleMatchesTheSelectedSubCategory() {
        String subName = p01HomePagePg.subCategory_Btn(index,sub).getText().toLowerCase().trim();;
        String pageTitle = Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]//h1")).getText().toLowerCase().trim();
        Assert.assertTrue(pageTitle.contains(subName));
    }
}
