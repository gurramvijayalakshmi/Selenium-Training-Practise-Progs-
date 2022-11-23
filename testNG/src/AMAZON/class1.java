package AMAZON;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class1 {
	@BeforeClass
	public void open1() {
		System.out.println("openinggg class 1");
	}
  @Test(priority =2)
  public void title1() {
	  System.out.println("Title class 1");
  }
  @Test(priority =3)
  public void edit1() {
	  System.out.println("editing class 1");
  }
  @AfterClass
  public void close1() {
	  System.out.println("closing class 1");
  }
}
