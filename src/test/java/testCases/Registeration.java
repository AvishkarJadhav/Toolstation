package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listners.Listners.class)
public class Registeration extends Base {
  @Test
  public void UserRegisteration() throws InterruptedException {
	  
	  Thread.sleep(500);
	  hp.handlingPopUp();
	  Thread.sleep(500);
	  hp.clickOnReg(driver);
	  Thread.sleep(500);
	  rp.selectTitle("Mr");
	  Thread.sleep(500);
	  rp.enterFname(Fname);
	  Thread.sleep(500);
	  rp.enterLname(Lname);
	  Thread.sleep(500);
	  rp.enterMobileNumber(MoNo);
	  Thread.sleep(500);
	  rp.enterEmail(Email);
	  Thread.sleep(500);
	  rp.enterPostcode(Pcode, driver);
	  Thread.sleep(500);
	  rp.clickOnAddress(driver);
	  Thread.sleep(1000);
	  Thread.sleep(500);
	  rp.enterStreet(Street);
	  Thread.sleep(500);
	  rp.enterTown(Town);
	  Thread.sleep(500);
	  rp.enterPcode(PcoDe);
	  Thread.sleep(500);
	  rp.enterCountry(Country);
	  Thread.sleep(500);
	  rp.enterPassword(Pass);
	  Thread.sleep(500);
	  rp.acceptTandC();
	  Thread.sleep(1000);
	  rp.enterHouseNo(HouseNo);
	  
	  rp.submitResponse();
	  Thread.sleep(1000);
	  
	  String ActualURL = driver.getCurrentUrl();
	  assertEquals(ActualURL, ExpURL);
	  
	  
  }
}
