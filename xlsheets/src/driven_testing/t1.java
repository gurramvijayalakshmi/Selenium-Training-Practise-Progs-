package driven_testing;

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

public class t1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("D://add1.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(f);
		XSSFSheet s= wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		WebElement drop = d.findElement(By.id("searchDropdownBox"));
		List<WebElement> drop1=drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++) {
			System.out.println(drop1.get(i).getText());
			r=s.createRow(i);
			r.createCell(0).setCellValue(drop1.get(i).getText());
			drop1.get(i).click();
			String b=
			
			r.createCell(1).setCellValue(drop1.getCurrentUrl());
			
			if (!drop1.get(i).isSelected()) {
				r.createCell(2).setCellValue("fail");
			}
			else {
				r.createCell(2).setCellValue("pass");
			}
		}
		
		FileOutputStream f2 =new FileOutputStream("D://add1.xlsx");
		wb.write(f2);
		f2.close();
		d.close();
	}

		

	}

