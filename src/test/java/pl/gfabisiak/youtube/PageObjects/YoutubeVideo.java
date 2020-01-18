package pl.gfabisiak.youtube.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pl.gfabisiak.youtube.HelperFunctions;

public class YoutubeVideo {

    public WebDriver localDriver;

    public YoutubeVideo(WebDriver driver){
        this.localDriver = driver;
    }

    public void StopVideoPlaybackAfter10Seconds() throws InterruptedException {
        WebElement video = this.localDriver.findElement(By.cssSelector("#movie_player"));
        Thread.sleep(10000);
        video.click();
    }

    public void GoToCommentsSection(){
        WebElement commentSection = this.localDriver.findElement(By.id("sections"));
        HelperFunctions.MoveToElementUsingActions(this.localDriver, commentSection);
    }

    public void GoToTheBottomOfThePage(){
        HelperFunctions.ScrollToTheBottomOfThePage(this.localDriver);
    }
}
