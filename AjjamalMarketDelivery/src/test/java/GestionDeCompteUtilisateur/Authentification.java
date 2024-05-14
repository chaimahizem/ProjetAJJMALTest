package GestionDeCompteUtilisateur;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Authentification {

    public static void main(String[] args) {

    
        System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
    
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://dashboard-delivery.trustdev.info");       
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        signIn.submit();
    }
}
