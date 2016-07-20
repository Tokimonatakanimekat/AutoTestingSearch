package ya.ru;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class YaRuSERPPage {
    private WebDriver driver;
    private WebElement link;

    public YaRuSERPPage(WebDriver driver) {
        this.driver = driver;
    }

    public void activateLinkByTitle(String s) {
        link = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(.,'" + s + "')]")));
        link.click();
    }
}
