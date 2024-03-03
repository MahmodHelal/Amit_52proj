package org.example.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_HomePage_PG;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.StepDefinations.Hooks.driver;

public class SD07_followUs_StepDef {

    P01_HomePage_PG p01HomePagePg = new P01_HomePage_PG();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

    @Given("User is on the homepage")
    public void userIsOnTheHomepage(){

    }

    @When("User clicks on the Facebook link")
    public void userClicksOnTheFacebookLink() throws InterruptedException {
        p01HomePagePg.facebook_link().click();
        Thread.sleep(2000);
    }
    @Then("User should be redirected to the Facebook page {string}")
    public void userShouldBeRedirectedToTheFacebookPage(String expUrl) {
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),expUrl);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    @When("User clicks on the Twitter link")
    public void userClicksOnTheTwitterLink() {
        p01HomePagePg.twitter_link().click();
    }
    @Then("User should be redirected to the Twitter page {string}")
    public void userShouldBeRedirectedToTheTwitterPage(String expUrl) {
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),expUrl);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    @When("User clicks on the RSS link")
    public void userClicksOnTheRSSLink() {
        p01HomePagePg.rss_link().click();
    }
    @Then("User should be redirected to the correct RSS feed {string}")
    public void userShouldBeRedirectedToTheCorrectRSSFeed(String expUrl) {
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),expUrl);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    @When("User clicks on the YouTube link")
    public void userClicksOnTheYouTubeLink(){
        p01HomePagePg.youtube_link().click();
    }
    @Then("User should be redirected to the YouTube page {string}")
    public void userShouldBeRedirectedToTheYouTubePage(String expUrl){
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),expUrl);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }



}
