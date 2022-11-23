package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemoment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d= new FirefoxDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		WebElement  l=d.findElement(By.linkText("Gmail"));
		Actions act=new Actions(d);
		act.contextClick(l).sendKeys("L").build().perform();
		d.close();

	}

}
