package javaprogrammes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart1 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;

	
	
	
	@BeforeTest
	public void open(){
		pr= new ProfilesIni();
		fp=pr.getProfile("suma");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.flipkart.com/");
}
	@Test
	public void men(){
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.className("_29YdH8")).click();
		WebElement menu=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[3]/span"));
		Actions action= new Actions(driver);
		action.moveToElement(menu).build().perform();
		
		
		
	}
	
	@Test
	public void select(){
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		
		WebElement link=driver.findElement(By.linkText("Formal Shoes"));
		link.click();
		
		
	}
	
	@Test
	public void slider(){
		Actions action= new Actions(driver);
		WebElement slider=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div/div/section[2]/div[3]/div[1]"));
		int loc= slider.getLocation().x;
		action.dragAndDropBy(slider, 50, loc).build().perform();
	}
	
	
	@AfterTest
	public void close(){
		driver.close();
	}

}
