package pl.gfabisiak.youtube.PageObjects;

import org.openqa.selenium.WebDriver;

public class YoutubeMainPage {
    public WebDriver localDriver;

    public String url = "https://youtube.com";

    public YoutubeMainPage(WebDriver driver){
        this.localDriver = driver;
        this.localDriver.get(url);
    }
}
