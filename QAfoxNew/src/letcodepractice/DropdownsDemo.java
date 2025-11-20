package letcodepractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		 WebElement fruitDropdownField = driver.findElement(By.id("fruits"));
		Select select = new Select(fruitDropdownField);
		select.selectByVisibleText("Apple");
		
		 WebElement superHerosField = driver.findElement(By.id("superheros"));
		 select = new Select(superHerosField);
		 
		 if(select.isMultiple()) {
			 select.selectByVisibleText("Ant-Man");
			 select.selectByVisibleText("The Avengers");
			 select.selectByVisibleText("Batman");
			 select.selectByVisibleText("Daredevil");
			 select.selectByVisibleText("Elektra");
		 }
		 
		 WebElement languageField= driver.findElement(By.id("lang"));
		 select= new Select(languageField);
		List<WebElement> options = select.getOptions();
		int noOfOptions = options.size();
		 int lastOptionIndex = noOfOptions-1;
		 select.selectByIndex(lastOptionIndex);
		 
		 for(WebElement option : options) {
			 System.out.println(option.getText());
			 
		 }
		 
		WebElement countriesField =  driver.findElement(By.id("country"));
		select= new Select(countriesField);
		
		select.selectByValue("India");
		
		System.out.println(select.getFirstSelectedOption().getText());
		
		
		Thread.sleep(5000);
		driver.quit();
		
	

	}

}
