package ZydaTask.ZydaAutomationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Addressinformations extends PageBase{

	public Addressinformations(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy (id = "address1")
	WebElement addressText;
	
	@FindBy (id = "city")
	WebElement cityText; 
	
	@FindBy (id = "id_state")
	WebElement StateSelect;
	
	@FindBy (id = "postcode")
	WebElement pcodeText;
	
	@FindBy (id = "id_country")
	WebElement countrySelect;
	
	@FindBy (id = "phone_mobile")
	WebElement mobileText;
	
	@FindBy (id = "alias")
	WebElement aliasText;
	
	@FindBy(id = "submitAccount")
	WebElement rejisterBtn;
	
	public void AddInfo(String address, String city, String postcode, String mobile, String alias) throws Exception{

		setTextElementText(addressText,address);
		Thread.sleep(2000);
		setTextElementText(cityText,city);
		Thread.sleep(3000);
		Select state = new Select(StateSelect);
		state.selectByValue("32");
		Thread.sleep(2000);
		setTextElementText(pcodeText,postcode);
		Thread.sleep(3000);
		Select contry = new Select(countrySelect);
		contry.selectByValue("21");
		Thread.sleep(2000);
		setTextElementText(mobileText,mobile);
		Thread.sleep(5000);
		setTextElementText(aliasText,alias);
		Thread.sleep(5000);
		rejisterBtn.click();
	}
	
	

}
