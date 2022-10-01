package _24_ReviewTestNG.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _02_DataProvidersTest extends _02_DataProvider{

    @Test
    public void verifyTitle(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/webtables");
        Assert.assertEquals(driver.getTitle(), "ToolsQA");

        driver.close();
    }

    @Test (testName = "US001-Verify email", description = "When user fills out form, verfiy email is displayed", dataProvider = "formData")
    public void testEmail(String firstName, String lastName, String userEmail, String age, String salary, String department){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/webtables");

        //click add button
        driver.findElement(By.xpath("//button[text()='Add']")).click();


        //fill out form
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("userEmail")).sendKeys(userEmail);
        driver.findElement(By.id("age")).sendKeys(age);
        driver.findElement(By.id("salary")).sendKeys(salary);
        driver.findElement(By.id("department")).sendKeys(department);

        //click submit button
        driver.findElement(By.id("submit")).click();

        //Verify emails are displayed
        List<WebElement> emails = driver.findElements(By.xpath("//div[@class='rt-td'][4]"));
        for(int i = 4; i > emails.size(); i--) {
            Assert.assertEquals(emails.get(i).getText(),userEmail);
        }
    }
}
