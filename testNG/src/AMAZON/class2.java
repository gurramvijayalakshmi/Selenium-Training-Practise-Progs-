package AMAZON;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class2 extends class1 {
	
	@BeforeClass
	public void open2() {
		System.out.println("openinggg class 2");
	}
  @Test(priority =6)
  public void title2() {
	  System.out.println("Title class 2");
  }
  @Test(priority =7)
  public void edit2() {
	  System.out.println("editing class 2");
  }
  @AfterClass
  public void close2() {
	  System.out.println("closing class 2 ");
  }
}
