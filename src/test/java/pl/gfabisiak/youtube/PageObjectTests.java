package pl.gfabisiak.youtube;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.gfabisiak.youtube.PageObjects.YoutubeMainPage;

public class PageObjectTests {

    public WebDriver driver;

    @Before
    public void Initialize(){
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void OpenYoutubeMainPage(){
        YoutubeMainPage youtubeMainPage = new YoutubeMainPage(driver);
    }

    @After
    public void Finalize(){
        driver.quit();
    }
}
