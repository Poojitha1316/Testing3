import BaseTest.BaseTestClass;
import PageObjects.FeedPage;
import PageObjects.LoginPage;
import PageObjects.PollCreation;
import Utilities.Utility;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class QuestionOptionsVerificationTest extends BaseTestClass {
    // Method to perform actions before each test method
    @BeforeMethod
    public void loginAndNavigateToFeed() throws Exception {
        initializeWebDriverAndOpenBrowser();
        LoginPage loginPage = new LoginPage();
        loginPage.loginDetails();
        FeedPage feedPage = new FeedPage();
        feedPage.feedDetails();
    }

    // Test method to verify the submission with empty and character questions
    @Test
    public void testEmptyAndCharacterQuestions() {
        PollCreation pollCreation = new PollCreation();
        pollCreation.validEmptyQuestion();
        PollCreation pollCreation1 = new PollCreation();
        pollCreation1.validCharacterInQuestion();
    }

    // Test method to verify the submission with insufficient options
    @Test
    public void testInsufficientOptions() {
        PollCreation pollCreation = new PollCreation();
        pollCreation.isSufficicent();
    }

    // Method to perform actions after each test method
    @AfterMethod
    public void captureScreenshotOnFailure(ITestResult result) throws IOException {
        Utility.takingScreenshot();
        driver.quit();
    }
}
