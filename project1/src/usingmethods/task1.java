package usingmethods;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	WebDriver d;
	public void Navigate_to() {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
	}
	
	public void get_Title() {
		System.out.println(d.getTitle());
	}
	
	public void get_url() {
		System.out.println(d.getCurrentUrl());
	}
	
	public void count_dropdown() {
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> b=a.findElements(By.tagName("option"));
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
		}
	}
	
	
	public void Screenshot() throws IOException {
		File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a1,new File("D://pic1.png"));
	}

	public void close() {
		d.close();
	}
	
	public static void main(String[] args) throws IOException {
			task1 t=new task1();
			t.Navigate_to();
			t.get_Title();
		    t.get_url();
			t.count_dropdown();
			t.Screenshot();
			t.close();
			
			
	}
}


/*Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in
https://www.amazon.in/
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Pharmacy
Appliances
Apps & Games
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Same-Day Delivery
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
*/