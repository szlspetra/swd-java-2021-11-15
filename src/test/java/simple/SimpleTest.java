package simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleTest {
	//Teszt met�dus = teszt eset
	
	@Test
	@DisplayName ("Header is correct")
	void testHeaderIsCorrect() {
		//Given
		int a=5;
		int b=6;
		//When
		int c = a+b;
		//Then
		assertEquals(11, c);
	}
	
	@Test
	@DisplayName ("Header")
	void testHeadert() {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.training360.com/");
		wd.quit();
	}
	
	
	
}
