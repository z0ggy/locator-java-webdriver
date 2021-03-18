package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DuckDuckGoResultPage extends AbstractPage{

    public final static By resultLink = By.cssSelector("div.results_links_deep .result__a");

    public DuckDuckGoResultPage(WebDriver driver){
        super(driver);
    }

    public List<String> getResultLinkText(){
        List<String> resultText = new ArrayList<>();
        List<WebElement> resultLinks = getDriver().findElements(resultLink);
        for (WebElement link : resultLinks){
            resultText.add(link.getText());
        }
        return resultText;
    }

}
