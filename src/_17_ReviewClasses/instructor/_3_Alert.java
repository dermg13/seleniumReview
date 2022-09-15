package _17_ReviewClasses.instructor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_Alert {
    /**
     * Alert cannot be identified using inspect tools
     * Cannot write xpaths for alerts
     * It is not a Window
     * If alert is not handled it throws UnhandledAlertException
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        Thread.sleep(3000);
        alert.accept();

        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(5000);

        Alert alert2 = driver.switchTo().alert();

        System.out.println(alert2.getText());
        Thread.sleep(3000);
        alert2.accept();


        driver.close();



    }
}
