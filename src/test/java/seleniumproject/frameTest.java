package seleniumproject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class frameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
//         driver.get("https://jqueryui.com/droppable/");
//         driver.manage().window().maximize();
//        //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
//        Thread.sleep(3000);
//         driver.switchTo().frame(0);
//         Actions a = new Actions(driver);
//         WebElement source = driver.findElement(By.id("draggable"));
//         WebElement destination = driver.findElement(By.id("droppable"));
//         a.dragAndDrop(source, destination).build().perform();
//         driver.switchTo().defaultContent();//come out from frames
         driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
         Actions a = new Actions(driver);
         Thread.sleep(3000);
      //  a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
////         
         
         
         
         
         
	}

}
