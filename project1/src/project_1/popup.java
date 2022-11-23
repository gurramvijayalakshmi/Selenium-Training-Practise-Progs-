package project_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	WebDriver d;
	public void opening_browser() {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();

	}
	public void title() {
		System.out.println(d.getTitle());
	}
	public void grt_url() {
		System.out.println(d.getCurrentUrl());
	}
	public void alert() throws InterruptedException {
		d.findElement(By.id("promtButton")).click();
		
		Alert alt=d.switchTo().alert();
	
		alt.sendKeys("VIJJI");
		Thread.sleep(2000);
		alt.accept();
		WebElement s=d.findElement(By.className("btn btn-primary"));
		System.out.println(s.getText());
		d.close();
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		popup pop=new popup();
		pop.opening_browser();
		pop.title();
		pop.grt_url();
		pop.alert();
		
		
	}

}
