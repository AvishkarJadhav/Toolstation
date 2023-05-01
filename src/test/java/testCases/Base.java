package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageObjects.HomePage;
import pageObjects.RegisterationPage;
import toolstation.Utility.Readconfig;

public class Base {
	
	/* Declared objects of POM classes globally
	 * 
	 */
	
	HomePage hp;
	RegisterationPage rp;
	Actions act;
	
	/* Getting Values for properties file
	 * 
	 */
	Readconfig readconfig=new Readconfig();
	

	
	public String BaseURL=readconfig.getApplicationURL();
	public String Fname =readconfig.getFname();
	public String Lname =readconfig.getLname();
	public String Pcode =readconfig.getPostcode();
	public String Pass =readconfig.getPass();
	public String MoNo =readconfig.getMobileNo();
	public String Email =readconfig.getEmail();
	public String HouseNo =readconfig.getMobileNo();
	public String Street =readconfig.getStreet();
	public String Town =readconfig.getTown();
	public String Country =readconfig.getCountry();
	public String PcoDe =readconfig.Pcode();
	public String ExpURL =readconfig.ExURL();
	
	
	
	
	protected static ChromeDriver driver;
	
	
	/* Setup for browser
	 * 
	 */
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	options.addArguments("--remote-allow-origins=*");
	  
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	
	hp=new HomePage(driver);
	rp = new RegisterationPage(driver);
	act=new Actions(driver);
	
	
	}
	
	@BeforeMethod
	public void openApplication()
	{
		
		driver.get(BaseURL);
		
	}
	
	@AfterMethod
	public void clearResponse()
	{
		driver.getCurrentUrl();
	}
	
//	@AfterClass
//	public void closeApplication()
//	{
//		driver.close();
//	}
	
	
	
	

}
