package lt.jolanta.BTNproject.pom.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class
TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();

    }

    private void takeScreenshot() {

        try {
            TakesScreenshot screenshot = (TakesScreenshot) Driver.getDriver();
            File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);

            String directory = "./screenshots/";
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_SSS");

            File screenshotFinalFile = new File(String.format(directory + dateTime.format(formatter) + "screenshot_" + UUID.randomUUID() + ".jpg"));

            FileUtils.copyFile(screenshotFile, screenshotFinalFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
