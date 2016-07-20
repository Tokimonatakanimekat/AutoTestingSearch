package google;

import org.openqa.selenium.*;


public class GoogleSearchPage {

    private WebDriver driver;

    public GoogleSearchPage(WebDriver drv){
        this.driver = drv;
        driver.get("http://google.com");
    }

    public GoogleSERPPage searchText(String s){
        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys(s);
        q.sendKeys(Keys.ENTER);
        return new GoogleSERPPage(driver);
    }
}
