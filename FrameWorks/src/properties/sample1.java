package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	public static void main(String args[]) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\sai vijaya lakshmi\\eclipse-workspace\\FrameWorks\\src\\properties\\sample1");
		Properties p=new Properties();
		p.load(f);
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get(p.getProperty("url"));
		d.manage().window().maximize();
		d.findElement(By.name("userName")).sendKeys(p.getProperty("userName"));
		System.out.println(p.getProperty("userName"));
		d.findElement(By.name("password")).sendKeys(p.getProperty("passWord"));
		System.out.println(p.getProperty("passWord"));
		
		
		
	}

}
