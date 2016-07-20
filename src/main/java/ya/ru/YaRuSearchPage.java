package ya.ru;

import org.openqa.selenium.*;

public class YaRuSearchPage {

    private WebDriver driver;

    public YaRuSearchPage(WebDriver drv){
        this.driver = drv;
        driver.get("https://ya.ru");
    }

    public YaRuSERPPage searchText(String s){
        WebElement searchbox = driver.findElement(By.name("text"));
        searchbox.sendKeys(s);
        searchbox.sendKeys(Keys.ENTER);
        return new YaRuSERPPage(driver);
    }
}
