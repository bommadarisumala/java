package WorkingwithText;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SpecificText {
ChromeDriver driver;

@BeforeTest
public void open(){
	System.setProperty("webdriver.chrome.driver", "E:\\New folder\\New folder\\Javaprogrammes\\Javaprgm\\exefiles\\chromedriver (2).exe");
	driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
}
@Test
public void Text(){
	String Expected ="May 23, 2019";
	String Actual = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
	Assert.assertEquals(Actual, Expected);
	System.out.println(Actual);
}

@AfterTest
public void close(){
	driver.close();
}
}
