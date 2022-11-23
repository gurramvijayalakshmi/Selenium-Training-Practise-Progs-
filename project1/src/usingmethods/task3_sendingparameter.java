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
	
	public void Navigate_to(ChromeDriver d) {
		
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
	}
	
	public static String get_Title(ChromeDriver d) {
		return d.getTitle();
	}
	
	public static void get_url(ChromeDriver d) {
		return d.getCurrentUrl();
	}
	
	public void count_dropdown(ChromeDriver d) {
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> b=a.findElements(By.tagName("option"));
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
		}
	}
	
	
	public void Screenshot(ChromeDriver d) throws IOException {
		File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a1,new File("D://pic1.png"));
	}

	public void close(ChromeDriver d) {
		d.close();
	}
	
	public static void main(String[] args) throws IOException {
			task1 t=new task1();
			System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
			ChromeDriver d= new ChromeDriver();
			t.Navigate_to(d);
			System.out.println(get_Title(d));
			System.out.println(get_url(d));
			t.count_dropdown(d);
			t.Screenshot(d);
			t.close(d);
			
			
	}
}
