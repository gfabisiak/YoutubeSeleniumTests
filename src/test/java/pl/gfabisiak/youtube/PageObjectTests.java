package pl.gfabisiak.youtube;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.gfabisiak.youtube.PageObjects.YoutubeMainPage;
import pl.gfabisiak.youtube.PageObjects.YoutubeSearchPage;
import pl.gfabisiak.youtube.PageObjects.YoutubeVideo;

import java.util.concurrent.TimeUnit;

public class PageObjectTests {

    public WebDriver driver;

    @Before
    public void Initialize(){
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

    @Test
    public void OpenYoutubeMainPage(){
        YoutubeMainPage youtubeMainPage = new YoutubeMainPage(driver);
    }

    @Test
    public void GoToSearchResults(){
        YoutubeMainPage youtubeMainPage = new YoutubeMainPage(driver);
        YoutubeSearchPage youtubeSearchPage = youtubeMainPage.doASearchQueryOnMainPage("PageObject pattern");
    }

    @Test
    public void GoToFirstResultOfSearch(){
        YoutubeMainPage youtubeMainPage = new YoutubeMainPage(driver);
        YoutubeSearchPage youtubeSearchPage = youtubeMainPage.doASearchQueryOnMainPage("PageObject pattern");
        YoutubeVideo youtubeVideo = youtubeSearchPage.openFirstSearchResult();
    }

    @Test
    public void SearchAndPlayVideoFor10SecondsAndPause() throws InterruptedException{
        YoutubeMainPage youtubeMainPage = new YoutubeMainPage(driver);
        YoutubeSearchPage youtubeSearchPage = youtubeMainPage.doASearchQueryOnMainPage("PageObject pattern");
        YoutubeVideo youtubeVideo = youtubeSearchPage.openFirstSearchResult();
        youtubeVideo.stopVideoPlaybackAfter10Seconds();
    }

    @Test
    public void CommentsSectionTest() throws InterruptedException {
        YoutubeMainPage youtubeMainPage = new YoutubeMainPage(driver);
        YoutubeSearchPage youtubeSearchPage = youtubeMainPage.doASearchQueryOnMainPage("PageObject pattern");
        YoutubeVideo youtubeVideo = youtubeSearchPage.openFirstSearchResult();
        youtubeVideo.goToCommentsSection();
        Thread.sleep(1000);
        youtubeVideo.goToTheBottomOfThePage();
    }

    @After
    public void Finalize() throws InterruptedException {
        //Thread.sleep(5000);
        //driver.quit();
    }
}
