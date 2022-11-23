package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//slider
		WebDriver d= new FirefoxDriver();
		d.get("https://jqueryui.com/slider/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement s1=d.findElement(By.id("slider"));
		Actions act =new Actions(d);
		int y=s1.getLocation().y;
		Thread.sleep(2000);
		act.dragAndDropBy(s1, y, 500).build().perform();
		Thread.sleep(2000);
		d.close();
		
		//date picker
		WebDriver di= new FirefoxDriver();
		di.get("https://jqueryui.com/datepicker/");
		di.manage().window().maximize();
		di.switchTo().frame(0);
		di.findElement(By.xpath("//input[@id='datepicker']")).click();
		di.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]/a")).click();
		

	}

}
