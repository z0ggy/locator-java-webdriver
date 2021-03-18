package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DuckDuckGoSearchPage extends AbstractPage{

    public final static By searchInput = By.name("q");
    public final static By searchButton = By.id("search_button_homepage");

    public DuckDuckGoSearchPage(WebDriver driver){
        super(driver);
    }

    public void loadPage(){
        getDriver().get("https://www.duckduckgo.com");
    }

    public void  search(String phrase){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(searchInput));
        getDriver().findElement(searchInput).sendKeys(phrase);
        getDriver().findElement(searchButton).sendKeys(phrase);
    }


}
