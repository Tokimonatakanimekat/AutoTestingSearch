package bing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BingSERPPage {
    private WebDriver driver;
    private WebElement link;

    public BingSERPPage(WebDriver driver) {
        this.driver = driver;
    }

    public void activateLinkByTitle(String s) {
        link = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(.,'" + s + "')]")));
        link.click();
    }
}
