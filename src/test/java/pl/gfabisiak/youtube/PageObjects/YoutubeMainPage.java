package pl.gfabisiak.youtube.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeMainPage {
    public WebDriver localDriver;

    public String url = "https://youtube.com";

    public YoutubeMainPage(WebDriver driver){
        this.localDriver = driver;
        this.localDriver.get(url);
    }

    public YoutubeSearchPage DoASearchQueryOnMainPage(String searchQuery){
        WebElement searchBar = this.localDriver.findElement(By.id("search"));
        searchBar.sendKeys(searchQuery);
        searchBar.sendKeys(Keys.RETURN);
        return new YoutubeSearchPage(this.localDriver);
    }
}
