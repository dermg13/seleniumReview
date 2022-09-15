package _13_Xpath2.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review {

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
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        //4. parent -> child
        //5. parent -> all children

        //6. Other: Using asterisk *

        //6. Other: Working with texts
        //starts-with
        //contains


        //6. Other: indexes and last keyword
    }
}
