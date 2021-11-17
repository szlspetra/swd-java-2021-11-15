package locations;

import extension.SeleniumTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SeleniumTest
@Tag("locations")
class LocationsTest {

    @Test
    void testCreate(WebDriver driver) {
        new LocationPage(driver)
            .go()
            .clickOnCreateLocation()
            .enterLocationData()
            .clickOnSubmitButton()
            .messageIs("Location has been created");
    }
    
    @Test 
    void editLocation(WebDriver driver) {
    	new LocationPage(driver)
    		.go()
    		.clickOnFirstEditButton()
    		.checkNameInputField();
    }


}