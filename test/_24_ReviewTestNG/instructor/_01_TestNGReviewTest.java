package _24_ReviewTestNG.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _01_TestNGReviewTest {

    /**
     * 1. @Test - Verify title of page
     * 2. @Test (testName = "US001_Verify_Header")
     * 3. @Test (testName = "US002_Verify_Button", description = "Verify button is enabled")
     * 4. @Test (testName = "US003_Verify_subHeader", description = "Verify text is displayed", enabled = false)
     * 5. priority
     * 6. dataProvider
     */

    @Test
    public void testWomenStore(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php?id_category=3&controller=categorywww.cars.com/");
        Assert.assertEquals(driver.getTitle(), "My Store");

        driver.close();
    }

    @Test (testName = "US001-Verify links", description = "Verify links are displayed", priority = -1)
    public void testButton(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php?id_category=3&controller=categorywww.cars.com/");
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='sf-with-ul' and text()='Women']")).isEnabled());


        driver.close();
    }
}
