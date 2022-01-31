package assesment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class SetUp {
	public static WebDriver driver = null;
	@BeforeSuite
  public void setup() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//validate page title
		if(!driver.getTitle().equalsIgnoreCase("OrangeHRM")) {
			System.err.println("Invalid page title");
		}
   }
}