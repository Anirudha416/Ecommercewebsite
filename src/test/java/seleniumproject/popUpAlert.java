package seleniumproject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class popUpAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rahul");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
	        System.out.println(driver.switchTo().alert().getText());
	        driver.switchTo().alert().accept();
	        driver.findElement(By.id("confirmbtn")).click();
	        System.out.println(driver.switchTo().alert().getText());
	        Thread.sleep(3000);
	        driver.switchTo().alert().accept();
	        
	}

}
