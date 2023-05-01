package listners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import net.bytebuddy.utility.RandomString;
import testCases.Base;
import toolstation.Utility.Utility;

public class Listners extends Base implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) {
				try {
					String Rts = RandomString.make(4);
					Utility.screenshot(driver, result.getName()+Rts);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Reporter.log("Test case "+result.getName()+" is passed , Good job!", true);

		}
}


