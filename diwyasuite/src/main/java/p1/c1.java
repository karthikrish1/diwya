package p1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c1 {
	
	@Test(groups="One")
	public void t1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/slider/");
		
		//webelements : present inside a frame
		// switch ur control to that frame
		// index/id/name
		
		ob.switchTo().frame(0);
		
		Actions ac= new Actions(ob);
		
		WebElement ele = ob.findElementById("slider");
		ac.dragAndDropBy(ele, 40, 0).build().perform();
		Thread.sleep(3000);
		ob.quit();
	}

}
