package pack_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calculator_Automation {

	WebDriver driver = new FirefoxDriver();
	
	
	  @BeforeTest
	   public void app_launch() throws Exception{
		
		   
		   //System.setProperty("webdriver.ie.driver","C://ECLIPSE_WORKSPACE//IEDriverServer.exe");
		  // driver=new InternetExplorerDriver();
		   
		   System.out.println("The WebDriver IS SHOWN HERE::"+driver);
	  
	    driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	    
	   
	
//Launch websites
//driver.navigate().to();
	
	//    C:\ECLIPSE_WORKSPACE\Java_Maven
	
	    String html_path="C:\\Users\\IBM_ADMIN\\.jenkins\\workspace\\GitHub_Demo\\JavaProject_Calculator\\";
driver.get(html_path+"Calculator1.html");

	   // driver.get("Calculator1.html");
// https://swarnasetu-beta.mybluemix.net/
//Maximize the browser
driver.manage().window().maximize();
	  }


	  
	  @Test
	  public void cal_add() throws Exception
	  {
		  
		  Thread.sleep(2000);
		    driver.findElement(By.xpath(".//*[@value='4']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath(".//*[@value='+']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath(".//*[@value='9']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath(".//*[@value='=']")).click();
		    Thread.sleep(2000);
	  }
}
