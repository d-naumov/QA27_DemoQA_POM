package com.demoqa.pages;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BrowserWindowsPage extends BasePage {


  public BrowserWindowsPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(id = "tabButton")
  WebElement tabButton;

  public BrowserWindowsPage switchToNextTab(int index) {
    clickWithJs(tabButton, 0, 200);
    List<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(index));

    return this;
  }

  @FindBy(id = "sampleHeading")
  WebElement sampleHeading;

  public BrowserWindowsPage varifyTextFromNewTab(String text) {

    Assert.assertTrue(shouldHaveText(sampleHeading, text, 10));

    return this;
  }


}
