package org.example.Pages;

import org.example.StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_RegisterPage_PG {
    public WebElement maleGender_RadioButton(){
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement femaleGender_RadioButton(){
        return Hooks.driver.findElement(By.id("gender-female"));
    }
    public WebElement firstName_TextBox(){
        return  Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement lastName_TextBox(){
        return  Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement email_TextBox(){
        return  Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password_TextBox(){
        return  Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassword_TextBox(){
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement submitRegister_Button(){
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement successMsg(){
        return Hooks.driver.findElement(By.className("result"));
    }
    public WebElement dayOfBirth(){
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement monthOfBirth(){
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement yearOfBirth(){
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

}
