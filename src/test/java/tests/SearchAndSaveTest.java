package tests;

import google.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndSaveTest {

    private WebDriver driver;

    @Before
    public void setupTests(){
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void GoogleSearchPerfTest(){
        GoogleSearchPage page = new GoogleSearchPage(driver);
        GoogleSERPPage page2 = page.searchText("Перфоманс Лаб");
        page2.clickResult("sss");
    }
}
