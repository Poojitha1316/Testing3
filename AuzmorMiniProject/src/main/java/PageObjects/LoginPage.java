package PageObjects;

import BaseTest.BaseTestClass;
import Utilities.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Page Object class for the Login page
public class LoginPage extends BaseTestClass {

    // WebElements on the Login page
    @FindBy(xpath = "//*[@data-testid='signin-email']")
    WebElement enterEmail;

    @FindBy(xpath = "//*[@data-testid='signin-password']")
    WebElement enterPassword;

    @FindBy(xpath = "//*[@data-testid='signin-btn']")
    WebElement clickSigninButton;

    // Constructor initializing PageFactory
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    // Method to enter login details and perform login
    public void loginDetails() throws Exception {
        // Retrieve username and password from configuration properties
        String email = ReadProperties.getPropertyy("username");
        String password = ReadProperties.getPropertyy("password");

        // Enter username and password in the respective fields
        enterEmail.sendKeys(email);
        enterPassword.sendKeys(password);

        // Click the Sign In button
        clickSigninButton.click();
    }
}
