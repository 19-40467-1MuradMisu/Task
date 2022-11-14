package net.timeandtraining.automation;

//import net.timeandtraining.automation.FileReaderDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Barikoi {

	public static void main(String[] args) throws Exception {
	 
	WebDriver driver=Base.getdriver();
	driver.get("https://www.barikoi.com/api");
	WebElement element=driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul/li[5]/div/a"));
	element.click();
	// for clicking any object
	
	
    element=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/form/div/input"));
	element.sendKeys(" Barikoi HQ (Barikoi.com )");
	
	driver.findElement(By.tagName("body")).sendKeys(Keys.ENTER);
	
	Thread.sleep(10000);
	driver.quit();
	
 
	
	
}
}
