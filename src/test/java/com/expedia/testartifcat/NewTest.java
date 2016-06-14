package com.expedia.testartifcat;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory homepage;
	static Logger log = Logger.getLogger("org.apache");
	
 @BeforeClass
 public void beforeClass() {
	 
	 PropertyConfigurator.configure("log4j.properties");
		
		log.setLevel(org.apache.log4j.Level.OFF);
		log = Logger.getLogger(NewTest.class);
		log.setLevel(org.apache.log4j.Level.OFF);
		 
			
		
 }
	  
 @BeforeMethod
 public void beforemethod(){
	 driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		 homepage = new SearchPageFactory(driver);
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage.driver.get(baseUrl);
 }
  @Test

  public void SelectFlights() {
//			Thread.sleep(3000);
			homepage.clickflightstab();
			log.info("clicked on flights tab");
			homepage.setOriginCity("New York ");
			homepage.origincity.sendKeys(Keys.BACK_SPACE);
			//Thread.sleep(3000);
		//	homepage.selectoption();
		//	log.info("Selected New York");
			homepage.setDestinationcity("LAX");
			//Thread.sleep(3000);
		//	homepage.selectoption();
		//	log.info("Selected LAX");
			homepage.setdepartingdates("22/06/2016");
		//	log.info("Selected departing date");
			//Thread.sleep(3000);
			homepage.setreturningdates("30/06/2016");
		//	log.info("Selected returning dates");
			homepage.searchbtn.click();
			log.info("Clicked on Search button");
	  
  }
  
  @Test
  public void SelectHotels() throws InterruptedException{
	  homepage.clickhotelstab();
	  Thread.sleep(2000);
	  homepage.setdestinationhotel("Los Angeles");
	  //homepage.selectoption();
	  homepage.setcheckindate("22/06/2016");
	  homepage.setcheckoutdate("30/06/2016");
	 // homepage.searchbtn.click();
  }
  

@AfterMethod
public void teardown() throws InterruptedException{
	Thread.sleep(3000);
	  driver.quit();
	
}


  @AfterClass
  public void afterClass() throws InterruptedException {
	  
  }

  


}
