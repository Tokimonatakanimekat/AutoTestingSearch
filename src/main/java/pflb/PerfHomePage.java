package pflb;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class PerfHomePage {
    private WebDriver driver;
    Actions pageActions;

    public PerfHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void showServiceSubmenu() {
        pageActions = new Actions(driver);
        WebElement serviceMenuItem = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"menu-item-317\"]")));
        pageActions.moveToElement(serviceMenuItem).perform();
    }

    public PerfAutoTestingPage clickMenuAutoTestLink(){
        WebElement link = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"nav_top\"]/div[1]/div/li[1]/ul/li[3]/a")));
        link.click();
        return new PerfAutoTestingPage(driver);
    }
}
