package taudemo;

import browser.BrowserGetter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class SeleniumTest {
    private final BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @Before
    public void beforeAll() {
        driver = browserGetter.getDriver();
    }

    @After
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void openTheComPageAndTestTheTitle() {
        String expectedComTitle = "Example Domain";
        driver.get("https://www.example.com");
        assertEquals(expectedComTitle, driver.getTitle());
    }

    @Test
    public void openTheOrgPageAndTestTheTitle() {
        String expectedOrgTitle = "Example Domain";
        driver.get("https://www.example.org");
        assertEquals(expectedOrgTitle, driver.getTitle());
    }
}
