package tests;

import google.*;
import ya.ru.*;
import bing.*;
import pflb.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

public class SearchAndSaveTest {

    private WebDriver driver;

    private void tabSwitch(){
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.close();
        driver.switchTo().window(tabs.get(tabs.size()-1));
    }

    @Before
    public void setupTests(){
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void YaSearchPerfTest(){
        YaRuSearchPage yaRuSearchPage = new YaRuSearchPage(driver);
        yaRuSearchPage.searchText("Перфоманс Лаб").activateLinkByTitle("Перфоманс Лаб");
        tabSwitch();
        PerfHomePage perfHomePage = new PerfHomePage(driver);
        perfHomePage.showServiceSubmenu();
        PerfAutoTestingPage perfAutoTestingPage = perfHomePage.clickMenuAutoTestLink();
        perfAutoTestingPage.textSave("_1");
    }

    @Test
    public void GoogleSearchPerfTest(){
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.searchText("Перфоманс Лаб").activateLinkByTitle("Перфоманс Лаб");
        tabSwitch();
        PerfHomePage perfHomePage = new PerfHomePage(driver);
        perfHomePage.showServiceSubmenu();
        PerfAutoTestingPage perfAutoTestingPage = perfHomePage.clickMenuAutoTestLink();
        perfAutoTestingPage.textSave("_2");
    }

    @Test
    public void BingSearchPerfTest(){
        BingSearchPage bingSearchPage = new BingSearchPage(driver);
        bingSearchPage.searchText("Перфоманс Лаб").activateLinkByTitle("Перфоманс Лаб");
        PerfHomePage perfHomePage = new PerfHomePage(driver);
        perfHomePage.showServiceSubmenu();
        PerfAutoTestingPage perfAutoTestingPage = perfHomePage.clickMenuAutoTestLink();
        perfAutoTestingPage.textSave("_3");
    }

    @After
    public void cleanStuff(){
        driver.close();
    }
}
