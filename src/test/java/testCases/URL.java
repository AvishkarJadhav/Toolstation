package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

public class URL extends Base {
  @Test
  public void ValidatingURL() throws IOException, InterruptedException {
	  
	 String URL = hp.ActualURL(driver);
	 String ExpectedURL = readconfig.getApplicationURL();
	 assertEquals(URL, ExpectedURL,"URL is matching TC is passed");
	  
	  
  }
}
