package letcodepractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		WebElement pageHeadingElement = driver.findElement(By.xpath("//h1[contains(@class,'has-text-centered')]"));
		 String pageHeadingText = pageHeadingElement.getText();
		 System.out.println(pageHeadingText);
		 
		  driver.switchTo().frame("firstFr");
		WebElement  pagSubHeading = driver.findElement(By.xpath("//h1[@class='title']"));
		String pagSubHeadingText = pagSubHeading.getText();
		 System.out.println(pagSubHeadingText);
		 
		 
		WebElement firstNameField =  driver.findElement(By.name("fname"));
		firstNameField .sendKeys("Bharti");
		 
		WebElement lastNameField = driver.findElement(By.name("lname"));
		 
		lastNameField .sendKeys("Basumatary");
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Basumatary')]")));
		 
		 String message = element.getText();
		 System.out.println(message);
		 
//		WebElement childFrameElement = driver.findElement(By.xpath("//iframe[@src='innerframe']"));
//		
//		driver.switchTo().frame(childFrameElement);
		 
		 driver.switchTo().frame(1);
		
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("a@b.com");
		emailField.clear();
		driver.switchTo().parentFrame();
		
		firstNameField = driver.findElement(By.name("fname"));
		firstNameField.clear();
		 lastNameField = driver.findElement(By.name("lname"));
		lastNameField.clear();
		pagSubHeading= driver.findElement(By.xpath("//h1[@class='title']"));
		pagSubHeadingText =pagSubHeading.getText();
		System.out.println(pagSubHeadingText);
		
		driver.switchTo().defaultContent();
		pageHeadingElement= driver.findElement(By.xpath("//h1[contains(@class,'has-text-centered')]"));
		pageHeadingText = pageHeadingElement.getText();
		System.out.println(pageHeadingText);
	
		 driver.quit();
	}

}
