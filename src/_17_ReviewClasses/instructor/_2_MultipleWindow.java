package _17_ReviewClasses.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_MultipleWindow {
    /**
     * Use driver.getWindowHandle();
     * Create object to capture current window: GU ID (Global Unique Identifier)
     * Switch to windows
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");

    }
}
