package org.example.StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_HomePage_PG;
import org.example.Pages.P02_RegisterPage_PG;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SD01_Register_StepDef {
    P01_HomePage_PG p01HomePagePage = new P01_HomePage_PG();
    P02_RegisterPage_PG p02RegisterPagePg = new P02_RegisterPage_PG();
    @Given("User go to register page")
    public void userGoToRegisterPage(){
//        System.out.println("This is a test before start coding");
        p01HomePagePage.register_Btn().click();
    }

    @When("User selects gender type")
    public void userSelectsGenderType() {
        p02RegisterPagePg.maleGender_RadioButton().click();
    }

    @And("User enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String firstname, String lastname) {
        p02RegisterPagePg.firstName_TextBox().sendKeys(firstname);
        p02RegisterPagePg.lastName_TextBox().sendKeys(lastname);
    }

    @And("User selects Date of birth {string} {string} {string}")
    public void userSelectsDateOfBirth(String day, String month, String year) throws InterruptedException {
        Select select = new Select(p02RegisterPagePg.dayOfBirth());
        select.selectByVisibleText(day);
        select = new Select(p02RegisterPagePg.monthOfBirth());
        select.selectByVisibleText(month);
        select = new Select(p02RegisterPagePg.yearOfBirth());
        select.selectByVisibleText(year);
//        Thread.sleep(1000);
    }

    @And("User enter email {string} field")
    public void userEnterEmailField(String email) {
        p02RegisterPagePg.email_TextBox().sendKeys(email);
    }

    @And("User fills Password fields {string} {string}")
    public void userFillsPasswordFields(String pass, String copass) {
        p02RegisterPagePg.password_TextBox().sendKeys(pass);
        p02RegisterPagePg.confirmPassword_TextBox().sendKeys(copass);
    }

    @And("User clicks on register button")
    public void userClicksOnRegisterButton() {
        p02RegisterPagePg.submitRegister_Button().click();
    }

    @Then("A new account should be created successfully")
    public void aNewAccountShouldBeCreatedSuccessfully() {
        Assert.assertTrue(p02RegisterPagePg.successMsg().getText().contains("Your registration completed"));
        Assert.assertEquals(p02RegisterPagePg.successMsg().getCssValue("color"),"rgba(76, 177, 124, 1)");
//        System.out.println(p02RegisterPagePg.successMsg().getCssValue("color"));
    }
}
