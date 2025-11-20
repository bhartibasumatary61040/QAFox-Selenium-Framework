package demoqapack;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubmitDetailsIntoBoxField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
	WebElement fullNameField = 	driver.findElement(By.id("userName"));
	fullNameField.sendKeys("Bharti Basumatary");
	
	WebElement emailField = driver.findElement(By.id("userEmail"));
	
	emailField.sendKeys("bharti12@gmail.com");
	
	WebElement currentAdressField = driver.findElement(By.id("currentAddress"));
	currentAdressField.sendKeys("301 flat no MashaAllah Complex Pune 411014");
	
	 WebElement permanentAdressField =driver.findElement(By.id("permanentAddress"));
	 
	 permanentAdressField.sendKeys("301 flat no MashaAllah Complex Pune 411014");
	 
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
//		
	//NOT COMPLETE 
	 

	}

}
