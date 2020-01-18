package pl.gfabisiak.youtube.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeSearchPage {
    public WebDriver localDriver;

    public YoutubeSearchPage(WebDriver driver){
        this.localDriver = driver;
    }

    public YoutubeVideo OpenFirstSearchResult(){
        WebElement firstResult = this.localDriver.findElement(By.xpath("//*[@id=\"video-title\"]"));
        firstResult.click();
        return new YoutubeVideo(this.localDriver);
    }
}
