package letcodepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		
		driver.findElement(By.id("fullName")).sendKeys("Bharti Basumatary");
		driver.findElement(By.id("join")).sendKeys("Teacher");
		driver.findElement(By.id("join")).sendKeys(Keys.TAB);
		 String retrievedTex =driver.findElement(By.id("getMe")).getAttribute("value");
		 driver.findElement(By.id("clearMe")).clear();
		boolean enableStatus =  driver.findElement(By.id("noEdit")).isEnabled();
		if(enableStatus) {
			System.out.println(" Edit Field is in enable state");
		}else {
			System.out.println(" Edit Field is in disable  state ");
		}
		 
		 String readOnlyStatus = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		 if(readOnlyStatus.equals("true")) {
			 System.out.println("Confirm text field is in readonly state ");
			 
		 }else {
			 System.out.println("Confirm text field is not in readonly state");
		 }
		 
		

	}

}
