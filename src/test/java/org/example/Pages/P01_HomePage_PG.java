package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.StepDefinations.Hooks.driver;

public class P01_HomePage_PG {

    public WebElement register_Btn(){
        return driver.findElement(By.className("ico-register"));
    }
    public WebElement login_Btn(){
        return driver.findElement(By.className("ico-login"));
    }
    public WebElement currency_dropDown(){
        return driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> productsPrices(){
        return driver.findElements(By.xpath("//span[@class='price actual-price']"));
    }
    public WebElement search_textbox(){
        return driver.findElement(By.id("small-searchterms"));
    }
    public WebElement mainCategory_Btn(int i){
        return driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li['+ i +']//a"));
    }
    public WebElement subCategory_Btn(int i, int j){
        return driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li['+i+']//ul//li['+j+']//a"));

    }
    public WebElement firstSlider() {
        return driver.findElement(By.xpath("//div[@id='nivo-slider']//a[1]"));
    }

    public WebElement secondSlider() {
        return driver.findElement(By.xpath("//div[@id='nivo-slider']//a[2]"));
    }
    public WebElement facebook_link(){
        return driver.findElement(By.xpath("//li[@class='facebook']//a"));
    }
    public WebElement twitter_link(){
        return driver.findElement(By.xpath("//li[@class='twitter']//a"));
    }
    public WebElement rss_link(){
        return driver.findElement(By.xpath("//li[@class='rss']//a"));
    }
    public WebElement youtube_link(){
        return driver.findElement(By.xpath("//li[@class='youtube']//a"));
    }

    public WebElement wishlist_Btn(){
        return driver.findElement(By.xpath("//div[@data-productid='18']//button[3]"));
    }
    public WebElement success_Msg(){
        return driver.findElement(By.xpath("//div[@class='bar-notification success']"));
    }
    public WebElement wishlist_Tab(){
        return driver.findElement(By.className("wishlist-label"));
    }
    public int qtyElement(){
        return Integer.parseInt(driver.findElement(By.xpath("//span[@class='wishlist-qty']")).getText());

    }

}
