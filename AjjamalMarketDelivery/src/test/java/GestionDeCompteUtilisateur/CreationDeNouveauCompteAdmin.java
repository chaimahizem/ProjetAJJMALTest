package GestionDeCompteUtilisateur;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreationDeNouveauCompteAdmin {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");

	        
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://dashboard-delivery.trustdev.info");        
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
	        signIn.submit();
	        WebElement Users = driver.findElement(By.xpath("//span[normalize-space()='Users']"));
			Users.click();
			WebElement clickCreerNouveauCompte = driver.findElement(By.xpath("//div[@data-kt-user-table-toolbar='base']//button[2]"));
			clickCreerNouveauCompte.click();
			WebElement firstName = driver.findElement(By.xpath("//div[@id='kt_modal_add_user_scroll']//div//div//div//div//input[@placeholder='First name']"));
			firstName.sendKeys("Admin");
			WebElement lastName = driver.findElement(By.xpath("//div[@id='kt_modal_add_user_scroll']//div//div//div//div//input[@placeholder='Last name']"));
			lastName.sendKeys("Test");
			WebElement Gender = driver.findElement(By.xpath("//select[@placeholder='Gender']")); 
			Select select1 = new Select(Gender);
			select1.selectByVisibleText("female");
			WebElement Email = driver.findElement(By.xpath("//input[@placeholder='E-mail']"));
			Email.sendKeys("hvnuo2qmdl@rfcdrive.com");
			WebElement phoneNumber = driver.findElement(By.xpath("//div[@id='kt_modal_add_user_scroll']//div//div//input[@placeholder='Phone number']"));
			phoneNumber.sendKeys("0939857556");
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement clickNextStep = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='kt_modal_add_user']//button[2]")));
			clickNextStep.click();	
			
			WebElement addressLine1 = driver.findElement(By.xpath("//input[@placeholder='Type your full addres here']"));
			addressLine1.sendKeys("Tripoli University, Tripoli University Road, Tripoli, Libye");
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='my-typeahead-item-0']//mark")));
	        element.click();					
			WebElement Optional = driver.findElement(By.xpath("//input[@placeholder='Address Line 2']"));
			Optional.sendKeys("Tripoli");
			WebElement City = driver.findElement(By.xpath("//input[@placeholder='City']"));
			City.sendKeys("Tarabulus");
			WebElement Country = driver.findElement(By.xpath("//input[@placeholder='Country']"));
			Country.sendKeys("Libye");
			WebElement stateRegion = driver.findElement(By.xpath("//input[@placeholder='State/Region']"));
			stateRegion.sendKeys("Tarabulus");
			WebElement zipCode = driver.findElement(By.xpath("//input[@placeholder='Zip code']"));
			zipCode.sendKeys("9191");
			WebElement clickNextStep1 = driver.findElement(By.xpath("//div[@id='kt_modal_add_user']//button[2]"));
			clickNextStep1.click();
			
			WebElement Status = driver.findElement(By.xpath("//select[@placeholder='Status']"));
			Select select2 = new Select(Status);
			select2.selectByVisibleText("Enabled");
			WebElement Role = driver.findElement(By.xpath("//div[@id='kt_modal_add_user_scroll']//div//div//select[@placeholder='Role']"));
			Select select3 = new Select(Role);
			select3.selectByVisibleText("ROLE_ADMIN");			
			WebElement clickNextStep2 = driver.findElement(By.xpath("//div[@id='kt_modal_add_user']//button[2]"));
			clickNextStep2.click();
			WebElement Submit = driver.findElement(By.xpath("//div[@id='kt_modal_add_user']//button[2]"));
			Submit.click();
			
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement successPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='alert-heading']")));	   
		        if (successPopup.isDisplayed()) {
		            System.out.println("La création de compte est réussie. Le pop-up de succès est affiché.");
		        } else {
		            System.out.println("La création de compte est réussie, mais le pop-up de succès n'est pas affiché.");
		        }
		        
		        
		        
		        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement administrateurElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]/div[1]/div[1]")));
		        String administrateurNom = "AdminTest";
		        if (administrateurElement.isDisplayed()) {
		            System.out.println("L'administrateur " + administrateurNom + " est présent dans la liste des utilisateurs.");
		        } else {
		            System.out.println("L'administrateur " + administrateurNom + " n'est pas présent dans la liste des utilisateurs.");
		        }

			
			
			
			

			
	}

}
