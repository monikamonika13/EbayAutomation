package ebayActionsAutomate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rightstartautomation {
	public static String clicklink(){
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.rightstart.com/");
	 Actions actions = new Actions(driver);
 WebElement element1 = driver.findElement(By.id("navigation-top-cat-label-336"));
 actions.moveToElement(element1);
 actions.build().perform();
 //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
 WebElement healthcare = driver.findElement(By.xpath(".//*[@id='navigation-top-cat-label-1308']/span"));

 actions.click(healthcare).perform();
 try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
  WebElement thermometer= driver.findElement(By.linkText("Thermometers"));
 actions.click(thermometer).perform();
 String s=driver.getCurrentUrl();
 System.out.println(s);
 return s;
  }
	 
public static void main(String[] args) {
	clicklink();
	
}	
}