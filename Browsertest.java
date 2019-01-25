import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Browsertest {
	
	public static void main(String [] args) throws InterruptedException { 
		
		String projectpath= System.getProperty("user.dir");
		System.out.println("projectPath : " +projectpath);
		
		System.setProperty("webdriver.gecko.driver", projectpath+"\\drivers\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
				// WebDriver driver=new ChromeDr();
				// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("http://jqueryui.com/droppable/");

				Actions myaction = new Actions(driver);

				// switch to frame
				driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

				WebElement dragfrom = driver.findElement(By.xpath("//*[@id='draggable']"));

				// find
				WebElement dragto = driver.findElement(By.xpath("//*[@id='droppable']"));
				Thread.sleep(1000);

				// perform drag operation
				myaction.dragAndDrop(dragfrom, dragto).build().perform();
				Thread.sleep(1000);

				String Expectedclr = "#fffa90";
				//dragto = driver.findElement(By.xpath("//*[@id='droppable']"));
				String actualclr = dragto.getCssValue("background");
				System.out.println(actualclr);
		/*
		 * System.out.println(actualclr); //rgb(255, 250, 144) none repeat scroll 50% 0%
		 * / auto padding-box border-box String color =
		 * actualclr.replace(" none repeat scroll 50% 0% / auto padding-box border-box",
		 * ""); System.out.println(color); //rgb(255, 250, 144)
		 * 
		 * String hex = Color.fromString(color).asHex(); System.out.println(hex); if
		 * (hex== Expectedclr) { System.out.println("test passed"); }
		 */
						
		
				// wait for 1 sec
				
}
	}
