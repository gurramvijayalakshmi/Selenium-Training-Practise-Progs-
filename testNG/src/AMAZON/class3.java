package AMAZON;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class3  extends class2 {
	@BeforeClass
	public void open3() {
		System.out.println("openinggg class 3");
	}
  @Test(priority =10)
  public void title3() {
	  System.out.println("Title class 3");
  }
  @Test(priority =11)
  public void edit3() {
	  System.out.println("editing class 3");
  }
  @AfterClass
  public void close3() {
	  System.out.println("closing class3 ");
	  
  }
  
}
