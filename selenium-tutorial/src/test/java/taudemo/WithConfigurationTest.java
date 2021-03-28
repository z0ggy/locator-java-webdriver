package taudemo;

import browser.BrowserGetter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class WithConfigurationTest {
    private final BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @Before
    public void beforeAll(){
        driver = browserGetter.getDriver();
    }

    @After
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void justATest() {
        driver.get("https://example.com");
        assertEquals("Example Domain", driver.getTitle());
    }
}
