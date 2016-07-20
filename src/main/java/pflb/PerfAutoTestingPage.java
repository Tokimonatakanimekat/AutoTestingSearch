package pflb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.PrintWriter;
import java.util.ArrayList;

public class PerfAutoTestingPage {

    private WebDriver driver;

    public PerfAutoTestingPage(WebDriver driver){
        this.driver = driver;
    }

    public void textSave(String fileId){
        ArrayList<WebElement> tags = new ArrayList<WebElement>(driver.findElements(By.xpath("//*[@id=\"post-124\"]/div/*")));

        try {
            PrintWriter writer = new PrintWriter("C://OUTPUT"+ fileId +".txt", "UTF-8");
            for (WebElement elem : tags) {
                writer.print(elem.getText() + System.getProperty("line.separator"));
            }
            writer.close();
        } catch (Exception e){}
    }
}
