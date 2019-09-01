import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeRegister {
    protected static WebDriver driver;

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //maximine browser the window screen
        driver.manage().window().fullscreen();
        //set implicity wait for driver objects
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //open the website
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Enter username
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        //Enter password
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        //click login
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        // click admin
        driver.findElement(By.className("panelTrigger")).click();
        //click logout
        driver.findElement(By.linkText("Logout")).click();








}
}
