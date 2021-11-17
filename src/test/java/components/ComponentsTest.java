package components;
import extension.SeleniumTest;
import lombok.extern.slf4j.Slf4j;
import simple.SimpleFixtureTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
@SeleniumTest
public class ComponentsTest {
	@Test
	  void testJavaScript(WebDriver driver, URL url) throws IOException {
	        driver.get(url + "/components");
	        
	        //Lenyíló lista
	        var select = new Select(driver.findElement(By.cssSelector("#dropdown")));  
	        select.getOptions().forEach(e -> log.debug(e.getText()));
	        //select.getOptions().forEach(e -> System.out.println(e.getText()));
	        select.selectByIndex(2);
	        assertEquals("Option 3", null);
	    }
}
