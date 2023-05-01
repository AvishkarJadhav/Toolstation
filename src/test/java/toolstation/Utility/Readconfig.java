package toolstation.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	Properties Pro;
	
	 public Readconfig() {
		
		 File src = new File("./Configurations/config.properties");
		 
		 try {
				FileInputStream fis=new FileInputStream(src);
				Pro = new Properties();
				Pro.load(fis);
			}
			catch(Exception e)
			{
				System.out.println("Exception is "+ e.getMessage());
			}
			
	}
	 
	 public String getApplicationURL()
	 {
		 String URL = Pro.getProperty("BaseURL");
		 return URL;
	 }
	 
	 public String getFname() 
	 {
		 String Fname=Pro.getProperty("Fname");
		 return Fname;
	 }
	 
	 public String getLname()
	 {
		 String Lname= Pro.getProperty("Lname");
		 return Lname;
	 }
	 
	 public String getMobileNo()
	 {
		 String Mono=Pro.getProperty("Mobile_No");
		 return Mono;
	 }
	 
	 public String getEmail()
	 {
		 String Email=Pro.getProperty("Email");
		 return Email;
	 }
	 
	 public String getPostcode()
	 {
		 String Postcode=Pro.getProperty("Postcode");
		 return Postcode;
	 }
	 
	 public String getPass()
	 {
		 String Pass=Pro.getProperty("Password");
		 return Pass;
	 }
	 
	 public String getTown()
	 {
		 String Town = Pro.getProperty("Town");
		 return Town;
	 }
	 
	 public String getHouse()
	 {
		 String houseno = Pro.getProperty("House_No");
		 return houseno;
	 }
	 
	 public String getStreet()
	 {
		 String street = Pro.getProperty("Street");
		 return street;
	 }
	 
	 public String getCountry()
	 {
		String country = Pro.getProperty("Country");
		return country;
	 }
	 
	 public String Pcode()
	 {
		 String pc = Pro.getProperty("Pcode");
		 return pc;
	 }
	 
	 public String ExURL()
	 {
		 String EXurl = Pro.getProperty("ExpectedURL");
		 return EXurl;
	 }
}
