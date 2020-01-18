package pl.gfabisiak.youtube.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeSearchPage {
    public WebDriver localDriver;

    public YoutubeSearchPage(WebDriver driver){
        this.localDriver = driver;
    }

    public YoutubeVideo openFirstSearchResult(){
        WebElement firstResult = this.localDriver.findElement(By.xpath("//ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a"));
        firstResult.click();
        return new YoutubeVideo(this.localDriver);
    }
}
