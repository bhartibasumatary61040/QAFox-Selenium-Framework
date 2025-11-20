package selectorhubpack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PartOneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement email = driver.findElement(By.name("email"));
		
		email.sendKeys("bharti@gmail.com");
		
		 WebElement passwordField = driver.findElement(By.id("pass"));
		 passwordField.sendKeys("12345");
		 
		 
		 WebElement companyNameField = driver.findElement(By.name("company"));
		 companyNameField.sendKeys("ABC");
		 
		   WebElement mobileNumberField = driver.findElement(By.name("mobile number"));
	       mobileNumberField.sendKeys("8793782678");
	       
	       WebElement submitButton =  driver.findElement(By.xpath("//button[text()='Submit']"));
	       submitButton.click();
	     }

	}


