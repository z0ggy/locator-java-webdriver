package page.object;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class PageObjectWebTest {

    private WebDriver driver;

    @Before
    public void initWebDriver(){
        driver = new ChromeDriver();
    }

    @Test
    public void searchDuckDuckGo() {
        DuckDuckGoSearchPage searchPage = new DuckDuckGoSearchPage(driver);
        searchPage.loadPage();
        searchPage.search("Giant panda");

//        DuckDuckGoResultPage resultPage = new DuckDuckGoResultPage(driver);
//        List<String> linkTexts = resultPage.getResultLinkText();
//
//        for (String text : linkTexts){
//            assertTrue(text.matches("(?i).*panda.*"));
//        }
    }

    @After
    public void quitWebDriver(){
        driver.quit();
    }
}
