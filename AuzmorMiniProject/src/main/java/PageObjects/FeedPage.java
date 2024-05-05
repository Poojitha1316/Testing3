package PageObjects;

import BaseTest.BaseTestClass;
import Utilities.ReadProperties;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Page Object class for the Feed page
public class FeedPage extends BaseTestClass {

    // WebElements on the Feed page
    @FindBy(xpath = "//*[@data-testid='activityfeed-whatsonurmind']")
    WebElement clickOnWhatsOnUrMind;

    @FindBy(xpath = "//*[@data-placeholder='What’s on your mind?']")
    WebElement enterSomeText;

    @FindBy(xpath = "//*[@data-testid='feed-createpost-polls']")
    WebElement clickOnPoll;

    // Constructor initializing PageFactory
    public FeedPage(){
        PageFactory.initElements(driver,this);
    }

    // Method to perform actions on the Feed page
    public void feedDetails() throws Exception {
        // Retrieve text for the Feed page from configuration properties
        String randomText = RandomStringUtils.randomAlphabetic(5);

//        String enterText = ReadProperties.getPropertyy("whatsonurmind");
        //Clicking and sending keys using WebElement
        clickOnWhatsOnUrMind.click();
        enterSomeText.sendKeys(randomText);
        clickOnPoll.click();
//        textOnSumbit = enterSomeText.getText();

    }
}
