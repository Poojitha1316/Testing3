package PageObjects;

import BaseTest.BaseTestClass;
import Utilities.ReadProperties;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

// Page Object class for the Poll Creation page
public class PollCreation extends BaseTestClass {

    // WebElements on the Poll Creation page
    @FindBy(xpath = "//*[@data-testid='createpoll-que']")
    WebElement enterOnAskAQuestion;

    @FindBy(xpath = "//*[@data-testid='createpoll-option1']")
    WebElement enterOption1;

    @FindBy(xpath = "//*[@data-testid='createpoll-option2']")
    WebElement enterOption2;

    @FindBy(xpath = "//*[@data-testid='createpoll-duration-dropdown']")
    WebElement clickPollDurationDropDown;

    @FindBy(xpath = "//*[@data-testid='createpoll-duration-{3day}']")
    WebElement selectSpecificPollDuration;

    @FindBy(xpath = "//*[@data-testid='createpoll-next']")
    WebElement clickOnNext;

    @FindBy(xpath = "//*[@data-testid='createpoll-que-error']")
    WebElement errorMessage;

    @FindBy(xpath = "//*[@data-testid='createpoll-option2-error']")
    WebElement option2Error;

    @FindBy(xpath = "//*[@data-testid='feed-submitpost']")
    WebElement clickSubmitPost;

    // Constructor initializing PageFactory
    public PollCreation(){
        PageFactory.initElements(driver,this);
    }

    // Method to perform the poll creation process
    public void performPollCreationProcess() throws Exception{

        // Enter the poll question and options
        enterOnAskAQuestion.sendKeys(question);
        enterOption1.sendKeys(option1);
        enterOption2.sendKeys(option2);

        // Click on the Poll Duration dropdown and select a specific duration
        clickPollDurationDropDown.click();
        selectSpecificPollDuration.click();

        // Click on the Next button, then on the Submit Post button
        clickOnNext.click();
        clickSubmitPost.click();
    }

    // Method to handle validation when submitting a poll without a valid question
    public void validEmptyQuestion(){
        clickOnNext.click();
        String defaultMessageText = errorMessage.getText();
        System.out.println("Error message when trying to submit poll without valid question: "+defaultMessageText);
    }

    // Method to handle validation when submitting a poll with valid characters in the question
    public void validCharacterInQuestion() {
        try{
            enterOnAskAQuestion.sendKeys(minimumQuestion);
            clickOnNext.click();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
//        Assert.assertEquals(minimumQuestion,question);
    }

    // Method to handle validation when submitting a poll with insufficient options
    public void isSufficicent() {
        enterOnAskAQuestion.sendKeys(question);
        enterOption1.sendKeys(option1);
        clickOnNext.click();
        String option2ErrorText = option2Error.getText();
        System.out.println("Error message when trying to submit poll with insufficient options: "+option2ErrorText);
    }
}
