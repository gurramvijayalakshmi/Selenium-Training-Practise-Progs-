package testNG1;

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
import org.testng.annotations.Test;

public class task1 {
	WebDriver d;
	@Test (priority=1)
	public void opening_browser() {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
	}
  @Test (priority=2)
  public void get_Title() {
		System.out.println(d.getTitle());
	}
  @Test(priority=3)
  public void get_url() {
		System.out.println(d.getCurrentUrl());
	}
  @Test(priority=4)
  public void count_dropdown() {
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> b=a.findElements(By.tagName("option"));
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
		}
	}
  @Test (priority=2)
  public void Screenshot() throws IOException {
		File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a1,new File("D://pic3.png"));
	}
  @Test (priority=10)
  public void close() {
		d.close();
	}
  
  
  
}
