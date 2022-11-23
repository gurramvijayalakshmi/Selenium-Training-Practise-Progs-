package project_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		      WebDriver driver = new FirefoxDriver();
		      driver.get("https://www.google.com");
		      driver.manage().window().maximize();
		      Thread.sleep(200);
		      String t = driver.getCurrentUrl();
		      System.out.println(t);
		      driver.navigate().back();
		      driver.get("https://www.gmail.com");
		      Thread.sleep(200);
		      System.out.println(driver.getCurrentUrl());
		      driver.navigate().back();
		      System.out.println(driver.getCurrentUrl());
		      driver.close();

	}

}



