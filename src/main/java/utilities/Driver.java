package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {



    private static WebDriver driver;


    public static WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


     return driver;
    }

    public static void tearDown(){

        driver.quit();

    }



}
