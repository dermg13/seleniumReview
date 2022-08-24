package _05_basicLocators.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class reviewCSS {
    public static void main(String[] args) {

//        tagAndId();
        tagAndClass();

        /**
         * What are the types of CSS Selectors?
         * 1. tag + id
         * 2. tag + className
         * 3. tag + attribute
         */
    }
    public static void tagAndId(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com/");

        //By id in css selector
        driver.findElement(By.id("activity-checker")).isDisplayed();

        //1. tag + id(#)
        System.out.println(driver.findElement(By.cssSelector("div#activity-checker")).getText());

        //2. tag + attribute
        System.out.println(driver.findElement(By.cssSelector("div[id='activity-checker']")).getText());

        driver.close();
    }

    public static void tagAndClass(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com/");

        //By class in css selector
        System.out.println(driver.findElement(By.className("currency-value")).getText());

        //1. tag + class(.)
        System.out.println("second way " + driver.findElement(By.cssSelector(".currency-value")).getText());

        //2. tag + attribute
        List<WebElement> buttons = driver.findElements(By.cssSelector("p[class='wt-text-title-01 wt-text-center-xs wt-text-truncate--multi-line wt-text-black query-with-image-text wt-mb-xs-1 wt-hide-xs wt-show-lg']"));
        System.out.println(buttons.size());

        for(WebElement each : buttons) {
            System.out.println(each.getText());
        }
        System.out.println("-----Print only Clothing-----");
        System.out.println(buttons.get(2).getText());


        driver.close();
    }
    public static void tadAndAttribute(){

    }
}
