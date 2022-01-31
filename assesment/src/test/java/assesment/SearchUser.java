package assesment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchUser {
  @Test

	  public void Search() {
		  SetUp.driver.findElement(By.id("searchSystemUser_userName")).clear();
		  SetUp.driver.findElement(By.id("searchSystemUser_userName")).sendKeys(InputValues.UserName);
		  
		  
		  SetUp.driver.findElement(By.id("searchBtn")).click();
	  }
  }

