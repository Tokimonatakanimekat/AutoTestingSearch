package bing;

import org.openqa.selenium.*;


public class BingSearchPage {

    private WebDriver driver;

    public BingSearchPage(WebDriver drv){
        this.driver = drv;
        driver.get("https://www.bing.com/");
    }

    public BingSERPPage searchText(String s){
        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys(s);
        q.sendKeys(Keys.ENTER);
        return new BingSERPPage(driver);
    }
}
