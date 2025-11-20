package letcodepractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ShadowDomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/shadow");
		
		  WebElement shadowHost1 =  driver.findElement(By.id("open-shadow"));
	       SearchContext sc =  shadowHost1.getShadowRoot();

	      WebElement firstName  =  sc.findElement(By.cssSelector("#fname"));
	      firstName.sendKeys("Bharati");

	        Actions actions = new Actions(driver);
	        actions.sendKeys(Keys.TAB).sendKeys("Basumatary")
	                .sendKeys(Keys.TAB).sendKeys("bharatibasumatary61040@gmail.com").build().perform();
	}

}
