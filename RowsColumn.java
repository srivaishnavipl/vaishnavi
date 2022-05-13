package sample;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RowsColumn {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		
		List <WebElement> tableCount= driver.findElements(By.xpath("//table"));
		List <WebElement> rowCount 	= driver.findElements(By.xpath("//div[@class= 'render']//table//tr"));
		List <WebElement> colCount = driver.findElements(By.xpath("//div[@class= 'render']//table//tr//th"));
		
		int tabCount = tableCount.size();
		int rCount= rowCount.size();
		int cCount = colCount.size() ;
		
		
		System.out.println("Total no of tables: " 	+ tabCount);
		System.out.println("Total no of rows: " 	+ rCount);
		System.out.println("Total no of columns: "  + cCount); 
	}		
}
