package javaprogrammes;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngex {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		pr= new ProfilesIni();
		fp=pr.getProfile("suma");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.guru99.com/all-about-testng-and-selenium.html");
}
	
	@Test
	public void url(){
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@AfterTest
	public void close(){
		
		driver.close();
	}

}
