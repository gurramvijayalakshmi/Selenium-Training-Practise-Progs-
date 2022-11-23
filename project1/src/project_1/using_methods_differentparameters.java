package project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_methods_differentparameters {
	WebDriver d;
	public void no_para_no_return() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.findElement(By.name("userName")).sendKeys("vijjibujji2812@gmail.com");
		d.findElement(By.name("password")).sendKeys("123456789");
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		System.out.println("success 1");
		Thread.sleep(2000);
	}
	public String no_para_return() {
		d.findElement(By.name("userName")).sendKeys("vijjibujji2812@gmail.com");
		d.findElement(By.name("password")).sendKeys("123456789");
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		return "success 4";
	}
	public void para_no_return(String uname,String pwd) {
		
		d.findElement(By.name("userName")).sendKeys(uname);
		d.findElement(By.name("password")).sendKeys(pwd);
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		System.out.println("success 2");
	}
	public String para_return(String uname,String pwd) {
		
		d.findElement(By.name("userName")).sendKeys(uname);
		d.findElement(By.name("password")).sendKeys(pwd);
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		System.out.println("success 2");
		return "Success 3";
	}
	public void close() {
		d.close();
	}

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		using_methods_differentparameters s =new using_methods_differentparameters();
		s.no_para_no_return();
		s.para_no_return("vijjibujji2812@gmail.com", "123456789");
		Thread.sleep(2000);
		System.out.println(s.para_return("vijjibujji2812@gmail.com", "123456789"));
		Thread.sleep(2000);
		System.out.println(s.no_para_return());
		Thread.sleep(2000);
		
		s.close();
		

	}

}
