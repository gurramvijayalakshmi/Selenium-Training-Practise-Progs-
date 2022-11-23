package project_1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver,chrome.driver", "c://geckodriver.exe");
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://gmail.com");
		d.navigate().back();
		d.close();
		

	}

}


//NOT WORKINGG
