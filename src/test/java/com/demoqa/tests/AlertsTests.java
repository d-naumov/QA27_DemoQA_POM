package com.demoqa.tests;

import com.demoqa.pages.AlertPage;
import com.demoqa.pages.Homepage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase {

  @BeforeMethod
  public void precondition() {
    new Homepage(driver).confirmCookies().getAlertFrameWindows();
    new SidePanel(driver).selectAlerts();
  }

  @Test
  public void acceptAlertTest() {
    new AlertPage(driver).acceptAlert();
  }

  @Test
  public void alertWaitTest() {
    new AlertPage(driver).clickByAlertWithTimer();
  }

  @Test
  public void selectResult() {
    new AlertPage(driver).selectResult("Cancel").verifyResult("Cancel");
  }

  @Test
  public void sendMassageToAlert() {
    new AlertPage(driver).sendMassageToAlert("Hello World!").verifyMassage("Hello World!");
  }

}
