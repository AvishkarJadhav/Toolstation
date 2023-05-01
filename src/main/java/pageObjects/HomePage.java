package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/* Initializing web elements by Page Factory
 *  
 */
public class HomePage {
	
	@FindBy(xpath = "//a[text()='  Register ']") private WebElement reg;
	@FindBy(id = "onetrust-accept-btn-handler")private WebElement PopUp;
	
	/* Writing construction for Home page
	 * 
	 */
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	/* Actions to be perform on web elements
	 * 
	 */
	public void handlingPopUp()
	{
		PopUp.click();
	}

	public void clickOnReg(WebDriver driver)
	{
		reg.click();
	}
	
	/* Getting current for validation
	 * 
	 */
	
	public String ActualURL(WebDriver driver) throws IOException, InterruptedException {
		String ActualURL = driver.getCurrentUrl();
		
				
				return ActualURL;
	}
	
	
}
