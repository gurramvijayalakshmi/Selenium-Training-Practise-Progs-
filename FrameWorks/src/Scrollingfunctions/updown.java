package Scrollingfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class updown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)d;
		Thread.sleep(200);
		js.executeScript("window.scrollBy(0,1000)"," ");
		Thread.sleep(290);
		js.executeScript("window.scrollBy(0,-1000)"," ");
		Thread.sleep(200);
		WebElement ele=d.findElement(By.xpath("//*[@id=\"navFooter\"]/div[3]/span[1]/div/a/div"));
		js.executeAsyncScript("argument[0].scroolIntoView()", ele);
		Thread.sleep(200);
		d.close();
	}

}
