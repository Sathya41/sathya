import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

            public class EndtoEndAmazon {	
			public static void main(String[] args) throws InterruptedException {
			
			String projectpath= System.getProperty("user.dir");
			System.out.println("projectPath : " +projectpath);
				
			System.setProperty("webdriver.gecko.driver", projectpath+"\\drivers\\geckodriver\\geckodriver.exe");
				
			WebDriver d=new FirefoxDriver();
			d.get("https://www.amazon.com");
			Thread.sleep(3000);
			d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone XS case");
			Thread.sleep(3000);
			d.findElement(By.className("nav-input")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[1]/div/div/div/div[2]/div[2]/div[1]/a/h2")).click();
			Thread.sleep(3000);

			d.findElement(By.id("add-to-cart-button")).click();
			Thread.sleep(3000);
			d.findElement(By.id("hlb-ptc-btn-native")).click();
			Thread.sleep(3000);
			d.findElement(By.id("ap_email")).sendKeys("sathya6728@gmail.com");
			Thread.sleep(3000);
			d.findElement(By.id("ap_password")).sendKeys("Chinna216!");
			Thread.sleep(3000);
			d.findElement(By.id("signInSubmit")).submit();
			Thread.sleep(3000);	

		Thread.sleep(3000);	

		d.close();
		}

	}

