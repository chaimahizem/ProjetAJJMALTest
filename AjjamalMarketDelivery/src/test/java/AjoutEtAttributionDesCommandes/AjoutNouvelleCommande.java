package AjoutEtAttributionDesCommandes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjoutNouvelleCommande {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://jamal-market.trustdev.info");
        
        WebElement Login;
        WebElement Email;
        WebElement Password ;
        WebElement SignIn ;
        Login = driver.findElement(By.xpath("//a[@class='login btn-login popup-title']"));
        Login.click();
        Email = driver.findElement(By.xpath("//input[@name='email']"));
        Email.sendKeys("faroukbenabed@gmail.com");
        Password = driver.findElement(By.id("field-password"));
        Password.sendKeys("123456789");
        SignIn = driver.findElement(By.id("submit-login"));
        SignIn.click();
        WebElement fashionOutfits = driver.findElement(By.xpath("//div[@id='memgamenu-form_5285367071259379']//li[3]//a[1]//span[1]"));
	    fashionOutfits.click();
	    WebElement addToCart = driver.findElement(By.xpath("//body[1]/main[1]/section[1]/div[3]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[2]/div[4]/div[3]/form[1]/button[1]"));
	    addToCart.click();
	    WebElement checkOut = driver.findElement(By.xpath("//div[contains(@role,'document')]//div//div//div//div//div//div//a"));
	    checkOut.click();
	    WebElement proceedCheckOut = driver.findElement(By.xpath("//body/main[@id='page']/section[@id='wrapper']/div/div/div[@id='content-wrapper']/section[@id='main']/div/div/div/div/div/a[1]"));
	    proceedCheckOut.click();
	    WebElement clickContinue = driver.findElement(By.xpath("//button[@name='confirm-addresses']"));
	    clickContinue.click();
	    WebElement clickContinue1 = driver.findElement(By.xpath("//button[@name='confirmDeliveryOption']"));
	    clickContinue1.click();
	    WebElement choixDePaiement = driver.findElement(By.xpath("//input[@id='payment-option-1']"));
	    choixDePaiement.click();
	    WebElement approveCondition = driver.findElement(By.xpath("//input[contains(@id,'conditions_to_approve')]"));
	    approveCondition.click();
	    WebElement placeOrder = driver.findElement(By.xpath("//div[@id='payment-confirmation']//div//button[@type='submit']"));
	    placeOrder.click();
	    
	}

}
