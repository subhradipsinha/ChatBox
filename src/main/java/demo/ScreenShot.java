package demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenShot {
    public static void Study_gallery(WebDriver driver, String screenshotName)
    {
        try {
            TakesScreenshot scrShot =((TakesScreenshot)driver);
            File source = scrShot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./ScreenShot/"+screenshotName+".png"));
            System.out.println("Screenshot Done");
        } catch (Exception e)
        {
            System.out.println("Exception while taking screenshot"+ e.getMessage());
        }
    }
}

