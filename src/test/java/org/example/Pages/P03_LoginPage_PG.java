package org.example.Pages;

import org.example.StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_LoginPage_PG {
    public WebElement email_textBox(){
        return Hooks.driver.findElement(By.className("email"));
    }
    public WebElement password_textBox(){
        return Hooks.driver.findElement(By.className("password"));
    }
    public WebElement LogIn_button(){
        return Hooks.driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
    }
    public WebElement unSuccessMsg(){
        return Hooks.driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
    }

}
