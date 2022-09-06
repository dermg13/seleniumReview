package _12_Xpath.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class xpathPractice_solved {
    public static void main(String[] args) {
        //Task: In the footer of the page. Find and print out elements under Information section.
        // Steos:
        // List<Webelement>
        // Find xpath to locate all 8 elements
        // to print, we need a for each loop

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");

        List<WebElement> infoBtns = driver.findElements((By.xpath("(//ul[@class='toggle-footer'])[1]")));

        for(WebElement each: infoBtns) {
            System.out.println(each.getText());
        }


        driver.close();

    }
}
