import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeDemo {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.edge.driver","Driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        // Launch the URL.
        driver.get(baseUrl);
        // Maximise Window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get the title of the page in console
        String title = driver.getTitle();
        System.out.println(title);

        // Get current URl
        driver.getCurrentUrl();
        System.out.println("Current URL = " +driver.getCurrentUrl());

        // Get current URl (Login Functionality)
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
        System.out.println("Current URL = " +driver.getCurrentUrl());
        // Fiend the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("xyz@gmail.com");
        // Fiend the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        //  Sending Password to password field element
        passwordField.sendKeys("XYZ123456");
        driver.getPageSource();
        System.out.println("Page Source =" + driver.getPageSource());

        //Close the browser automatically
        driver.close();

    }
}
