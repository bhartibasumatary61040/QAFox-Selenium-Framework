package letcodepractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://letcode.in/droppable");
		
	     WebElement sourceBox = driver.findElement(By.id("draggable"));
	        WebElement targetBox=  driver.findElement(By.id("droppable"));

	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(sourceBox,targetBox).perform();
	    }

}
