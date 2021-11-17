package wizard;



import extension.SeleniumTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.SocketException;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SeleniumTest
public class WizardTest {


    @Test
    void wizardTestNavigate (WebDriver driver, URL url) {
    	
    	try {
    		driver.get(url + "/wizard/index.html");
    	}
        catch (Exception e) {
			System.out.println("e");
		}


        driver.findElement(By.cssSelector("body > a")).click();
        driver.findElement(By.cssSelector("body > a:nth-child(3)")).click();
        driver.findElement(By.cssSelector("body > a:nth-child(5)")).click();
        
        var headerText3 = driver.findElement(By.cssSelector("body > h1")).getText();        		
        assertEquals("Wizard3", headerText3);
       
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        
        var headerText1 = driver.findElement(By.cssSelector("body > h1")).getText();        		
        assertEquals("Index", headerText1);
    }
    
    @Test
    void wizardTestRefresh (WebDriver driver, URL url) {
        driver.get(url + "/wizard/wizard2.html");
        for(int i=0; i<5;i++) {
        	driver.navigate().refresh();
        }
        assertEquals(6, driver.findElement(By.cssSelector("#counter-div")));

    }
}