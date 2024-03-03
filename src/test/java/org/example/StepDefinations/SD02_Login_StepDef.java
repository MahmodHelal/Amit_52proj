package org.example.StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_HomePage_PG;
import org.example.Pages.P03_LoginPage_PG;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class SD02_Login_StepDef {
    P01_HomePage_PG p01HomePagePg = new P01_HomePage_PG();
    P03_LoginPage_PG p03LoginPagePg = new P03_LoginPage_PG();
    SoftAssert soft = new SoftAssert();

    @Given("User go to login page")
    public void userGoToLoginPage(){
        p01HomePagePg.login_Btn().click();
    }


    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String CC, String mail, String pass) {
//        if (Case.equals("valid")){
//        p03LoginPagePg.email_textBox().sendKeys(mail);
//        p03LoginPagePg.password_textBox().sendKeys(pass);
//        }
//        else if (Case.equals("invalid")) {
//            p03LoginPagePg.email_textBox().sendKeys(mail);
//            p03LoginPagePg.password_textBox().sendKeys(pass);
//        }
//        CC = "بلح";
        p03LoginPagePg.email_textBox().sendKeys(mail);
        p03LoginPagePg.password_textBox().sendKeys(pass);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() throws InterruptedException {
        p03LoginPagePg.LogIn_button().click();
        Thread.sleep(2000);
    }


    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
            soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
            //MyACC
            soft.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());;
            soft.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        //unsuccMsg
        soft.assertTrue(p03LoginPagePg.unSuccessMsg().getText().contains("Login was unsuccessful."));
//        System.out.println(p03LoginPagePg.unSuccessMsg().getCssValue("color"));
        soft.assertEquals(p03LoginPagePg.unSuccessMsg().getCssValue("color"),"rgba(228, 67, 75, 1)");
        soft.assertEquals(Color.fromString("rgba(228, 67, 75, 1)").asHex(),"#e4434b");
        soft.assertAll();
    }
}
