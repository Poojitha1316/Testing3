package Utilities;

import BaseTest.BaseTestClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Utility extends BaseTestClass {

    // Method to capture a screenshot
    public static void takingScreenshot() throws IOException {
        // Get the current date and time for the screenshot filename
        Date currentdate = new Date();
        String screenShotFileName = currentdate.toString().replace(" ","-").replace(":","-");
        System.out.println(screenShotFileName);

        // Capture the screenshot and save it to the specified directory
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile,new File("./ScreenShots/"+screenShotFileName+".png"));
        System.out.println("Successfully taken screenshot");
    }
}
