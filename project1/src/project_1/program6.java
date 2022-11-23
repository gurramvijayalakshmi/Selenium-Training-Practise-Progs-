package project_1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program6 {

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.findElement(By.linkText("REGISTER")).click();
		WebElement a=d.findElement(By.name("country"));
		List<WebElement> drop=a.findElements(By.tagName("option"));
		System.out.println(drop.size());
		for(int i=0;i<drop.size();i++)
			System.out.println(drop.get(i).getText());
		
		
		File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a1, new File("d://pic.png"));
		d.close();
		
		

	}

}
