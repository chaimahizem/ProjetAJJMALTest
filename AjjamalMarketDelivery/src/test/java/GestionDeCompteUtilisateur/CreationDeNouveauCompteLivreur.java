package GestionDeCompteUtilisateur;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreationDeNouveauCompteLivreur {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dashboard-delivery.trustdev.info");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		signIn.submit();
		WebElement Drivers = driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[3]/a/span[2]"));
		Drivers.click();
		WebElement CreerNouveauCompte = driver.findElement(By.xpath("//button[@class='btn btn-design btn-icon']"));
		CreerNouveauCompte.click();
		WebElement FirstName = driver.findElement(By.xpath("//div[@class='fv-row mb-7']//input[@placeholder='First name']"));
		FirstName.sendKeys("Ahmad");
		WebElement LastName = driver.findElement(By.xpath("//div[@class='fv-row mb-7']//input[@placeholder='Last name']"));
		LastName.sendKeys("mrad");
		WebElement dropdown = driver.findElement(By.xpath("//select[@placeholder='Gender']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("male");
		WebElement Email = driver.findElement(By.xpath("//input[@placeholder='E-mail']"));
		Email.sendKeys("txv0r4jvux@pirolsnet.com");
		WebElement PhoneNumber = driver.findElement(By.xpath("//div[@class='fv-row mb-7']//input[@placeholder='Phone number']"));
		PhoneNumber.sendKeys("0931637485");
		WebElement DeliveryType = driver.findElement(By.xpath("//select[@placeholder='Delivery Type']"));
		Select select2 = new Select(DeliveryType);
		select2.selectByVisibleText("Car");
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement NextStep = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-design']")));
		NextStep.click();
		WebElement AdressLine1 = driver.findElement(By.xpath("//input[@placeholder='Type your full addres here']"));
		AdressLine1.sendKeys("Libya Toys, Salah Aldeen - Qaser Bin Ghashir Road, طرابلس، Libye");
		WebElement AdressFind = driver.findElement(By.xpath("//a[@id='my-typeahead-item-0']"));
		AdressFind.click();
		WebElement City = driver.findElement(By.xpath("//input[@placeholder='City']"));
		City.sendKeys("Tripoli");
		WebElement Country = driver.findElement(By.xpath("//input[@placeholder='Country']"));
		Country.sendKeys("Lybie");
		WebElement StateRegion = driver.findElement(By.xpath("//input[@placeholder='State/Region']"));
		StateRegion.sendKeys("Tripoli");
		WebElement ZipCode = driver.findElement(By.xpath("//input[@placeholder='Zip code']"));
		ZipCode.sendKeys("75002");
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement NextStep2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='kt_modal_add_user']//button[2]")));
		NextStep.click();
		WebElement Status = driver.findElement(By.xpath("//select[@placeholder='Status']"));
		Select select3 = new Select(Status);
		select3.selectByVisibleText("Enabled");
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement driverarea = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body//div[@id='root']//div[@id='kt_modal_add_user_scroll']//div//div//div//div//div//div[2]")));
		driverarea.click();
		WebElement option = driver.findElement(By.xpath("//body//div[@id='root']//div[@id='kt_modal_add_user_scroll']//div//div//div//div//div//div//div[1]"));
		option.click();
		WebElement idNumber = driver.findElement(By.xpath("//input[@placeholder='ID number']"));
		idNumber.sendKeys("123");
		WebElement typeOfId = driver.findElement(By.xpath("//select[@placeholder='Type of ID']"));
		Select select5 = new Select(typeOfId);
		select5.selectByVisibleText("ID card");
		WebElement licenseNumber = driver.findElement(By.xpath("//input[@placeholder='License Number']"));
		licenseNumber.sendKeys("ABC123456");
		WebElement placeOfIssuance = driver.findElement(By.xpath("//input[@placeholder='Place of issuance']"));
		placeOfIssuance.sendKeys("Tripoli");
		WebElement licenseExpirationDate = driver.findElement(By.xpath("//input[@placeholder='License expiration date']"));
		licenseExpirationDate.sendKeys("2025-12-31");
		WebElement technicalInspection = driver.findElement(By.xpath("//input[@placeholder='Technical inspection']"));
		technicalInspection.sendKeys("Passed");
		WebElement insuranceNumber = driver.findElement(By.xpath("//input[@placeholder='Insurance Number']"));
		insuranceNumber.sendKeys("XYZ987654");
		WebElement plateNumber = driver.findElement(By.xpath("//input[@placeholder='Plate number']"));
		plateNumber.sendKeys("LY-1234");
		WebElement pollLicense = driver.findElement(By.xpath("//input[@placeholder='Poull License']"));
		pollLicense.sendKeys("Active");
		WebElement nextStep3 = driver.findElement(By.xpath("//div[@id='kt_modal_add_user']//button[2]"));
		nextStep3.click();
		WebElement clickSubmit = driver.findElement(By.xpath("//div[@id='kt_modal_add_user']//button[2]"));
		clickSubmit.click();
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement successPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mb-lg-10 alert alert-success']")));	   
	        if (successPopup.isDisplayed()) {
	            System.out.println("La création de compte est réussie. Le pop-up de succès est affiché.");
	        } else {
	            System.out.println("La création de compte est réussie, mais le pop-up de succès n'est pas affiché.");
	        }
	        
	        
	        
	        WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement livreurElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kt_table_users\"]/tbody/tr[1]/td[2]/div/a/div")));
	        String livreurNom = "Ahmadmrad";
	        if (livreurElement.isDisplayed()) {
	            System.out.println("Le livreur " + livreurNom + " est présent dans la liste des chauffeurs.");
	        } else {
	            System.out.println("Le livreur " + livreurNom + " n'est pas présent dans la liste des chauffeurs.");
	        }


	}

}
