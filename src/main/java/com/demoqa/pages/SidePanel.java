package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {


  public SidePanel(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//span[.='Alerts']")
  WebElement alerts;

  public AlertPage selectAlerts() {
    clickWithJs(alerts,0,200);
    return new AlertPage(driver);
  }
  @FindBy(xpath = "//span[.='Browser Windows']")
  WebElement browserWindows;
  public BrowserWindowsPage selectBrowserWindows() {
    clickWithJs(browserWindows,0,300);
    return  new BrowserWindowsPage(driver);

  }
  @FindBy(xpath = "//span[.='Select Menu']")
  WebElement selectMenu;

  public SelectPage getSelect() {
    clickWithJs(selectMenu,01,700);
    return  new SelectPage(driver);
  }

  @FindBy(xpath = "//span[.='Practice Form']")
  WebElement practiceForm;
  public PracticeFormPage selectPracticeForm() {
    click(practiceForm);
    return new PracticeFormPage(driver);
  }
}
