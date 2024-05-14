package suivieDesCommandes;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MiseAJourAutoEtatDeCommande {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");	    
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://dashboard-delivery.trustdev.info");       
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        signIn.submit();
        WebElement Orders =driver.findElement(By.xpath("//span[normalize-space()='Orders']"));
        Orders.click();
        WebElement clickPage5 = driver.findElement(By.xpath("//li[5]//a[1]"));
        clickPage5.click();
        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'›')]"));
        button.click();

           
        WebElement commande = driver.findElement(By.xpath("//tbody/tr[9]/td[1]/div[1]/a[1]/div[1]"));
        commande.click();
        WebElement detailsCommande = driver.findElement(By.xpath("//a[@data-kt-menu-trigger='click']"));
        detailsCommande.click();
        WebElement details = driver.findElement(By.xpath("//tbody//div[@data-kt-menu='true']//div[1]//a[1]"));
        details.click();
        WebElement statusElement = driver.findElement(By.xpath("//span[normalize-space()='Waiting']"));        
        String status = statusElement.getText();
               
        if (status.equals("Waiting")) {
            System.out.println("Le statut de la commande est en attente.");
        } else {
            System.out.println("Le statut de la commande n'est pas en attente.");
        }
        
	}

}
