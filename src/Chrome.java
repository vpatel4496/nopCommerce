import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Launch the URL.
        driver.get(baseUrl);
        // Maximise Window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Get the title of the page in console
        String title = driver.getTitle();
        System.out.println(title);
        // Get current URl
        driver.getCurrentUrl();
        System.out.println("Current URL =" + driver.getCurrentUrl());
        // Find the email field element
        WebElement emailfield = driver.findElement(By.id("Email"));
        emailfield.sendKeys("xyz@gmail.com");
        // FFind the password field element
        WebElement passwordfield = driver.findElement(By.name("Password"));
        // Sending password to password field
        passwordfield.sendKeys("Xyz12345@");
        driver.getPageSource();
        System.out.println("Page Source =" + driver.getPageSource());
        //Close the browser automatically
        driver.close();


    }

}
