import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Test {

    protected static WebDriver driver;

    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver", "src/BrowserDriver/chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //maximise the browser window screen
        driver.manage().window().fullscreen();
        //set implicity  wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //open the website
        driver.get("https://demo.nopcommerce.com/");

        //click on register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //enter firstname
        driver.findElement(By.id("FirstName")).sendKeys("Tanu");

        //enter lastname
        driver.findElement(By.xpath("//input[@name ='LastName']")).sendKeys("Patel");

        //enter email
        driver.findElement(By.name("Email")).sendKeys("tanoopatel46@yahoo.co.in");
        // Enter password
        driver.findElement(By.id("Password")).sendKeys("Sanvi$");
        //Enter Confirm password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Sanvi$");
        // click on register
        driver.findElement(By.name("register-button")).click();
        //exit


        





    }

}
