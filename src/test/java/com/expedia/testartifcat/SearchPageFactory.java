package com.expedia.testartifcat;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import page.classes.FrameworkTestCase;

public class SearchPageFactory {
	WebDriver driver;
	
	@FindBy(id="tab-flight-tab")
	WebElement flightstab;
	
	@FindBy(id="flight-origin")
	WebElement origincity;
	
	@FindBy(xpath=".//*[@id='aria-option-0']")
	WebElement selectoption;
	
	@FindBy(id="flight-destination")
	WebElement destinationcity;
	
	@FindBy(id="flight-departing")
	WebElement origindatetextbox;
	
	@FindBy(id="flight-returning")
	WebElement retrundatetextbox;
	
	@FindBy(id="search-button")
	WebElement searchbtn;
	
	@FindBy(id="tab-hotel-tab")
	WebElement hotelsbtn;
	
	@FindBy(id="hotel-checkin")
	WebElement checkindatetextbox;
	
	@FindBy(id="hotel-checkout")
	WebElement checkoutdatetextbox;
	
	@FindBy(id="hotel-destination")
	WebElement destinationhotel;
	
	
	
	static Logger log = Logger.getLogger("org.apache");
	
	public  SearchPageFactory(WebDriver driver) {
		PropertyConfigurator.configure("log4j.properties");
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		log.setLevel(org.apache.log4j.Level.OFF);
		log = Logger.getLogger(SearchPageFactory.class);
		log.setLevel(org.apache.log4j.Level.ALL);
		
		
	}
	

	
	public void selectoption(){
		
		selectoption.click();
	}
	
	public void setOriginCity(String city){
		
		origincity.sendKeys(city);
		log.info("Origin city is set to "+city);
	}
	
	public void setDestinationcity(String city) {
		
		destinationcity.sendKeys(city);
		log.info("Destination city is set to "+city);
	}
	
	public void setdepartingdates(String date){
		origindatetextbox.clear();
		origindatetextbox.sendKeys(date);
		log.info("Departing date is set to "+date);
	}
	
	public void setreturningdates(String date)
	{
		retrundatetextbox.clear();
		retrundatetextbox.sendKeys(date);
		log.info("Returning date is set to "+date);
	}
	
	public void clickflightstab() {
		
		flightstab.click();
	}
	
	
	
public void setcheckindate(String date){
		
		checkindatetextbox.sendKeys(date);
		log.info("Checkin date is set");
	}
	
	public void setcheckoutdate(String date)
	{
		
		checkoutdatetextbox.sendKeys(date);
		
		log.info("Checkout date is set");
	}
	
	public void clickhotelstab() {
		
		hotelsbtn.click();
	}
	
	public void setdestinationhotel(String city){
		
		destinationhotel.sendKeys(city);
	}
	
}
