package org.example.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_HomePage_PG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SD04_search_StepDef {
    P01_HomePage_PG p01HomePagePg =new P01_HomePage_PG();
    SoftAssert soft = new SoftAssert();

    @Given("User is on home page")
    public void userIsOnHomePage(){
    }

    @When("user enter {string} and click enter")
    public void userEnter(String item) {
        p01HomePagePg.search_textbox().sendKeys(item);
        p01HomePagePg.search_textbox().sendKeys(Keys.ENTER);
    }

    @Then("the right product will appear {string}")
    public void theRightProductWillAppear(String searchKeyword) {


        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));

        List<WebElement> searchResults = Hooks.driver.findElements(By.xpath("//div[@class='product-item']"));
        int numberOfResults = searchResults.size();
        soft.assertTrue(numberOfResults > 0, "No search results found");

        for (WebElement result : searchResults) {
            String productName = result.findElement(By.tagName("h2")).getText().toLowerCase();
            // This is a Bug
            soft.assertTrue(productName.contains(searchKeyword.toLowerCase()), "Search result does not contain the search keyword");
        }
        soft.assertAll();
    }

    @Then("SKU shown on the product page contains the searched {string}")
    public void skuShownOnTheProductPageContainsTheSearched(String sku) {//h2[@class='product-title']/a
        WebElement searchedProduct = Hooks.driver.findElement(By.xpath("//h2[@class='product-title']/a"));
        searchedProduct.click();

        WebElement productSKUElement = Hooks.driver.findElement(By.xpath("//div[@class='sku']/span[2]"));
        String productSKU = productSKUElement.getText();

        soft.assertTrue(productSKU.contains(sku), "Product page SKU does not match the searched SKU");

    }

}
