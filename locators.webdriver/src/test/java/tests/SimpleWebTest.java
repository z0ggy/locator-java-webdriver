package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;
import java.util.regex.*;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class SimpleWebTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public  void initWebdriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
    }

    @Test
    public void searchDuckDuckGo(){
        //Load the page
        driver.get("https://duckduckgo.com/");

        //Enter search phrase
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("giant panda");

        //Click search button
        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
        searchButton.click();

        //Wait for result to appear
        wait.until(ExpectedConditions.titleContains("giant panda"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.results_links_deep .result__a")));

        //Make sure each result contains the world "panda"
        List<WebElement> resultLinks = driver.findElements(By.cssSelector("div.results_links_deep .result__a"));
        for (WebElement link : resultLinks){
            System.out.println(link.getText());
            assertTrue(link.getText().matches("(?i).*panda.*"));
        }
    }

    @After
    public void quitWebdriver(){
        driver.quit();
    }
}
