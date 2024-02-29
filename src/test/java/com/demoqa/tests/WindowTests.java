package com.demoqa.tests;

import com.demoqa.pages.BrowserWindowsPage;
import com.demoqa.pages.Homepage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowTests extends TestBase{

  Homepage homepage;
  SidePanel sidePanel;
  BrowserWindowsPage browserWindowsPage;

  @BeforeMethod
  public void precondition(){
    homepage = new Homepage(driver);
    sidePanel = new SidePanel(driver);
    browserWindowsPage = new BrowserWindowsPage(driver);

    homepage.confirmCookies().getAlertFrameWindows();
    sidePanel.selectBrowserWindows();

  }
  @Test
  public void switchToNewTabTest(){
    browserWindowsPage.switchToNextTab(1).varifyTextFromNewTab("This is a sample page");

  }

}
