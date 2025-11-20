package nopcommerce;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoCommercePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//1] is displayed
		
//		boolean statusSearchField = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isDisplayed();
//		
//		System.out.println(statusSearchField);
		
		WebElement searchfield = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		boolean statussearchField = searchfield.isDisplayed();
		System.out.println(statussearchField);
		
		//2] isEnabled()
		
		 boolean statusradioFemaleButton = driver.findElement(By.xpath("//input[@id='gender-male']")).isEnabled();
		 System.out.println(statusradioFemaleButton);
		 
		 
		 //3] isSelected
		 
		  boolean statuscheckBox =driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		  System.out.println("Status of checkbox ="+statuscheckBox);
		  
		  
		 boolean statusradioMaleButton =  driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		System.out.println( "Status of radio male = "+statusradioMaleButton);
		driver.quit();
	}

}
