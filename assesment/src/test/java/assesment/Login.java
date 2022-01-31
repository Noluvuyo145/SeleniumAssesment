package assesment;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test
public class Login {
	@Test(dataProvider = "loginData", priority = 1)
	public void login(String UserName, String Password)  {
		SetUp.driver.findElement(By.id(locators.usernameTextBox)).clear();
		SetUp.driver.findElement(By.id(locators.usernameTextBox)).sendKeys(UserName);
		SetUp.driver.findElement(By.id(locators.passwordTextBox)).clear();
		SetUp.driver.findElement(By.id(locators.passwordTextBox)).sendKeys(Password);

		SetUp.driver.findElement(By.id(locators.LoginButton)).click();
	}
	@Test(priority = 2)
	public void Validation() {
		if(SetUp.driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
			System.out.println();
		}
	}
	
	@Test(priority = 2)
	public void Validation2() {
		if(SetUp.driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).getText().equals("Admin")) {
			System.out.println("Admin Displays");
		}
		
	}
	
	@Test(priority = 2)
	public void Validation3() {
		if(SetUp.driver.findElement(By.id("welcome")).getText().equals("Welcome Admin")) {
			System.out.println("Welcome Admin Displays");
		}
	}
	@DataProvider(name="loginData")
	public Object[][] getData(){
		Object[][] loginData = new Object[2][2];
		//Incorrect Data 
		loginData[0][0] = "Noluvuyo";
		loginData[0][1] = "Noluvuyo123";
		//Correct Data
		loginData[1][0] = "Admin";
		loginData[1][1] = "admin123";

		return loginData;
	}
}

