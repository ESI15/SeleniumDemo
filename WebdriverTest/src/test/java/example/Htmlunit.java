package example;

import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Htmlunit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a new instance of the HTML unit driver
        
        WebDriver driver = new HtmlUnitDriver(true);
        System.out.println(HttpClientBuilder.class.getProtectionDomain().getCodeSource().getLocation());
        driver.get("http://www.google.com");         
        WebElement element = driver.findElement(By.name("q"));	
       // element.sendKeys("Guru99");					
        element.submit();         			
        System.out.println("Page title is: " + driver.getTitle());	
        driver.quit();
	}

}
