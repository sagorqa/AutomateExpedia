package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WdFunction {
	public static WebDriver driver;
	public static Logger applicationLog=Logger.getLogger("devpinoyLogger");

		public void typeByid(String locator){
		
			driver.findElement(By.id(locator)).click();
			}
		public void clickByid (String locator){
		
		driver.findElement(By.id(locator)).click();
		}

	public void typeByfirstname(String locator, String values){
		try{
			driver.findElement(By.xpath(locator)).clear();
			driver.findElement(By.xpath(locator)).sendKeys(values);
		}
		catch(Exception e){
		}
		}
		
	public void typeBylastname(String locator, String values){

			driver.findElement(By.xpath(locator)).clear();
			driver.findElement(By.xpath(locator)).sendKeys(values);
	}
		public void  typeByemail (String locator, String values){
			driver.findElement(By.xpath(locator)).clear();
			driver.findElement(By.xpath(locator)).sendKeys(values);
		
		}
		public void  typeByPassword (String locator, String values){
			driver.findElement(By.xpath(locator)).clear();
			driver.findElement(By.xpath(locator)).sendKeys(values);
	}
}
