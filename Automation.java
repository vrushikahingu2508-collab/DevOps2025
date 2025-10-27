package com.TricentisAutomation;

import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



class AutoMobile {
	
	public String linkText = "Automobile";

	public PriceData silver = new PriceData("silver", "260.00", "No", "No", "No");
	
	public PriceData gold = new PriceData("gold", "766.00", "Submit", "2", "Limited");
	
	public PriceData platinum = new PriceData("platinum", "1,504.00", "Submit", "5", "Limited");
	
	public PriceData ultimate = new PriceData("ultimate", "2,866.00", "Submit", "10", "Unlimited");
	
}

class Truck {
	
	public String linkText = "Truck";

	public PriceData silver = new PriceData("silver", "272.00", "No", "No", "No");
	
	public PriceData gold = new PriceData("gold", "801.00", "Submit", "2", "Limited");
	
	public PriceData platinum = new PriceData("platinum", "1,572.00", "Submit", "5", "Limited");
	
	public PriceData ultimate = new PriceData("ultimate", "2,995.00", "Submit", "10", "Unlimited");
	
	
}

class Motorcycle {
	
	public String linkText = "Motorcycle";

	public PriceData silver = new PriceData("silver", "246.00", "No", "No", "No");
	
	public PriceData gold = new PriceData("gold", "726.00", "Submit", "2", "Limited");
	
	public PriceData platinum = new PriceData("platinum", "1,425.00", "Submit", "5", "Limited");
	
	public PriceData ultimate = new PriceData("ultimate", "2,715.00", "Submit", "10", "Unlimited");
	
	
}

class Camper {
	
	public String linkText = "Camper";

	public PriceData silver = new PriceData("silver", "255.00", "No", "No", "No");
	
	public PriceData gold = new PriceData("gold", "751.00", "Submit", "2", "Limited");
	
	public PriceData platinum = new PriceData("platinum", "1,474.00", "Submit", "5", "Limited");
	
	public PriceData ultimate = new PriceData("ultimate", "2,808.00", "Submit", "10", "Unlimited");
	
	
}



class VehicleData {

	public String make;
	public String enginePerformance;
	public String date;
	public String seats;
	public String fuelType;
	public String price;
	public String plateNumber;
	public String mileage;
	public String payload;
	public String weight;
	public String model;
	public String capacity;
	public String rightHandDriver;

	public VehicleData(String m, String ep, String d, String s, String f, String p, String pn, String mi, String pl,
			String w, String mo, String cc, String rhd) {

		make = m;
		enginePerformance = ep;
		date = d;
		seats = s;
		fuelType = f;
		price = p;
		plateNumber = pn;
		mileage = mi;
		payload = pl;
		weight = w;
		model = mo;
		capacity = cc;
		rightHandDriver = rhd;

	}

}

class InsurantData {

	public String fn;
	public String ln;
	public String date;
	public String gender;
	public String address;
	public String country;
	public String zipCode;
	public String city;
	public String occupation;
	public String hobby;
	public String website;
	public String picture;
	public String rightHandDriver;

	public InsurantData(String fname, String lName, String d, String g, String a, String c, String code, String ci,
			String oc, String h, String w, String p) {

		fn = fname;
		ln = lName;
		date = d;
		gender = g;
		address = a;
		country = c;
		zipCode = code;
		city = ci;
		occupation = oc;
		hobby = h;
		website = w;
		picture = p;

	}
}

class ProductData {

	public String startDate;
	public String sum;
	public String rating;
	public String damage;
	public String products;
	public String car;

	public ProductData(String sd, String s, String r, String d, String p, String c) {
		startDate = sd;
		sum = s;
		rating = r;
		damage = d;
		products = p;
		car = c;
	}

}


class PriceData
{
	public String name;
	public String expPrice;
	public String expClaim;
	public String expDiscount;
	public String expCover;

	public String actualPrice;
	public String actualClaim;
	public String actualDiscount;
	public String actualCover;
	
	public PriceData()
	{
		
	}
	
