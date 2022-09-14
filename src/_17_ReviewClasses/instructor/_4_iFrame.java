package _17_ReviewClasses.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4_iFrame {
    /**
     * iFrames are windows inside the window
     * It has links to external sites
     * iFrames can be nested
     * Has "iframe" tag name
     * To access contents of iFrame, you have to switch the window
     *
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

    }
}