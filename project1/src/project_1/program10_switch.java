package project_1;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class program10_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String browser = s.nextLine();
		
		switch(browser){
			case "chrome" :
			{
				System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
				ChromeDriver d= new ChromeDriver();
				d.get("https://www.google.com");
				d.manage().window().maximize();
				System.out.println(d.getCurrentUrl());
				d.close();
			}
			case "firefox":
			{
				 WebDriver driver = new FirefoxDriver();
			      driver.get("https://www.google.com");
			      driver.manage().window().maximize();
			      System.out.println(driver.getCurrentUrl());
			      driver.close();
			      break;
			}
			case "internetexplorer":
			{
				System.setProperty("webdriver.InternetExplorer.driver","c://InternetExplorerdriver.exe");
				InternetExplorerDriver d= new InternetExplorerDriver();
				d.get("https://www.google.com");
				d.manage().window().maximize();
				d.close();
				break;
				
			}
			default :
				System.out.println("INVALID BROWSER");
			
		}
		
		

	}
}


