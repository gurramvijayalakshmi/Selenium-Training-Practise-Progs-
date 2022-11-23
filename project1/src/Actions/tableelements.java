package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tableelements {

	public static void main(String[] args) {
		
		//capturing first column.
		WebDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		String a="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String b="]/td[1]";
		String f="//*[@id=\"p";
		String e="\"]";
		for(int i=1,j=0;i<=36;i++,j++)
		{
			String c=d.findElement(By.xpath(a+i+b)).getText();
			String g=d.findElement(By.xpath(f+j+e)).getText();
			
			System.out.println(c +"  "+"  :  "+g);
		}
		/*String h="]/td[";
		String k="]";
		for(int i=1;i<=36;i++) {
			for(int j=1;j<=10;j++) {
				String m=d.findElement(By.xpath(a+i+h+j+k)).getText();
				System.out.println(m);
			}
		}*/
		
		
		

	}

}

///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[6]/td[5]
////*[@id="p50"]
///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[3]/a
////*[@id="p4"]
///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[35]/td[1]


