package com.demoqa.tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {
  WebDriver driver;
  @BeforeSuite
  public void init() {
    driver = new ChromeDriver();
    driver.get("https://demoqa.com");

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  }
  @AfterMethod(enabled = false)
  public void  tearDown(){
    driver.quit();
  }


}
