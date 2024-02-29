package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {


  public Homepage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//h5[.='Alerts, Frame & Windows']")
  WebElement alertsFrameWindows;

  public SidePanel getAlertFrameWindows() {
    clickWithJs(alertsFrameWindows,0,300);
    return new SidePanel(driver);
  }

  @FindBy(className = "fc-button-label")
  WebElement consent;

  public  Homepage confirmCookies(){
    click(consent);
    return this;
  }

  @FindBy(xpath = "//h5[.='Widgets']")
  WebElement widgets;
  public SidePanel getWidgets() {
    clickWithJs(widgets,0,300);
    return new SidePanel(driver);
  }
  @FindBy(xpath = "//h5[.='Forms']")
  WebElement forms;
  public SidePanel getForms() {
    clickWithJs(forms,0,300);
    return new SidePanel(driver);
  }
}
