package com.TricentisAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class AutomationUtility {

	WebDriver driver;
	FluentWait<WebDriver> wait ;
	
	String matching = "Matching -- pass";
	String notMatching = "Not Matching -- fail";
	

	public AutomationUtility(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
		wait = new FluentWait<WebDriver>(driver);
	}

	@FindBy(linkText = "Automobile")WebElement autoMobileLink;

	@FindBy(id = "make")WebElement makeDD;
	@FindBy(id = "engineperformance")WebElement enginePerformanceWE;
	@FindBy(id = "dateofmanufacture")WebElement dateWE;
	@FindBy(id = "numberofseats")WebElement seatWE;
	@FindBy(id = "numberofseatsmotorcycle")WebElement seatMotorcycleWE;
	@FindBy(id = "fuel")WebElement fuelWE;
	@FindBy(id = "listprice")WebElement listPriceWE;
	@FindBy(id = "licenseplatenumber")WebElement numberWE;
	@FindBy(id = "annualmileage")WebElement annualMileageWE;
	@FindBy(id = "payload")WebElement payloadWE;
	@FindBy(id = "totalweight")WebElement totalweightWE;
	@FindBy(id = "model")WebElement modelWE;
	@FindBy(id = "cylindercapacity")WebElement capcityWE;
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[1]")WebElement rhdriverWE;
	
	

	@FindBy(id = "nextenterinsurantdata")WebElement nextEnterInsurantDataWE;

	@FindBy(id = "firstname")WebElement fNameWE;
	@FindBy(id = "lastname")WebElement lNameWE;
	
	@FindBy(id = "birthdate")WebElement birthDateWE;
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]")WebElement gMaleWE;

	
	
	@FindBy(id = "streetaddress")WebElement sAddressWE;
	@FindBy(id = "country")WebElement countryWE;
	@FindBy(id = "zipcode")WebElement codeWE;
	@FindBy(id = "city")WebElement cityWE;
	@FindBy(id = "occupation")WebElement occupationWE;
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]")WebElement hobbyWE;
	@FindBy(id = "website")WebElement websiteWE;

	@FindBy(id = "nextenterproductdata")WebElement nextEnterProductDataWE;

	@FindBy(id = "startdate")WebElement startDateWE;
	@FindBy(id = "insurancesum")WebElement insuranceSumWE;
	@FindBy(id = "meritrating")WebElement meritRatingWE;
	@FindBy(id = "damageinsurance")WebElement damageInsuranceWE;
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]")WebElement productAutoWE;
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]")WebElement productTruckWE;
	
	
	
	
	@FindBy(id = "courtesycar")WebElement courtesyCarWE;

	@FindBy(id = "nextselectpriceoption")WebElement nextSelectPriceOptionWE;
	
	
	@FindBy(id="selectsilver_price")WebElement silverPriceWE;
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[2]/td[2]")WebElement silverOnlineClaimWE;
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[3]/td[2]")WebElement silverOnlineDiscountWE;
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[4]/td[2]")WebElement silverCoverWE;
	
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]")WebElement silverOptionSelectedWE;
	
	
	@FindBy(id="selectgold_price")WebElement goldPriceWE;
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[2]/td[3]")WebElement goldOnlineClaimWE;
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[3]/td[3]")WebElement goldOnlineDiscountWE;
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[4]/td[3]")WebElement goldCoverWE;
	
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]")WebElement goldOptionSelectedWE;
	
	@FindBy(id="selectplatinum_price")WebElement platinumPriceWE;
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[2]/td[4]")WebElement platinumOnlineClaimWE;
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[3]/td[4]")WebElement platinumOnlineDiscountWE;
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[4]/td[4]")WebElement platinumCoverWE;
	
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]")WebElement platinumOptionSelectedWE;
	
	@FindBy(id="selectultimate_price")WebElement ultimatePriceWE;
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[2]/td[5]")WebElement ultimateOnlineClaimWE;
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[3]/td[5]")WebElement ultimateOnlineDiscountWE;
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[4]/td[5]")WebElement ultimateCoverWE;
	
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]")WebElement ultimateOptionSelectedWE;
	
	
	@FindBy(id = "nextsendquote")WebElement nextSendQuoteWE;
	
	
	@FindBy(id = "email")WebElement emailWE;
	@FindBy(id = "phone")WebElement phoneWE;
	@FindBy(id = "username")WebElement usernameWE;
	@FindBy(id = "password")WebElement passwordWE;
	@FindBy(id = "confirmpassword")WebElement confirmpasswordWE;
	@FindBy(id = "Comments")WebElement commentsWE;
	
	
	@FindBy(id = "sendemail")WebElement sendEmailBtnWE;
	@FindBy(xpath = "/html/body/div[4]/div[7]/div/button")WebElement sendPopUpOkBtnWE;
	String senPopUpOkXpath = "/html/body/div[4]/div[7]/div/button";
	@FindBy(xpath = "//*[@id=\"backmain\"]/span/i")WebElement mainPageWE;
	
	public void vehicalData(VehicleData vd,String type) {
		driver.findElement(By.linkText(type)).click();

		new Select(makeDD).selectByVisibleText(vd.make);
		enginePerformanceWE.sendKeys(vd.enginePerformance);
	
		dateWE.sendKeys(vd.date);
		
		
		
		if(type.equalsIgnoreCase("automobile")) 
		{
			new Select(fuelWE).selectByVisibleText(vd.fuelType);
			numberWE.sendKeys(vd.plateNumber);
			new Select(seatWE).selectByVisibleText(vd.seats);
			
		}
		else if (type.equalsIgnoreCase("truck")) {
			
			new Select(fuelWE).selectByVisibleText(vd.fuelType);
			numberWE.sendKeys(vd.plateNumber);
			payloadWE.sendKeys(vd.payload);
			totalweightWE.sendKeys(vd.weight);
			new Select(seatWE).selectByVisibleText(vd.seats);
			
		}else if(type.equalsIgnoreCase("motorcycle")) {
			
			new Select(modelWE).selectByVisibleText(vd.model);
			new Select(seatMotorcycleWE).selectByVisibleText(vd.seats);
			capcityWE.sendKeys(vd.capacity);
			
		} else if(type.equalsIgnoreCase("camper")) {
			
			new Select(seatWE).selectByVisibleText(vd.seats);
			rhdriverWE.click();
			new Select(fuelWE).selectByVisibleText(vd.fuelType);
			payloadWE.sendKeys(vd.payload);
			totalweightWE.sendKeys(vd.weight);
			numberWE.sendKeys(vd.plateNumber);
			
		}
		
		
		
		
		listPriceWE.sendKeys(vd.price);
		
		annualMileageWE.sendKeys(vd.mileage);

		nextEnterInsurantDataWE.click();

	}

	public void insurantData(InsurantData id) {

		fNameWE.sendKeys(id.fn);
		lNameWE.sendKeys(id.ln);
		birthDateWE.sendKeys(id.date);
		gMaleWE.click();
		sAddressWE.sendKeys(id.address);
		new Select(countryWE).selectByVisibleText(id.country);
		codeWE.sendKeys(id.zipCode);
		cityWE.sendKeys(id.city);
		new Select(occupationWE).selectByVisibleText(id.occupation);
		hobbyWE.click();
		websiteWE.sendKeys(id.website);

		nextEnterProductDataWE.click();

	}

	public void productData(ProductData pd,String type) {

		startDateWE.sendKeys(pd.startDate);
		new Select(insuranceSumWE).selectByVisibleText(pd.sum);
		new Select(damageInsuranceWE).selectByVisibleText(pd.damage);		

		if(type.equalsIgnoreCase("automobile"))
		{
			new Select(meritRatingWE).selectByVisibleText(pd.rating);
			productAutoWE.click();
			new Select(courtesyCarWE).selectByVisibleText(pd.car);

		}
		else 
		{
			productTruckWE.click();
		}
		
		
		nextSelectPriceOptionWE.click();

	}
	
	//TestCase1 
	//Test Scenarios -- functily to be test 
	public void checkPriceData(PriceData pd) {
		
		WebElement price;
		WebElement claim;
		WebElement discount;
		WebElement cover;
		WebElement optionSelected;
		
		if(pd.name.equalsIgnoreCase("silver"))
		{
			price = silverPriceWE;
			claim = silverOnlineClaimWE;
			discount = 	silverOnlineDiscountWE;
			cover = silverCoverWE;
			optionSelected = silverOptionSelectedWE;
		}
		else if(pd.name.equalsIgnoreCase("gold"))
		{
			price = goldPriceWE;
			claim = goldOnlineClaimWE;
			discount = 	goldOnlineDiscountWE;
			cover = goldCoverWE;
			optionSelected = goldOptionSelectedWE;
		}
		else if(pd.name.equalsIgnoreCase("platinum"))
		{
			price = platinumPriceWE;
			claim = platinumOnlineClaimWE;
			discount = 	platinumOnlineDiscountWE;
			cover = platinumCoverWE;
			optionSelected = platinumOptionSelectedWE;
		}
		else
		{
			price = ultimatePriceWE;
			claim = ultimateOnlineClaimWE;
			discount = 	ultimateOnlineDiscountWE;
			cover = ultimateCoverWE;
			optionSelected = ultimateOptionSelectedWE;
		}

		System.out.println(pd.name);
		result(pd.expPrice, price.getText());
		result(pd.expClaim, claim.getText());
		result(pd.expDiscount, discount.getText());
		result(pd.expCover, cover.getText());
		optionSelected.click();
		
		nextSendQuoteWE.click();
	}

	
	public void sendQuote(SendQuote sq) throws InterruptedException {
		emailWE.sendKeys(sq.email);
		phoneWE.sendKeys(sq.phone);
		usernameWE.sendKeys(sq.username);
		passwordWE.sendKeys(sq.password);
		confirmpasswordWE.sendKeys(sq.password);
		commentsWE.sendKeys(sq.comment);
		
		sendEmailBtnWE.click();
		// Thread.sleep(5000);
		//sendPopUpOkBtnWE.click();
		wait.withTimeout(Duration.ofSeconds(20))
		.ignoring(ElementNotInteractableException.class)
		.pollingEvery(Duration.ofMillis(10))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(senPopUpOkXpath))).click();
		
		
		mainPageWE.click();
		
		
	}
	
	
	public void result(String str1, String str2) {
		if(str1.equalsIgnoreCase(str2))
			System.out.println(matching);
		else
			System.out.println(notMatching);
	}

}
