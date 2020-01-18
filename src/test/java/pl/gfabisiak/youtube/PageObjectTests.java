package pl.gfabisiak.youtube;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectTests {

    public WebDriver driver;

    @Before
    public void Initialize(){
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void Finalize(){
        driver.quit();
    }
}
