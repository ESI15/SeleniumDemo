package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class NewTest2 {
  @Test
  public void actualtitle() throws InterruptedException {
	// declaration and instantiation of objects/variables
	  //okkkkk
		
			System.setProperty("webdriver.ie.driver", "C:/Users/562037/Downloads/IEDriverServer/IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			
	        String baseUrl = "http://newtours.demoaut.com";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";
	        
	     // launch Firefox and direct it to the Base URL
	         driver.get(baseUrl);
	         
	         
	      // maximize the browser window
	        driver.manage().window().maximize();

	         
	     // get the actual value of the title
	        actualTitle = driver.getTitle();
	        
	        /*
	         * compare the actual title of the page witht the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	      //close Firefox
	        driver.close();
	        
	        
  }
}
