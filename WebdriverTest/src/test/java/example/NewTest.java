package example;

import org.testng.annotations.Test;


public class NewTest {
  @Test
  public void validate() {
	  System.out.println("Current Test");
  }
  @Test
  public void verify() {
	  
	  System.out.println("Before Test");
  }

  @Test
  public void review() {
	  
	  System.out.println("After Test");
  }

}
