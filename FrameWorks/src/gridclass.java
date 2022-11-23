import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridclass {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		String nodeurl="https://localhost:4444/wd/hub";
		String baseurl="https://www.google.com";
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		WebDriver d= new RemoteWebDriver(new URL(nodeurl),cap);
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get(baseurl);
	    d.manage().window().maximize();
	    Thread.sleep(200);
	    d.close();
	    
	}
	

}
