package WorkingwithText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NormalandBoldtextcount {
	ChromeDriver driver;
@BeforeTest
public void open(){
	System.setProperty("webdriver.chrome.driver", "E:\\New folder\\New folder\\Javaprogrammes\\Javaprgm\\exefiles\\chromedriver (2).exe");
	driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
}
@Test
public void Textcount()
{
  List<WebElement> NTC=driver.findElements(By.tagName("p"));
  List<WebElement> BTC=driver.findElements(By.tagName("b"));
  System.out.println(NTC.size()+"  "+BTC.size());
	
}

}
