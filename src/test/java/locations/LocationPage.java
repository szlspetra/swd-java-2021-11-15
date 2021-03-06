package locations;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationPage {

    private WebDriver driver;

    @FindBy(linkText = "Create location")
    private WebElement createLink;

    @FindBy(id = "location-name")
    private WebElement nameInput;

    @FindBy(id = "location-coords")
    private WebElement coordsInput;

    @FindBy(css = "#location-form input.btn.btn-primary")
    private WebElement submitButton;

    @FindBy(css = "#message-div")
    private WebElement messageDiv;

    @FindBy(css = "#locations-table-tbody > tr:nth-child(1) > td:nth-child(6) > button.btn.btn-link")
    private WebElement firstEditButton;
    
    @FindBy(id = "update-location-name")
    private WebElement nameInputField;

    public LocationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LocationPage go() {
        driver.get("http://localhost:8080");
        return this;
    }

    public LocationPage clickOnCreateLocation() {
        createLink.click();
        return this;
    }

    public LocationPage enterLocationData(String name, String coords) {
        nameInput.sendKeys(name);
        coordsInput.sendKeys(coords);
        return this;
    }

    public LocationPage enterLocationData() {
        enterLocationData("Home", "1,1");
        return this;
    }

    public LocationPage clickOnSubmitButton() {
        submitButton.click();
        return this;
    }

    public LocationPage messageIs(String expectedMessage) {
        var message = messageDiv.getText();
        assertEquals(expectedMessage, message);
        return this;
    }
    
    public LocationPage clickOnFirstEditButton() {
        firstEditButton.click();
        return this;
    }
    

    public LocationPage checkNameInputField() {
       	if(nameInputField.isDisplayed()) {
       		return this;
       	}
       	else return null;
        
    }
}
