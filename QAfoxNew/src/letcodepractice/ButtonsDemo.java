package letcodepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/button");
		
		WebElement gohomeButton = driver.findElement(By.id("home"));
		
		gohomeButton.click();
		
		driver.navigate().back();
		
		WebElement findLocationButton = driver.findElement(By.id("position"));
		 Point point = findLocationButton.getLocation();
		 System.out.println(point.getX());
		 System.out.println(point.getY());
		 
		WebElement colorButton =  driver.findElement(By.id("color"));
		
	String buttonColor = 	colorButton.getCssValue("background-color");
	
		
		System.out.println(buttonColor);
		
		WebElement findHightWidthButton =driver.findElement(By.id("property"));
		Dimension d = findHightWidthButton.getSize();
		System.out.println(d.height);
		System.out.println(d.width);
		
		WebElement disableButton = driver.findElement(By.id("isDisabled"));
		boolean status= disableButton.isEnabled();
		System.out.println(status);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Actions actions = new Actions(driver);
		 WebElement holdButton = driver.findElement(By.xpath("//button[@class='button is-primary'][@id='isDisabled']"));
		actions.moveToElement(holdButton).clickAndHold(holdButton).build().perform();
		Thread.sleep(3000);
		actions.release().perform();
		driver.quit();
		

	}

}
