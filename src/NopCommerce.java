import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerce {
    protected static WebDriver driver;

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        //maximise the browser window screen
        driver.manage().window().fullscreen();
        ///set implicity  wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // open the website
        driver.get("https://demo.nopcommerce.com/");
        // click log in
        driver.findElement(By.className("ico-login")).click();
        // enter eamilid
        driver.findElement(By.className("email")).sendKeys("tanoopatel46@yahoo.co.in");
        //enter password
        driver.findElement(By.id("Password")).sendKeys("Sanvi$");
        //click login
        driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
        //navigate homepage
        driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).click();
        //click macbook
        driver.findElement(By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]")).click();
        // send to friend
        driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        //enter friend email
        driver.findElement(By.id("FriendEmail")).sendKeys("tanoost19@gamil.com");
        // click email
        driver.findElement(By.xpath("//input[@placeholder=\"Enter your email address.\"]")).click();
        // send message
        driver.findElement(By.xpath("//textarea[@class=\"your-email\"]")).sendKeys("check the product");
        // click send
        driver.findElement(By.xpath("//input[@name=\"send-email\"]")).click();

    }
}
