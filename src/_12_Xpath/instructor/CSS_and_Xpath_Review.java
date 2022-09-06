package _12_Xpath.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class CSS_and_Xpath_Review {
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
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");

        System.out.println("-------1.tag + attribute------");

        //1. tag + attribute
        // css -> div[class='value']
        // xpath -> //div[@class='value']

        System.out.println(driver.findElement(By.cssSelector("a[class='sf-with-ul']")).getText()); // css
        System.out.println(driver.findElement(By.xpath("//a[@class='sf-with-ul']")).getText()); // xpath

        System.out.println("-------2.tag + attribute + attribute------");

        //2. tag + attribute + attribute
        // css -> div[attr1='value'][attr2='value']
        // xpath -> //div[@attr1='value'][@attr2='value]

        System.out.println(driver.findElement(By.cssSelector("a[class='blockbestsellers']")).getText()); //css
        System.out.println(driver.findElement(By.xpath("//a[@class='blockbestsellers']")).getText()); //xpath

        System.out.println("-------using \"and\" and \"or\" keywords when using 2 attributes------");

        System.out.println(driver.findElement(By.xpath("//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")).getText());
        System.out.println(driver.findElement(By.xpath("(//a[@class='product-name' or contains(@href, 'http://automationpractice.com/index.php?id_product=3&controller=product')])[6]")).getText());


        driver.close();
    }
}
