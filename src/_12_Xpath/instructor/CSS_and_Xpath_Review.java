package _12_Xpath.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_and_Xpath_Review {
    /**
     * Review CSS and Xpath
     * 1. tag + attribute
     * 2. tag + attribute + attribute
     * 3. using "and" and "or" keywords when using 2 attributes
     * 4. parent -> child
     * 5. parent -> all children
     * 6. Other xpath features
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(" ");
    }
}
