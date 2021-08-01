package ZydaTask.ZydaAutomationTask;

import org.testng.annotations.Test;

public class Purchases extends TestBase{
	
	
	SignIn signObject;
	ChooseTshirt shirtObject;
	Checkout CheckObject;
	//CreateAnAccount accountObject;
	
	
	// 1 - Create new account.
    // 2 - Sign out.
	// 3 - Login with the new account created.
	// 4 - Select one T-Shierts
	// 5 - Select the same T-shirt with new color and new size
	// 6 - Proceed Checkout
	
	@Test
	
	public void Buy() throws Exception {
		
		
		//accountObject = new CreateAnAccount();
	   //accountObject.AccountCreation();
		signObject = new SignIn(driver);
		signObject.login("0ecg35ayo@moakt.ws ","P@ssw0rd");
		shirtObject = new ChooseTshirt(driver);
		shirtObject.Tshirt();
		CheckObject = new Checkout(driver);
		CheckObject.proccedCheckout();
	}
}
