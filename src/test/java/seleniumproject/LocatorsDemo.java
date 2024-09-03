package seleniumproject;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirt");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.linkText("Blouse")).click();
		// TODO Auto-generated method stub
//Finding Number Of Sliders on Home Page
		List<WebElement> sliders = driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of Sliders="+sliders.size());
		////Finding Number Of Images on Home Page
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Number of Images="+images.size());
		//toatal Link
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Number of Images="+link.size());
	}

}
