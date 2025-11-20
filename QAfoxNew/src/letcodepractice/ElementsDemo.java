package letcodepractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/elements");
		
		WebElement userNameField = driver.findElement(By.name("username"));
		userNameField.sendKeys("https://github.com/bhartibasumatary61040");
		
		 WebElement searchButton = driver.findElement(By.id("search"));
		 searchButton.click();
	}

}
