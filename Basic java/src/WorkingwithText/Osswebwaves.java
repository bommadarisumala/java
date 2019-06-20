package WorkingwithText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Osswebwaves {
	WebDriver driver;
	
	@BeforeTest
	public void launchbrowser(){
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\New folder\\Javaprogrammes\\Basic java\\exe\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://webwaves.in/ecommerce/seller/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void Login()
	{
		driver.findElement(By.name("username")).sendKeys("kalpanaQA@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id='login-box-inner']/form/div[3]/div/button")).click();
	}
	
	@Test
	public void Category(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("//li[contains(@id,'product_menu_id')]")).click();

		driver.findElement(By.xpath("//*[@id='inventory_control']/a")).click();
		
	}
	
	

}
