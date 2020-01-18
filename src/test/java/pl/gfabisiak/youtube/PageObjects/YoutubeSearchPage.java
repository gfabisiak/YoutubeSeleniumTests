package pl.gfabisiak.youtube.PageObjects;

import org.openqa.selenium.WebDriver;

public class YoutubeSearchPage {
    public WebDriver localDriver;

    public YoutubeSearchPage(WebDriver driver){
        this.localDriver = driver;
    }
}
