package ZydaTask.ZydaAutomationTask;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {


	protected WebDriver driver;
	public JavascriptExecutor jse  ;

	public Object button = null;

	public PageBase(WebDriver driver ) {
		PageFactory.initElements(driver, this);
		jse = (JavascriptExecutor) driver ;

	}

	protected static void clickButton(WebElement button) {

		button.click();
	}

	protected static void setTextElementText(WebElement textElement , String value) {

		textElement.sendKeys(value);
	}

	public void ScrollButton () {

		jse.executeScript("scrollBy(0 , 2500)") ; 
	}
}
