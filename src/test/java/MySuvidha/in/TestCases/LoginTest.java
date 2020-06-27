package MySuvidha.in.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import MySuvidha.in.base.TestBase;
import MySuvidha.in.utilities.TestUtil;

public class LoginTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class, dataProvider="CommonDP")
	public void loginTest(String username, String password) throws IOException {
		
				
		  type("loginid_xpath",username);
		  type("password_xpath",password);
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  // Assert.fail();
              TestBase.VerifyEquals("Actual", "Expected");
		
	}


}
