package ebayActionsAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayAutomationpage {
	    
	public static  String searchbox(){
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		 Actions actions = new Actions(driver);
WebElement searchbox = driver.findElement(By.id("gh-ac"));
actions.moveToElement(searchbox).click().sendKeys("lap").build().perform();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebElement laptop = driver.findElement(By.xpath("//a[@id='ui-id-597'][@class='ghAC_sugg ui-corner-all']"));
actions.click(laptop).perform();
  String s1= driver.getCurrentUrl();
  return s1;
   
	}

		 
		 
		 
	public static void main(String[] args) {
		EbayAutomationpage.searchbox();
	}

}
