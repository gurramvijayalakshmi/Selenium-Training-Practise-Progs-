package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskd {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Row r=null;
		Cell c=null;
		try {
			FileInputStream f=new FileInputStream("D://new.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook();
			XSSFSheet ws=wb.getSheet("new");
			
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://demo.guru99.com/test/newtours/");
			d.manage().window().maximize();
			
			WebElement s=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			List<WebElement>s1=s.findElements(By.tagName("a"));
			System.out.println(s1.size());
			for(int i=1;i<s1.size();i++) {
				System.out.println(s1.get(i).getText());
				r=ws.getRow(i);
				String expurl=r.getCell(1).getStringCellValue();
				
				s1.get(i).click();
				
				Thread.sleep(2000);
				String actualurl=d.getCurrentUrl();
				
				r=ws.createRow(i);
				r.createCell(2).setCellValue(actualurl);
				d.navigate().back();
				s=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
				s1=s.findElements(By.tagName("a"));
				
				
				
				//System.out.println(actualurl);
				
				if(expurl.equals(actualurl)) {
					r.createCell(3).setCellValue("pass");
				}
				else {
					r.createCell(3).setCellValue("fail");
				}
	          
			
			}
			FileOutputStream f1=new FileOutputStream("D://new.xlsx");
			wb.write(f1);
			f1.close();
		
	

			
		}
		catch(Exception e)
		{
			System.out.print(e);
			
			r.createCell(3).setCellValue("link not found");
		
		}
	}

}
