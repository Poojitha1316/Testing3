import BaseTest.BaseTestClass;
import PageObjects.FeedPage;
import PageObjects.LoginPage;
import PageObjects.PollCreation;
import PageObjects.VerifySubmittedPoll;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Test class for the feed post process
public class FeedPostProcessTest extends BaseTestClass {
    @BeforeMethod
    public void performLoginAndNavigateToFeed() throws Exception {
        initializeWebDriverAndOpenBrowser();
        LoginPage loginPage = new LoginPage();
        loginPage.loginDetails();
        FeedPage feedPage = new FeedPage();
        feedPage.feedDetails();
    }
    // Test method to perform the feed post process
    @Test
    public void testFeedPostProcess() throws Exception {
        PollCreation pollCreation= new PollCreation();
        pollCreation.performPollCreationProcess();
    }
    // Method to perform actions after each test method
    @AfterMethod
    public void verifySubmittedPoll() throws Exception {
        VerifySubmittedPoll verifySubmittedPoll = new VerifySubmittedPoll();
        verifySubmittedPoll.verifyResult();
        driver.quit();
    }
}
