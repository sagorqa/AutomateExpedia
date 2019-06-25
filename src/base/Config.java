package base;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utils.WdFunction;

public class Config extends WdFunction {
	@Parameters({"url","browser"})
	@BeforeMethod
	public  void browserInitialize(String url, String browsername){
		applicationLog.info("browser Started");
		//System.setProperty("webdriver.chrome.driver", "C://Users//shahadat//workspace//automationFramework//DRIVER//chromedriver.exe");
		if(driver == null){
			if(browsername.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//DRIVER//chromedriver.exe");
		
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--start-maximized");
		 driver=new ChromeDriver(options);
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
			else if(browsername.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", 
				System.getProperty("user.dir") + "//DRIVER//geckodriver.exe");
				driver = new FirefoxDriver();
				}
			else
	        {
				throw new IllegalArgumentException("The Browser Type is Undefined");
	        }

		}
			
			//driver.manage().window().maximize();
		
		 //driver.get(url);
		applicationLog.info("Browser MAXIMIZE");
		driver.get(url);
		applicationLog.info ("https://www.expedia.com/");
		
	}
		
			
	@AfterMethod
	public void afterTest (){
		
		applicationLog.info("Close the browser");
		driver.close();
}
}