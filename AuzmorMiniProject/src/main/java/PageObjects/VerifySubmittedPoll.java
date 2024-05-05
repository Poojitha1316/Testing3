package PageObjects;

import BaseTest.BaseTestClass;
import Utilities.ReadProperties;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

// Page Object class for verifying the submitted poll
public class VerifySubmittedPoll extends BaseTestClass {

    // WebElement for verifying the submitted post
    @FindBy(xpath = "(//*[@class='flex items-start gap-4'])[1]")
    WebElement verifyPost;

    // Constructor initializing PageFactory
    public VerifySubmittedPoll(){
        PageFactory.initElements(driver,this);
    }

    // Method to verify the submitted poll result
    public void verifyResult() throws Exception {
        String actualPost = null;
        try {
            actualPost = ReadProperties.getPropertyy("question");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Retrieve the actual post text from the UI
        String expectedPost= verifyPost.getText();

        // Assert that the actual post matches the expected post
        Assert.assertEquals(actualPost,expectedPost,"Unsuccessfully verified");
        System.out.println("Successfully verified");
//        System.out.println(actualPost);
//        System.out.println(expectedPost);

    }
}
