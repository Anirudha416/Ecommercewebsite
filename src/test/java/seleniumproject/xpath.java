package seleniumproject;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class xpath{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
//         driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//         driver.manage().window().maximize();
//         WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//         Select drop = new Select(dropdown);
//         drop.selectByIndex(3);
//         System.out.println(drop.getFirstSelectedOption().getText());
//         Thread.sleep(10000);
//        driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")).click();
        //Windows Handles
         driver.get("https://rahulshettyacademy.com/loginpagePractise/");
         driver.manage().window().maximize();
         Thread.sleep(3000);
         driver.findElement(By.cssSelector(".blinkingText")).click();
         Set<String> windows = driver.getWindowHandles();//[Parent, Child]
         Iterator<String> it = windows.iterator();
         String parent = it.next();
         String child=it.next();
         Thread.sleep(3000);
         driver.switchTo().window(child);
         System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        String emailid= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parent);
        driver.findElement(By.id("username")).sendKeys(emailid);		 
         
         
}

}