	public PriceData (String n, String ep, String ec,String ed, String eco) 
	{
		name = n;
		expPrice = ep;
		expClaim = ec;
		expDiscount = ed;
		expCover = eco;
		actualPrice = "";
		actualClaim = "";
		actualDiscount = "";
		actualCover = "";
		
	}
	
}

class SendQuote{
	
	public String email;
	public String phone;
	public String username;
	public String password;
	public String cPassword;
	public String comment;
	
	
	public SendQuote(String e,String p,String u,String pw,String c) {
		email = e;
		phone = p;
		username = u ;
		password = pw;
		cPassword = pw;
		comment = c;
		
	}
	
}

public class Automation {

	WebDriver driver;

	String url = "https://sampleapp.tricentis.com/101/index.php";
	
	AutomationUtility utility;
	public VehicleData vehicle = new VehicleData("Suzuki", "1200", "01/01/2024", "3", "Petrol", "50000", "GJ03AA1234",
			"200", "500", "5000", "Moped", "1500", "");

	public InsurantData insurant = new InsurantData("abbcccc", "vvbbssww", "02/24/2001", "", "Station Plot", "India",
			"000000", "abcd", "Selfemployed", "", "abcd.com", "");

	public ProductData product = new ProductData("10/01/2025", "3.000.000,00", "Bonus 3", "No Coverage", "", "No");
	public SendQuote sendQuote = new SendQuote("abc@gmail.com", "9837429783	", "abcqwe", "Abc@123", "this is comment");
	
	
	@Test(dataProvider = "dp")
	public void f(Object obj) throws Exception {
		String type;
		if(obj.getClass() == AutoMobile.class)
		{
			AutoMobile autoMobile = (AutoMobile) obj;
			type = "Automobile";
			for(PriceData pd : Arrays.asList(autoMobile.silver, autoMobile.gold, autoMobile.platinum, autoMobile.ultimate))
			{
				utility.vehicalData(vehicle,type);
				utility.insurantData(insurant);
				utility.productData(product,type);
				System.out.println(autoMobile.linkText);
				utility.checkPriceData(pd);
				utility.sendQuote(sendQuote);
			}
		}else if (obj.getClass() == Truck.class) {
			
			
			Truck truck = (Truck) obj;
			type = "Truck";
			for(PriceData pd : Arrays.asList(truck.silver, truck.gold, truck.platinum,truck.ultimate))
			{
				utility.vehicalData(vehicle,type);
				utility.insurantData(insurant);
				utility.productData(product,type);
				System.out.println(truck.linkText);
				utility.checkPriceData(pd);
				utility.sendQuote(sendQuote);
			}
			
		}else if (obj.getClass() == Motorcycle.class) {
			
			
			Motorcycle motorcycle = (Motorcycle) obj;
			type = "Motorcycle";
			for(PriceData pd : Arrays.asList(motorcycle.silver, motorcycle.gold, motorcycle.platinum,motorcycle.ultimate))
			{
				utility.vehicalData(vehicle,type);
				utility.insurantData(insurant);
				utility.productData(product,type);
				System.out.println(motorcycle.linkText);
				utility.checkPriceData(pd);
				utility.sendQuote(sendQuote);
			}
			
		}else if (obj.getClass() == Camper.class) {
			
			
			Camper camper = (Camper) obj;
			type = "Camper";
			for(PriceData pd : Arrays.asList(camper.silver, camper.gold, camper.platinum,camper.ultimate))
			{
				utility.vehicalData(vehicle,type);
				utility.insurantData(insurant);
				utility.productData(product,type);
				System.out.println(camper.linkText);
				utility.checkPriceData(pd);
				utility.sendQuote(sendQuote);
			}
			
		} else {
			throw new Exception("Invalid Object");
		}
	}


	@DataProvider
	public Object[] dp() {
		return new Object[] { new AutoMobile(),new Truck(),new Motorcycle(),new Camper()};
		//return new Object[] { new Camper()};
	}

	@BeforeTest
	public void configure() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(url);
		
		utility = new AutomationUtility(driver);
		
		
	}

	@AfterTest
	public void closeBrowser() {

		 driver.close();
	}

}
