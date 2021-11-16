package htmlIntro;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.github.dockerjava.api.model.Driver;

import extension.SeleniumTest;

@SeleniumTest
public class HtmlIntroTest {
	@Test
	void testLocators(WebDriver wd, URL url) {
		wd.get(url + "/htmlIntro/");
		var headerOneElement = wd.findElement(By.id("page-header"));
	}
}
