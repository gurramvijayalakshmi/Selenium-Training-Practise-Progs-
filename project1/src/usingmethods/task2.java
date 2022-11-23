package usingmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.manage().window().maximize();
		d.findElement(By.id("userName")).sendKeys("vij");
		d.findElement(By.id("userEmail")).sendKeys("vij@gmail.com");
		d.findElement(By.id("currentAddress")).sendKeys("vijaywada");
		d.findElement(By.id("permanentAddress")).sendKeys("vijaywada");
		WebElement t= d.findElement(By.id("submit"));
		t.click();
		
		String s=d.findElement(By.xpath("//*[@id=\"output\"]")).getText();
		System.out.println(s);
	}

}
