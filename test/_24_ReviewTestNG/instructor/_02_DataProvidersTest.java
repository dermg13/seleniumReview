package _24_ReviewTestNG.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _02_DataProvidersTest {

    @Test
    public void verifyTitle(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/webtables");
        Assert.assertEquals(driver.getTitle(), "ToolsQA");

        driver.close();
    }

    //fill out form

    //add

    //verify if email is displayed as expected
}
