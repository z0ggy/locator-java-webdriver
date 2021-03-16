package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    private WebDriver  driver;

    @Given("^I am i the login page of the Para Bank application$")
    public void iAmITheLoginPageOfTheParaBankApplication() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("^I enter valid credentials$")
    public void iEnterValidCredentials() {
        driver.findElement(By.name("username")).sendKeys("Dominik");
        driver.findElement(By.name("password")).sendKeys("qwerty");
        driver.findElement(By.name("username")).submit();

    }

    @Then("^I should be taken to Overview page$")
    public void iShouldBeTakenToOverviewPage() {
        driver.findElement(By.cssSelector("#leftPanel > ul > li:nth-child(8) > a")).isDisplayed();
        driver.findElement(By.linkText("Log Out")).click();
    }
}
