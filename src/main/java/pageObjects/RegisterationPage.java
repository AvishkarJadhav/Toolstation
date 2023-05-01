package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterationPage {
	
	
	@FindBy(id = "title")private WebElement Title;
	@FindBy(name = "first_name")private WebElement Fname;
	@FindBy(name = "last_name")private WebElement Lname;
	@FindBy(name = "mobile")private WebElement Mobile;
	@FindBy(name = "username")private WebElement Username;
	@FindBy(name = "auto-address")private WebElement postcode;
	@FindBy(xpath = "//a[text()='Enter address manually']")private WebElement address;
	@FindBy(xpath = "//input[@id='house-field']")private WebElement houseNo;
	@FindBy(id = "a_road-field")private WebElement street;
	@FindBy(id = "town-field")private WebElement town;
	@FindBy(id = "county-field")private WebElement country;
	@FindBy(id = "postcode-field")private WebElement pcode;
	@FindBy(name = "password")private WebElement password;
	@FindBy(id = "termsAccept")private WebElement TandC;
	@FindBy(id = "submit-access-request")private WebElement Submit;
	
	
	public RegisterationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public void selectTitle(String Mr)
	{
		Select mr=new Select(Title);
		mr.selectByValue(Mr);
	}
	
	public void enterFname(String fname)
	{
		Fname.sendKeys(fname);
	}
	
	public void enterLname(String lname)
	{
		Lname.sendKeys(lname);
	}
	
	public void enterMobileNumber(String mono)
	{
		Mobile.sendKeys(mono);
	}
	
	public void enterEmail(String email)
	{
		Username.sendKeys(email);
	}

	public void enterPostcode(String pcode, WebDriver driver)
	{	
		postcode.sendKeys(pcode);
	}
	
	public void clickOnAddress(WebDriver driver)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", address);

		//address.click();
	}
	
	public void enterHouseNo(String Houseno)
	{
		houseNo.clear();
		houseNo.sendKeys(Houseno);
	}
	
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void acceptTandC()
	{
		TandC.click();
	}
	
	public void submitResponse()
	{
		Submit.click();
	}
	
	
	public void enterStreet(String Street)
	{
		street.sendKeys(Street);
	}
	
	public void enterTown(String Town)
	{
		town.sendKeys(Town);
	}
	
	public void enterCountry(String Country)
	{
		country.sendKeys(Country);
	}
	
	public void enterPcode(String PCODE)
	{
		pcode.sendKeys(PCODE);
	}
}


