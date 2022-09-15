package _17_ReviewClasses.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _1_Select {
    /**
     * Select class can be used when there is "select" tag name
     * It allows web elements to be found that are not visibly seen
     * Great way to resolve dropdown menu
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");

        Select select = new Select(driver.findElement(By.id("make-model-search-stocktype")));

        //select by text
        select.selectByVisibleText("New cars");

        //select by index
        select.selectByIndex(4);

        //select by value
        select.selectByValue("used");

        //get all selectable options
        List<WebElement> allOptions = select.getOptions();
//        allOptions.forEach(each -> System.out.println(each.getText()));

        for(WebElement each : allOptions) {
            System.out.println(each.getText());
        }

        Thread.sleep(5000);
        driver.close();
    }
}

