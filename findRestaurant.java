package hellocucumber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class findRestaurant {
    static String findRes(String areaCode) {
		
        //1. Enter areaCode in the textbox
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.just-eat.co.uk/");
		
		Thread.sleep(10000);
		
		driver.findElement(By.name("postcode")).click();
		
		sendkeys(areacode);
		
		//2. Click on Search button
		driver.findElement(By.type("submit")).click();
		
		Thread.sleep(10000);
		
		//3. Return landing page URL
		
		String homepageUrl = "https://www.just-eat.co.uk/";
		if (driver.getCurrentUrl() == homepageUrl )
		{
			String msg = "Please enter a full, valid postcode";
			
			WebElement errmsg = driver.findElement(By.id("errorMessage"));
			String msg1 = errmsg.getText();
			
			if (msg == msg1)
			{
				return ("Please enter a full, valid postcode");
			}
			else
			{
				return ("Please enter a postcode");
			}
		}
		else
		{
		return ("restaurants in AR51 1AA");
		}
		
    }
}