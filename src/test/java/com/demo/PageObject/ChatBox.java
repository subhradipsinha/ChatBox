package com.demo.PageObject;

import demo.ScreenShot;
import demo.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ChatBox extends TestBase {

    @Test
    public void Chat_box() throws Exception {
    TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("Comments"));
    TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
    ScreenShot.Study_gallery(driver,"Comments");
    Thread.sleep(5000);

    TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("Comments1"));
    TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
    ScreenShot.Study_gallery(driver,"Comments1");
    Thread.sleep(5000);

    TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("TestComments"));
    TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
    ScreenShot.Study_gallery(driver,"TestComments");
    Thread.sleep(5000);

    TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("Comments2"));
    TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
    ScreenShot.Study_gallery(driver,"Comments2");
    Thread.sleep(5000);

        TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("TestComments2"));
        TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
        ScreenShot.Study_gallery(driver,"TestComments2");
        Thread.sleep(5000);

    TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("Comments3"));
    TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
    ScreenShot.Study_gallery(driver,"Comments3");
    Thread.sleep(5000);

        TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("TestComments3"));
        TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
        ScreenShot.Study_gallery(driver,"TestComments3");
        Thread.sleep(5000);

    TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("Comments4"));
    TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
    ScreenShot.Study_gallery(driver,"Comments4");
    Thread.sleep(5000);

    TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("TestComments1"));
    TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
    ScreenShot.Study_gallery(driver,"TestComments1");
        Thread.sleep(5000);

    TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("Comments5"));
    TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
    ScreenShot.Study_gallery(driver,"Comments5");
    Thread.sleep(5000);

    TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("Comments6"));
    TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
    ScreenShot.Study_gallery(driver,"Comments6");
    Thread.sleep(5000);

    TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("Comments7"));
    TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
    ScreenShot.Study_gallery(driver,"Comments7");
    Thread.sleep(5000);

    TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("Comments8"));
    TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
    ScreenShot.Study_gallery(driver,"Comments8");
    Thread.sleep(5000);

    TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("Comments9"));
    TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
    ScreenShot.Study_gallery(driver,"Comments9");
    Thread.sleep(5000);

    TestBase.byXpath("TestBox").sendKeys(TestData.getProperty("Comments10"));
    TestBase.byXpath("TestBox").sendKeys(Keys.ENTER);
    ScreenShot.Study_gallery(driver,"Comments10");
    Thread.sleep(5000);
    }
}
