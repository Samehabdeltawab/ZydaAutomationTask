package ZydaTask.ZydaAutomationTask;

import org.testng.annotations.Test;

public class CreateAnAccount extends TestBase{
	
	
	CreateAccount CreationObject;
	AccountInformations AcinfoObject;
	Addressinformations addressObject;
	SignOut  logoutObject;
	
	@Test
	
	public void AccountCreation() throws Exception{
		
		CreationObject = new CreateAccount(driver);
		CreationObject.CreateData("0ecg35ayo@moakt.ws");
		AcinfoObject = new AccountInformations(driver);
		AcinfoObject.PersonalInfo("Sameh", "Abdeltawab","P@ssw0rd");
		addressObject = new Addressinformations(driver);
		addressObject.AddInfo("500 Main Street #59, ARAMARK Ltd", "AVE", "10013", "01091001476", "New York");
		logoutObject = new SignOut(driver);
		logoutObject.logout();
	}

}
