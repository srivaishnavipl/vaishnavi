package sample;

import java.awt.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		String totalitems=driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items:"+totalitems);
		System.out.println("List of brands:");
	java.util.List<WebElement> brandList = driver.findElements(By.className("brand"));
		
		System.out.println("Size:"+brandList.size());
		for(WebElement webElement1:brandList) {
			String text = webElement1.getText();
			System.out.println(text);
			java.util.List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
			System.out.println("Size:"+bagNameList.size());
			System.out.println("name of the bags");
			for(WebElement webElement2:bagNameList) {
			 String text1 = webElement2.getText();
				System.out.println(text1);
		}
	}
	
	
	}}