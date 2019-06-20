package WorkingwithText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Textofelement {
	ChromeDriver driver;
	
	@BeforeTest
	public void open(){
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\New folder\\Javaprogrammes\\Javaprgm\\exefiles\\chromedriver (2).exe" );
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
	}
@Test
public void Text(){
	
	List<WebElement> Text= driver.findElements(By.tagName("B"));
	System.out.println(Text.size());
	
	for(int i=0;i<Text.size();i++)
	{
		System.out.println(Text.get(i).getText());
		System.out.println("hi");
	}
}
}
