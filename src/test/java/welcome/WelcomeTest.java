package welcome;

import extension.SeleniumTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SeleniumTest
public class WelcomeTest {

    @Test
    void testWelcomeText (WebDriver driver, URL url) {
        driver.get(url + "/welcome/index.html");

        var name = "Petra";
        driver.findElement(By.id("name-input")).sendKeys(name);
        driver.findElement(By.id("welcome-button")).click();
        
        
        var welcomeText = driver.findElement(By.id("welcome-div")).getText();
        assertEquals("Hello "+name+"!", welcomeText);

    }
}