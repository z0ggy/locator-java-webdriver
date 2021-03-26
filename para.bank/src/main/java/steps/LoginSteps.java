package steps;

import base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps extends BaseUtil {

    private BaseUtil baseUtil;

    public void Steps(BaseUtil util) {
        this.baseUtil = util;
    }

    private WebDriver  driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^I am i the login page of the Para Bank application$")
    public void iAmITheLoginPageOfTheParaBankApplication() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterValidCredentials(String username, String password) {

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("username")).submit();
    }


    @Then("^I should be taken to Overview page$")
    public void iShouldBeTakenToOverviewPage() {
        driver.findElement(By.cssSelector("#leftPanel > ul > li:nth-child(8) > a")).isDisplayed();
        driver.findElement(By.linkText("Log Out")).click();
    }

    @After
    public void quitBrowser(){
        driver.quit();
    }


}
