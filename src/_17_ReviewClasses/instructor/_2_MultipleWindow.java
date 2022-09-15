package _17_ReviewClasses.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class _2_MultipleWindow {
    /**
     * Use driver.getWindowHandle();
     * Create object to capture current window: GU ID (Global Unique Identifier)
     * Switch to windows
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/browser-windows");

        String mainWindowID = driver.getWindowHandle();
        System.out.println(mainWindowID);

        driver.findElement(By.id("tabButton")).click();

        Set<String> allWindowIDS = driver.getWindowHandles();
        for(String each : allWindowIDS){
            if(!each.equals(mainWindowID))
                driver.switchTo().window(each);

        }
        Thread.sleep(3000);
        driver.close();

        //return to main page
        driver.switchTo().window(mainWindowID);
        System.out.println(driver.getTitle());

        driver.quit();


    }
}
