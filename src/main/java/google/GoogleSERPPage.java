package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSERPPage{
    private WebDriver driver;

    public GoogleSERPPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickResult(String s) {
        WebElement link = (new WebDriverWait(driver,10).
                until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#rso > div.g > div > div > h3 > a"))));
        System.out.println(link.isDisplayed());
        link.click();
    }
}
