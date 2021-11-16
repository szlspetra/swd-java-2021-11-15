package grid;

import extension.SeleniumTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SeleniumTest
class GridTest {
	void testGrid(WebDriver driver, URL url) {
		 driver.get(url + "/welcome");
	}
}
