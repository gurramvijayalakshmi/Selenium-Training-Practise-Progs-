package testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","D:\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver;
		d.get("https://www.amazon.com/");
		d.Manage().window().maximize();
		//d.findelements(by.id("searchDropdownBox")).sendkey("Books");
	    //d.findelements(by.id("twotabsearchtextbox")).sendkey("Harry potter");
		//d.findelements(by.id("nav-search-submit-button")).click();
		System.out.println(d.gettitle());
		System.out.println(d.getcurrenturl());

	}

}
