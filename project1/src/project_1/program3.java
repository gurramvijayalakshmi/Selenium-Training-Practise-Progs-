package project_1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class program3 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.linkText("REGISTER")).click();
		d.findElement(By.name("firstName")).sendKeys("sravs");
		d.findElement(By.name("lastName")).sendKeys("sravs");
		d.findElement(By.name("userName")).sendKeys("sravs@gmail.com");
		d.findElement(By.name("country")).sendKeys("BENIN");
		d.findElement(By.name("submit")).click();
		//d.close();
}
}
