package pl.gfabisiak.youtube;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HelperFunctions {

    public void HighlightElement(WebDriver driver, WebElement element)
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }

    public void ScrollToTheBottomOfThePage(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void ScrollIntoView(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void MoveToElementUsingActions(WebDriver driver, WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }
}
