package sample;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDown {
	

	
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
		  driver.get("http://www.leafground.com/pages/Dropdown.html");	
		  driver.manage().window().maximize();
		  WebElement index = driver.findElement(By.id("dropdown1"));
		  Select select=new Select(index);
		  select.selectByIndex(1);
		  
		  WebElement text = driver.findElement(By.name("dropdown2"));
		  Select select2=new Select(text);
		  select2.selectByVisibleText("Selenium");
		  
		  WebElement value = driver.findElement(By.id("dropdown3"));
		  Select select3=new Select(value);
		  select3.selectByValue("1");
}
}