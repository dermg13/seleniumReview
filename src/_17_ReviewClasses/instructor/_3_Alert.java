package _17_ReviewClasses.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_Alert {
    /**
     * Alert cannot be identified using inspect tools
     * Cannot write xpaths for alers
     * It is not a Window
     * If alert is not handled it throws UnhandledAlertException
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

    }
}
