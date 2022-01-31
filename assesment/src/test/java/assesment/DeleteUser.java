package assesment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteUser {
  @Test
  public void DeleteSelectedUser() {
	  SetUp.driver.findElement(By.name("chkSelectRow[]")).click();
	  
	 SetUp.driver.findElement(By.id("btnDelete")).click();
	  
	  SetUp.driver.findElement(By.id("dialogDeleteBtn")).click();
  
  }
}
