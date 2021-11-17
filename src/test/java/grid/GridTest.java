package grid;

import extension.SeleniumTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SeleniumTest
class GridTest {
	
	@Test
	void testGrid(WebDriver driver, URL url) {
		 driver.get(url + "/grid/index.html");
		 var td = driver.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td"));
		 
		 assertThat(td)
	         .extracting(WebElement::getText)
	         .containsExactlyInAnyOrder("4","5","6");
	
	}
}
