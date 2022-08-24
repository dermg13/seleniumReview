package _05_basicLocators.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reviewLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /**
         * What are the selenium locators?
         * 1. id  - Unique
         * 2. name
         * 3. className
         * 4. tagName
         * 5. linkText
         * 6. partialLinkText
         * 7. css
         * 8. xpath
         */

        driver.get("https://www.etsy.com/");

        //using id -- this has no text
        System.out.println(driver.findElement(By.id("google-one-tap-modal-div")).getText());

        // using className
        System.out.println(driver.findElement(By.className("wt-display-table-cell")).getText());

        //using tagName
        System.out.println(driver.findElement(By.tagName("span")).getText());

        //using linkText
        System.out.println(driver.findElement(By.linkText("Personalized Gifts")).getText());

        //using partialLinkText
        System.out.println(driver.findElement(By.partialLinkText("Personalized")).getText());

        driver.close();
    }
}
