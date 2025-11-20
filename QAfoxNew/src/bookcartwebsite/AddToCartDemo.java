package bookcartwebsite;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AddToCartDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bookcart.azurewebsites.net/");
		
	List<WebElement> categories =	driver.findElements(By.xpath(" //mat-list-item[@routerlink='/filter']//span[@class='mdc-list-item__content']"));
	
	int size = categories.size();
	for(int i = 1; i<=size; i++) {
		
	String xpathText = "(//mat-list-item[@routerlink='/filter']//span[@class='mdc-list-item__content'])["+i+"]";
	 WebElement category =	driver.findElement(By.xpath(xpathText));
	 category.click();		
	}
	
	for(WebElement category:categories) {
		category.click();	
		WebElement firstBook =driver.findElement(By.xpath("(//mat-card[contains(@class,'book-card')]/a)[1]"));
		firstBook.click();
		
		WebElement addToCartButton =driver.findElement(By.xpath("(//span[contains(text(),' Add to Cart')])[1]"));
		
		addToCartButton.click();
		driver.navigate().back();
	}
	
	driver.navigate().refresh();

	}

}
