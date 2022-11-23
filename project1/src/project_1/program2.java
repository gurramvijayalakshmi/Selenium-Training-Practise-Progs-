package project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		d.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		boolean a=d.findElement(By.id("searchDropdownBox")).isSelected();
		System.out.println(a);
	    d.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
	    boolean b= d.findElement(By.id("twotabsearchtextbox")).isDisplayed();
	    System.out.println(b);
		d.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.close();
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		FirefoxDriver f= new FirefoxDriver();
		System.out.println(f.getCurrentUrl());
		f.get("https://www.amazon.com/");
		f.navigate().back();
		f.quit();
	}

}
