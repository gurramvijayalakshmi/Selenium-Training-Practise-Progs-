package tests;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampl {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			FileInputStream f=new FileInputStream("D://new.xlsx");
				XSSFWorkbook wb=new XSSFWorkbook(f);
				XSSFSheet ws=wb.getSheet("sheet1");
				Row r=null;
				Cell c=null;
				System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
				ChromeDriver d=new ChromeDriver();
				d.get("https://demo.guru99.com/test/newtours/");
				d.manage().window().maximize();
				WebElement link=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
				List<WebElement>links=link.findElements(By.tagName("a"));
				System.out.println(links.size());
				for(int i=0;i<links.size();i++)
				{
				try
				{
					String lin=r.getCell(0).getStringCellValue();
				d.findElement(By.linkText(lin)).click();
				d.navigate().back();
				link=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
				links=link.findElements(By.tagName("a"));


					String exp=r.getCell(1).getStringCellValue();
					String act=d.getCurrentUrl();
					if(exp.equals(act)){
				r.createCell(2).setCellValue("pass");
				}
				else
				{
				r.createCell(2).setCellValue("fail");
				}
					FileOutputStream f1=new FileOutputStream("D://new.xlsx");
					wb.write(f1);
					f1.close();
				}
				
				catch(Exception e)
				{
				r.createCell(2).setCellValue("link not found");
				}
				
	
				}
		}
}
		

