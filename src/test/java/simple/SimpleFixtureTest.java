package simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

//@Slf4j
public class SimpleFixtureTest {

	static final Logger log = LoggerFactory.getLogger(SimpleFixtureTest.class);
	
	WebDriver wd;

	@BeforeAll
	static void initDriverManager() {
		WebDriverManager.chromedriver().setup();
	}
	
	@BeforeEach
	void initDriver() {
		var options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",  List.of("enable-automation"));
		wd = new ChromeDriver(options);
	}
	
	@Test
	void testHeader() {
		wd.get("https://szlspetra.github.io/swd-java-2021-11-15/");
		WebElement header = wd.findElement(By.tagName("h1"));
		assertEquals("Welcome!", header.getText());
	}
	
	@Test
	void testHeaderWithErasure() {
		var url = "https://szlspetra.github.io/swd-java-2021-11-15/";
		wd.get(url);
		WebElement header = wd.findElement(By.tagName("h1"));
		assertEquals("Welcome!", header.getText());
		log.info(header.getText());
	}
	
	@AfterEach
	void closeDriver() {
		wd.quit();
	}
}
