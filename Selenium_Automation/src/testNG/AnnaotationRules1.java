package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnaotationRules1 {
	
  @Test
  public void f() {
	  System.out.println("@Test f");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" @AfterMethod");
  }
  
  @Test
  public void abc() {
	  System.out.println("@Test abc");
	  System.out.println();
	  System.out.println();
	  System.out.println();
  }
  

}
