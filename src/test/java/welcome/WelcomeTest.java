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
        driver.get(url + "welcome");

        var headerOne = driver.findElement(By.id("page-header")).getText();
        assertEquals("Intro html format", headerOne);

        var emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("example@example.com");

        var link = driver.findElement(By.partialLinkText("page"));
        assertEquals("Training360 page", link.getText());
        
        var headerByClass = driver.findElement(By.className("red"));
        assertEquals("Intro html format", headerByClass.getText());
        
        var headerTwo = driver.findElement(By.cssSelector("body > h1:nth-child(3)"));
        assertEquals("Header two", headerTwo.getText());
        
        var linkByTagName = driver.findElement(By.tagName("a"));
        assertEquals("Training360 page", linkByTagName.getText());
        
        var headerByXPath = driver.findElement(By.xpath("/html/body/h1[2]"));
        assertEquals("Header two", headerByXPath.getText());

    }
}