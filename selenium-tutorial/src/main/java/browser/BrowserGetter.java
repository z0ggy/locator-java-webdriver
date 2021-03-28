package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

import static java.lang.System.setProperty;

public class BrowserGetter {

    public WebDriver getWinChromeDriver() {
        setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver getChromeDriver() {

        return getWinChromeDriver();
    }

    public WebDriver getDriver() {
        return switch (System.getProperty("browser").toLowerCase()) {
            case "chrome" -> getChromeDriver();
            case "firefox" -> getChromeDriver();
            default -> throw new RuntimeException("Unsupported browser");
        };
    }
}
