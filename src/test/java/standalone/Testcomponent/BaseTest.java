package standalone.Testcomponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import standalone.pageobjects.LandingPage;

public class BaseTest {
  public WebDriver driver;
  public LandingPage landingPage;
  public WebDriver initializeDriver() throws IOException {	
	  
	//  Properties prop = new Properties("E:\\Eclipse\\seleniumproject2\\src\\main\\java\\standalone\\resources\\Global.properties");
	  Properties prop = new Properties();
	  //FileInputStream fis = new FileInputStream("E:\\\\Eclipse\\\\seleniumproject2\\\\src\\\\main\\\\java\\\\standalone\\\\resources\\\\Global.properties");
	  FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "//src//main//java//standalone//resources//Global.properties");

	  prop.load(fis);
	  String browserName = prop.getProperty("browser");
	  if(browserName.equalsIgnoreCase("chrome")) {
	   driver = new ChromeDriver();
      
	  }
	  else if(browserName.equalsIgnoreCase("firefox")) {
			//firefox
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			//firefox
		}
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
      driver.manage().window().maximize();
      return driver;
  }
  
  @BeforeMethod(alwaysRun=true)
   public LandingPage launchApplication() throws IOException {
	   driver = initializeDriver();
	   landingPage = new LandingPage(driver);
	   landingPage.goTo();
	   return landingPage;
   }
  
  @AfterMethod(alwaysRun=true)
  public void tearDown() {
	   driver.close();   
	   }
  
  
	
}
